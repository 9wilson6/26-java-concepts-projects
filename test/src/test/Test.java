/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Sam
 */
public class Test extends JFrame {

    public Test(){
    
    this.setTitle("hello world");
        setVisible(true);
        Toolkit tool= getToolkit();
        Dimension size= tool.getScreenSize();
        setLocation((size.width - getWidth())/2, (size.height -getHeight())/2);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,350);
        JMenuBar menubar= new JMenuBar();
        JMenu file = new JMenu("file");
        //file.setBorder(new EmptyBorder(new Insets(3, 0, 3, 0)));
        menubar.add(file);
        setJMenuBar(menubar);
        this.getContentPane().setBackground(Color.red);
    }
    public static void main(String[] args) {
        new Test();
    }
    
}
