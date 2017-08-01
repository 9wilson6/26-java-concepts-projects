/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemouse.mover;

import java.awt.AWTException;
import java.awt.GridLayout;
import java.awt.Robot;
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
public class SimplemouseMover extends JFrame{
    JLabel lbl1,lbl2,lbl3,lbl4,error;
    JTextField tf1,tf2,tf3,tf4;
    JButton btn1;
    public SimplemouseMover(){
        setLayout(new GridLayout(5, 2, 5, 5));
        lbl1= new JLabel("enter number of movements");
        add(lbl1);
        
        tf1= new JTextField();
        add(tf1);
        
        lbl2= new JLabel("enter delay between movements");
        add(lbl2);
        
        tf2= new JTextField();
        add(tf2);
        
        lbl3= new JLabel(" enter screen width in pixels");
        add(lbl3);
        tf3 = new JTextField();
        add(tf3);
        
        lbl4= new JLabel("enter screen height in pixels");
        add(lbl4);
        tf4= new JTextField();
        add(tf4);
        btn1= new JButton("start");
        add(btn1);
        
        error= new JLabel("");
        add(error);
        btn1.addActionListener(new ActionListener(){
        
        public void actionPerformed(ActionEvent e){
        
        
            try {
                int num =(int) (Double.parseDouble(tf1.getText()));
                int delay=(int)(Double.parseDouble(tf2.getText()));
                int width= (int)(Double.parseDouble(tf3.getText()));
                int height= (int)(Double.parseDouble(tf4.getText()));
                
                if (num<=0 |  delay<=0 | width<=0 |height<=0) {
                    error.setText("please enter positive values");
                }else{
                error.setText("");
                try {
                Robot rob= new Robot();
                
                for (int i = 0; i < num; i++) {
                   rob.mouseMove((int)(Math.random()* width), (int)(Math.random()*height));
                 rob.delay(delay);
                }
            } catch (AWTException ex) {
                System.exit(0);
                
            }
                }
            } catch (Exception ee) {
               error.setText("numbers only");
            }
            
            
            
        }
        });
        setVisible(true);
        pack();
        setTitle("nice gane");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
   
    }
    public static void main(String[] args) {
       new SimplemouseMover();
    }
    
}
