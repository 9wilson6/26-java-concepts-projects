/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Sam
 */
public class Gui2 extends JFrame {
    private Toolkit tool;
      private JLabel lbl1;
      private JTextField txtf1;
      private JButton jbn1;
       public Gui2(){
       
           setTitle("gui2");
           setLayout(new  FlowLayout());
           lbl1= new JLabel("im a label");
           add(lbl1);
           txtf1 = new JTextField();
           txtf1.setPreferredSize(new Dimension(225, 30));
           add(txtf1);
           jbn1 = new JButton("Exit");
           jbn1.addActionListener(new ActionListener(){
           
           
           public void actionPerformed(ActionEvent e){
           tool= getToolkit();
           tool.beep();
           System.exit(0);
           
           }
          
           });
            add(jbn1);
           setVisible(true);
           setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           setSize(300,300);
           
       
       }
    public static void main(String[] args) {
        new Gui2();
    }
    
}
