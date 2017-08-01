/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guesing.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Sam
 */
public class GuesingGame extends JFrame {
        int randomNum, guessNum;
        private JButton btn;
        private JLabel promptlbl, resultlbl,randomlbl;
        private JTextField txtfield;
        
        public GuesingGame(){
            setTitle("guesing game");
            Toolkit tool= getToolkit();
            Dimension size= tool.getScreenSize();
            setLocation(size.width/3- getWidth()/2, size.height/2-getHeight()/2);
           
            getContentPane().setBackground(Color.CYAN);
            
            promptlbl = new JLabel("Enter a random number between 1-10");
            add(promptlbl);
            
            resultlbl = new JLabel();
            randomlbl= new JLabel();
            txtfield =new JTextField();
            txtfield.setPreferredSize(new Dimension(80, 20));
            add(txtfield);
            
            btn= new JButton("Guess!!!");
            btn.addActionListener(new ActionListener(){
            
            public void actionPerformed(ActionEvent ee){
                
                randomNum= (int)(Math.random() *10+1);
            
                try {
                    
                    
                     guessNum =(int) Double.parseDouble(txtfield.getText());
                    if(guessNum== randomNum){
                    resultlbl.setText("you worn!!");
                    
                    
                    }else if(guessNum != randomNum){
                    resultlbl.setText("Soryy you lost!!");
                    randomlbl.setText("expected random number was " + randomNum );
                    
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e.getMessage()+ " invalid entry", "number not int", JOptionPane.ERROR_MESSAGE);
                }
            }
            
            
            });
            
            add(btn);
            
            add(resultlbl);
            
            add(randomlbl);
             setSize(400,200);
            setLayout(new FlowLayout());
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    
    public static void main(String[] args) {
        new GuesingGame();
    }
    
}
