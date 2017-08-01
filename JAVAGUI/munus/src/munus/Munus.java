/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munus;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Sam
 */
public class Munus extends JFrame{

    JMenuBar menubar;
    JMenu menu;
    JMenuItem menuitem;
      public Munus(){
          setTitle("jmenu");
          menubar= new JMenuBar();
          menu= new JMenu("file");
          menuitem= new JMenuItem("exite");
          menuitem.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
          
          System.exit(0);
          }
          
          });
      menu.add(menuitem);
      menubar.add(menu);
          setJMenuBar(menubar);
          setVisible(true);
          setSize(203,303);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      }
    public static void main(String[] args) {
        new Munus();
    }
    
}
