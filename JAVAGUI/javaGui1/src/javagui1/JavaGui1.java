/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javagui1;

import java.awt.Color;
import javax.swing.JFrame;

public class JavaGui1 extends  JFrame{

    public JavaGui1(){
        setTitle("gui1");
        getContentPane().setBackground(Color.CYAN);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setSize(300, 300);
        
    
    }
    public static void main(String[] args) {
        new JavaGui1();
    }
    
}
