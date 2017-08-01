/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui4;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Sam
 */
public class Gui4 extends JFrame{
    private JLabel lbl1;
     private JLabel lbl2;
    private JButton btn;
    private JButton btn2;
    private static int w=0;
    private static int y=0;
    
     public Gui4(){
         setTitle("events handlin");
     
         btn= new JButton("click me");
         btn2= new JButton("me to");
         btn2.addActionListener(new ActionListener(){
        
         public void actionPerformed(ActionEvent e){
        
             if (y==0) {
              lbl2.setText("you clicked label 2 ");
                y=1;
             }else if (y==1) {
              lbl2.setText("");
               y=0;
             }
         
         }
         
         
         });
         btn.addActionListener(new ActionListener(){
        
         public void actionPerformed(ActionEvent e){
        
             if (w==0) {
              lbl1.setText("you clicked me ");
                w=1;
             }else if (w==1) {
              lbl1.setText("");
               w=0;
             }
         
         }
         
         
         });
         lbl1 = new JLabel();
         lbl2 = new JLabel();
         add(btn);
         add(lbl1);
          add(btn2);
          add(lbl2);
         
         setLayout(new FlowLayout());     
         setVisible(true);
         setSize(200, 200);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }
   
    public static void main(String[] args) {
        new Gui4();
    }
    
}
