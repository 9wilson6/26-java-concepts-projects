/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retrievedatatoconsole;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Sam
 */
public class dbcon {
    private static String db="JDBC:mysql://localhost/firstdb";
    private static String user="root";
    private static String pass="";
    
   public static Connection dbcon(){
       try {
           Connection conn = null;
         Class.forName("com.mysql.JDBC.Driver");
         conn = DriverManager.getConnection(db,user,pass);
         return  conn;
         
       } catch (Exception e) {
           
           System.out.println(e);
           return null;
           
       }
   
   }
}
