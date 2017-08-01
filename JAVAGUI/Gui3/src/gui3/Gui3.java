/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui3;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Sam
 */
public class Gui3 extends JFrame{

    private JLabel imgb1;
    private JLabel imgb2;
    public Gui3(){
        setTitle("imges programe");
        
         ImageIcon ic1 = new ImageIcon("27.JPG");
       imgb1= new JLabel(ic1);
        add(imgb1);
        ImageIcon ic2 = new ImageIcon("31.JPG");
        imgb2= new JLabel(ic2);
        add(imgb2);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
       
          pack();
    
    
    }
    public static void main(String[] args) {
       new Gui3();
    }
    
}
