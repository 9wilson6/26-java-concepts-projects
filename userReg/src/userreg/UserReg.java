/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userreg;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Sam
 */
public class UserReg extends JFrame{
  private JLabel lbl,empty,username,password;
  private   JButton jbn;
  private JTextField user;
  private JPasswordField pass;
    
    Connection conn;
    PreparedStatement pst;
    ResultSet rs;
    
    public UserReg(){
    
    dbcon c= new dbcon();
    conn=c.db();
        setLayout(new GridLayout(4, 2));
      lbl= new JLabel("enter logIn details:");
        add(lbl);
        empty= new JLabel("");
        add(empty);
        
        username= new JLabel("Username:");
        add(username);
        user= new JTextField();
        add(user);
        
        password = new JLabel("Password:");
        add(password);
        
        pass = new JPasswordField();
        add(pass);
        
    jbn = new JButton("logIn");
    
    jbn.addActionListener(new ActionListener(){
    
    
    
    public void actionPerformed(ActionEvent e){
        try {
            String sql="select * from Users where username=? and password=?";
            pst=conn.prepareStatement(sql);
    
            pst.setString(1, user.getText());
            pst.setString(2, pass.getText() );
            rs=pst.executeQuery();
        int    count=0;
            while (rs.next()) {
                
            count=count+1;  
            }
            if (count==1) {
                 JOptionPane.showMessageDialog(null, "successfully loged in"); 
                 home h= new home();
                 h.setVisible(true);
                 dispose();
            }else{
            JOptionPane.showMessageDialog(null, "wrong credentials","failed to log in",JOptionPane.ERROR_MESSAGE);
            user.setText("");
            pass.setText("");
            }
        } catch (Exception ee) {
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try {
                pst.close();
        rs.close();
            } catch (Exception ew) {
                
            }
        
         }
    
    
    
    }
    
    
    });
        add(jbn);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        Toolkit tool= getToolkit();
        Dimension size=tool.getScreenSize();
        setLocation(size.width/3-getWidth()/2,size.height/2-getHeight()/2 );
        setTitle("logIn");
    }
    
    public static void main(String[] args) {
    new UserReg();
    }
    
}
