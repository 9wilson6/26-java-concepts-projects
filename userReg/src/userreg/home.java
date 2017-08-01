/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userreg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Sam
 */
public class home extends JFrame{
  public home(){
      setTitle("welcome home");
      
      JButton Logout= new JButton("logout");
      Logout.addActionListener(new ActionListener(){
      
      public void actionPerformed(ActionEvent e){
      UserReg r= new UserReg();
      r.setVisible(true);
      dispose();
      
      }
      });
      add(Logout);
      setVisible(true);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(550,500);
      getContentPane().setBackground(Color.red);
      Toolkit tool= getToolkit();
        Dimension size=tool.getScreenSize();
        setLocation(size.width/3-getWidth()/2,size.height/2-getHeight()/2 );
  
  }  
}
