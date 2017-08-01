/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorproj;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
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
public class Calculatorproj extends JFrame {

    JLabel results, enter1, enter2;
    JButton add, subtract, mutiply,divide;
    JTextField num1,num2;
    public Calculatorproj(){
        setLayout(new GridBagLayout());
        
        GridBagConstraints c=new GridBagConstraints();
        
        enter1=new JLabel("first num");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        add(enter1,c);
        
        num1= new JTextField(10);
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=0;
        c.gridwidth=3;
        add(num1,c);
    
        enter2= new JLabel("sec num:");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=1;
       c.gridwidth=1;
       
        add(enter2,c);
        
        num2= new JTextField(10);
        c.fill= GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=1;
        c.gridwidth=3;
        add(num2,c);
        
        add= new JButton("+");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=2;
         c.gridwidth=1;
        add(add,c);
        
        subtract= new JButton("-");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=1;
        c.gridy=2;
        
        add(subtract,c);
        
        mutiply= new JButton("*");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=2;
        c.gridy=2;
        
        add(mutiply,c);
        divide= new JButton("/");
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=3;
        c.gridy=2;
       
        add(divide,c);
        
        results= new JLabel();
        c.fill= GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=4;
        c.gridwidth=4;
        add(results,c);
        add.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
                    double number1, number2;
            try {
               number1= Double.parseDouble(num1.getText());
                number2= Double.parseDouble(num2.getText());
                 Double result= number1 + number2;
                 results.setText(number1 + " + "+ number2 + "="+ result);
                 results.setForeground(Color.blue);
           } catch (NumberFormatException q) {
                
              results.setText("just numbers for input");
              results.setForeground(Color.red);
            }
        
        
        }
        
        }); 
        
        
        subtract.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
                    double number1, number2;
            try {
               number1= Double.parseDouble(num1.getText());
                number2= Double.parseDouble(num2.getText());
                 Double result= number1 - number2;
                 results.setText(number1 + " - "+ number2 + "="+ result);
                 results.setForeground(Color.blue);
           } catch (NumberFormatException q) {
                
              results.setText("just numbers for input");
              results.setForeground(Color.red);
            }
        
        
        }
        
        }); 
        
        mutiply.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        
                    double number1, number2;
            try {
               number1= Double.parseDouble(num1.getText());
                number2= Double.parseDouble(num2.getText());
                 Double result= number1 * number2;
                 results.setText(number1 + " * "+ number2 + "="+ result);
                 results.setForeground(Color.blue);
           } catch (NumberFormatException q) {
                
              results.setText("just numbers for input");
              results.setForeground(Color.red);
            }
        
        
        }
        
        }); 
        
        divide.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
        double number1, number2;
            try {
               number1= Double.parseDouble(num1.getText());
                number2= Double.parseDouble(num2.getText());
                 Double result= number1 / number2;
                 
                 results.setText(number1 + " / "+ number2 + "="+ result);
                    results.setForeground(Color.blue);
           } catch (NumberFormatException q) {
                
              results.setText("just numbers for input");
              results.setForeground(Color.red);
            }
       
        
        }
        
        }); 
    }
    public static void main(String[] args) {
     Calculatorproj cal= new Calculatorproj();
     cal.setVisible(true);
     cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     cal.getContentPane().setBackground(Color.GREEN);
     cal.setSize(350,300);
    }
    
}
