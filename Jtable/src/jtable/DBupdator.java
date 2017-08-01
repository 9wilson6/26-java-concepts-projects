/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sam
 */
public class DBupdator {
   String url="JDBC:mysql://localhost:3306/jtable";
   String user="root";
   String pass="";
    Connection conn = null;
    public Boolean add(String name, String position,String Team){
//    conn=DriverManager.getConnection();
    
    String sql ="INSERT INTO jtable(name, position, team)VALUES(?,?,?) ";
        try {
            conn=DriverManager.getConnection(url,user,pass);
            PreparedStatement pst=conn.prepareStatement(sql);
           pst.setString(1, name);
           pst.setString(2, position);
           pst.setString(3, Team);
            pst.executeQuery();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
    
    public DefaultTableModel getData(){
    DefaultTableModel df= new DefaultTableModel();
    df.addColumn("id");
    df.addColumn("name");
    df.addColumn("position");
    df.addColumn("team");
    String sql="select * from jtable";
    
        try {
           Connection conn =DriverManager.getConnection(url,user,pass);
            Statement s= conn.prepareStatement(sql);
            ResultSet  rs= s.executeQuery(sql);
            while (rs.next()) {
          String id= rs.getString(1);
          String name=rs.getString(2);
          String position = rs.getString(3);
          String team = rs.getString(4);
          
            df.addRow(new String[]{id,name,position,team});
            return df;
            }
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        return null;
    }
    
    public Boolean update(String id, String name, String position,String team){
    String sql="Update jtable set name='"+name+"','"+position+"','"+team+"' where id='"+id+"'";
    
        try {
            Connection conn= DriverManager.getConnection(url,user,pass);
            Statement s= conn.prepareStatement(sql);
            s.executeQuery(sql);
            return true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
        
        
    }
    public Boolean delete(String id){
        String sql ="delete from jtable where id='"+id+"'";
        try {
          Connection conn = DriverManager.getConnection(url,user,pass);
            Statement s= conn.prepareStatement(sql);
            s.executeQuery(sql);
            return true;
        } catch (Exception e) {
            e.getStackTrace();
        }
        return false;
        }
}
