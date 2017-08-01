/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1retrieve;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sam
 */
public class db {
   
    public static Connection contodb(){
        try {
             Connection conn=null;
            String db="JDBC:mysql://localhost/firstdb";
            conn = DriverManager.getConnection(db,"root","");
            
            
            return conn;
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
            
        }
    
    
    }
    
}
