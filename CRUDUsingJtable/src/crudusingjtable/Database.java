/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudusingjtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Database {

    String url = "jdbc:mysql://localhost/jtable";
    String user = "root";
    String pass = "";

    public Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "failed", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public Boolean Insert(String name, String Position, String team) {

        String sql = "insert into jtable(name,position,team)VALUES('" + name + "','" + Position + "','" + team + "')";
        Connection conn = connect();
        try {
            ResultSet rs = null;
            Statement st = conn.prepareStatement(sql);
             st.executeUpdate(sql);

            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "failed", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public DefaultTableModel tbt() {
        DefaultTableModel df = new DefaultTableModel();
        df.addColumn("Id");
        df.addColumn("Name");
        df.addColumn("Position");
        df.addColumn("Team");
        String sql = "select * from jtable";
//        Connection conn=connect();
      try {
           Connection conn=connect();
          Statement st=conn.prepareStatement(sql);
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
       
        String id = rs.getString(1);
        String name = rs.getString(2);
        String position =rs.getString(3);
        String team =rs.getString(4);
         df.addRow(new String[]{id,name,position,team});
         
        }
        return df;
      } catch (Exception e) {
          JOptionPane.showMessageDialog(null, e,"failed",JOptionPane.ERROR_MESSAGE);
         
      }
  return null;
  }
  public Boolean update(String id,String name, String position,String team){
      try {
          String sql="UPDATE jtable SET name='"+name+"',position='"+position+"', team='"+team+"' WHERE id='"+id+"' ";
          Connection conn= connect();
         Statement st =conn.prepareStatement(sql);
          st.executeUpdate(sql);
           
      } catch (Exception e) {
       JOptionPane.showMessageDialog(null, e,"failed",JOptionPane.ERROR_MESSAGE);
          return false;
      }
  
  
  return true;
  }
  
  public Boolean delete(String id){
  
      try {
          String sql= "delete from jtable where id='"+id+"'";
          Connection conn= DriverManager.getConnection(url,user,pass);
          Statement st = conn.prepareStatement(sql);
           st.executeUpdate(sql);
          return true;
      } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e,"failed",JOptionPane.ERROR_MESSAGE);
          return false;
      }
  }
}
