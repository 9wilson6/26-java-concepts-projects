/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package populatingjtableusingarraylist;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sam
 */
public class GodisGood extends javax.swing.JFrame {

    /**
     * Creates new form GodisGood
     */
    public GodisGood() {
        initComponents();
        RowtoTable();
    }
class User{
int Id;
String firstname;
String lastname;
int age;
public User(int id,String firstname,String lastname,int age){
this.age= age;
this.Id=id;
this.firstname= firstname;
this.lastname= lastname;
}

}
 public ArrayList listUsers(){
ArrayList<User> list= new ArrayList<User>();
User ul= new User(1, "milton", "obote", 20);
User u1= new User(1, "ilton", "obot", 30);
User u2= new User(1, "milton", "obote", 50);
User u3= new User(1, "milton", "obote", 70);
User u4= new User(1, "milton", "obote", 80);
User u5= new User(1, "milton", "obote", 250);
User u6= new User(1, "milton", "obote", 40);
list.add(u1);
list.add(u2);
list.add(u3);
list.add(u4);
list.add(u5);
list.add(u6);
return list;
} 
public void RowtoTable(){
    DefaultTableModel md = (DefaultTableModel) jTable1.getModel();
ArrayList<User>list= listUsers();
Object rowd []= new Object[4];
    for (int i = 0; i < list.size(); i++) {
        
      rowd[0]=list.get(i).Id;
      rowd[1]=list.get(i).firstname;
      rowd[2]=list.get(i).lastname;
      rowd[3]=list.get(i).age;
      
      md.addRow(rowd);
    }
} 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Firstname", "last name", "Age"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 369, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GodisGood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GodisGood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GodisGood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GodisGood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GodisGood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
