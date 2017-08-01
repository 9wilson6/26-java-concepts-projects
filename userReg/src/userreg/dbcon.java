/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userreg;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class dbcon {
    Connection conn=null;
    public Connection db(){
    String sql="JDBC:sqlite:C:\\Users\\Sam\\Documents\\NetBeansProjects\\userReg\\project1.sqlite";
    
        try {
         conn=DriverManager.getConnection(sql);
         return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    
    }
}
