/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trymysqlwithxamp;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dbcon {
    Connection conn=null;
  public Connection javadb(){
      try {
         // Class.forName("com.mysql.jdbc.Driver");
          String db="JDBC:mysql/localhost/try";
         conn=DriverManager.getConnection(db,"root","");
         return conn;
      } catch (Exception e) {
          System.out.println(e);
          return null;
      }
  
  }  
}
