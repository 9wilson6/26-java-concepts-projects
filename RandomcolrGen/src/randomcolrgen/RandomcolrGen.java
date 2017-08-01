/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomcolrgen;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Sam
 */
public class RandomcolrGen extends JFrame{

    JPanel panel;
    public RandomcolrGen(){
    panel= new JPanel();
    panel.setBackground(randomColor());
    panel.addMouseListener(new MouseListener(){
        @Override
        public void mouseClicked(MouseEvent me) {
          panel.setBackground(randomColor());
        }

        @Override
        public void mousePressed(MouseEvent me) {
          
        }

        @Override
        public void mouseReleased(MouseEvent me) {
           
        }

        @Override
        public void mouseEntered(MouseEvent me) {
           
        }

        @Override
        public void mouseExited(MouseEvent me) {
            
        }
    
  
    
    
    });
        add(panel);
    }
    public Color randomColor(){
    int r =(int)(Math.random() * 256);
    int g =(int)(Math.random() * 256);
    int b =(int)(Math.random() * 256);
    return( new Color(r, g, b));
    }
    public static void main(String[] args) {
        RandomcolrGen cal= new RandomcolrGen();
     cal.setVisible(true);
     cal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     cal.getContentPane().setBackground(Color.GREEN);
     cal.setSize(350,300);
    }
    
}
