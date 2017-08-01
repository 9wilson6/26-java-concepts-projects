/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtable;

import javax.swing.JFrame;

/**
 *
 * @author Sam
 */
public class Jtable extends JFrame{

    public static void main(String[] args) {
        Jtable t = new Jtable();
        t.setVisible(true);
               t.setSize(500, 450);
               t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form1 table = new form1();
        t.add(table);
        
    }
    
}
