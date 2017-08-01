/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseimages;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class dbClass {
  String Url="JDBC:sqlite:C:\\Users\\Sam\\Documents\\NetBeansProjects\\databaseImages\\images.sqlite" ;
    PreparedStatement pst =null;
    Connection conn=null;
public boolean addImg(File img, FileInputStream fis){

String sql="insert into Images(image) VALUES(?)";
    try {
     conn = DriverManager.getConnection(Url);
     pst=conn.prepareStatement(sql);
     pst.setBinaryStream(1, fis,(int)img.length());
     pst.executeUpdate();
     return true;
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return false;
    }
}

//retrieve image
public String retrieve(){

FileOutputStream fos= null;

    try {
        
        String sql= "SELECT  * FROM images";
        conn = DriverManager.getConnection(Url);
        pst=conn.prepareStatement(sql);
        ResultSet rs=null;
        rs =pst.executeQuery();
        rs.last();
        //get cell values per row
        Blob b =rs.getBlob("Image");
        String id=rs.getString("Id");
        
        //write file to our local file system
        fos= new FileOutputStream("C:\\Users\\Sam\\Desktop\\files/"+id+"");
        int len =(int) b.length();
        byte[] buf= b.getBytes(1, len);
        fos.write(buf, 0, len);
        return id;
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
        return  "-1";
    }


}
}
