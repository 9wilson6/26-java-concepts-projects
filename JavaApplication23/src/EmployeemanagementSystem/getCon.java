/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeemanagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class getCon {
  static Connection conn=null; 
   
   public static Connection dbConn(){
 
       try {
          conn=DriverManager.getConnection("jdbc:mysqlite:C:\\Users\\Sam\\Documents\\NetBeansProjects\\EMployeePayRollManagementSystem\\Employee.sqlite");
          return conn;
       } catch (SQLException e) {
           JOptionPane.showMessageDialog(null, e);
           return null;
       }
   
   }
}
