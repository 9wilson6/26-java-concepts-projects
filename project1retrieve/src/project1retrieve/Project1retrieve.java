/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1retrieve;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Sam
 */
public class Project1retrieve {
    
    Connection conn= null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    public  Project1retrieve(){
        
     db d = new db();
      d.contodb();  
    conn=d.contodb();
    
    }
    public static void main(String[] args) {
   Project1retrieve e= new Project1retrieve();
   e.collectData();
        
  
        
    }
    public void collectData(){
        
                   
            
     
        try {
        
            String sql =" select * from firsttable where id >=? ";
            pst = conn.prepareStatement(sql);
           
              pst.setInt(1, 1);
         

            rs = pst.executeQuery();
                    
            
            while (rs.next()) {
               // String id = rs.getString("id");
                String firstname= rs.getString("firstname");
                String surname= rs.getString("surname");
                String secname= rs.getString("secondname");
                System.out.println(firstname +" "+surname+" "+ secname +"\n");
               
            }
        } catch (Exception e) {
            System.out.println(e);
        
        
    }
       
  
       
    }
}
