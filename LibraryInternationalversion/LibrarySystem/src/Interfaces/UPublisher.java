/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import Processes.Publisher;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 *
 * @author long
 */
public class UPublisher extends javax.swing.JFrame {

    /**
     * Creates new form Publisher
     */
    public Publisher pubtbl = new Publisher();
    
    public UPublisher() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        idpubtxt = new javax.swing.JTextField();
        phoneno = new javax.swing.JTextField();
        inputbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/pass-card.png"))); // NOI18N
        jLabel1.setText("PUBLISHER");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("PHONENUMBER:");

        idpubtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idpubtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idpubtxtActionPerformed(evt);
            }
        });

        phoneno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        inputbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        inputbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        inputbtn.setText("UPDATE");
        inputbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inputbtnMouseClicked(evt);
            }
        });
        inputbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputbtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("ADDRESS:");

        addresstxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(idpubtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(inputbtn)
                .addGap(122, 122, 122))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idpubtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(inputbtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idpubtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idpubtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idpubtxtActionPerformed

    private void inputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputbtnActionPerformed

    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void inputbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputbtnMouseClicked
        // TODO add your handling code here:
            if (this.idpubtxt.getText().length() == 0 || this.addresstxt.getText().length() == 0 || this.phoneno.getText().length() == 0) 
            {
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS DILWEED", "NOTATION", 1);
                return;
            }
         
            else 
            {
                if (this.idpubtxt.getText().length() != 10)
                {
                    JOptionPane.showMessageDialog(null, "10 CHARACTERS YOU IDIOT SANDWICH", "NOTATION", 1);
                    return;
                }
                
                if (this.addresstxt.getText().length() > 250)
                {
                    JOptionPane.showMessageDialog(null, "YOU ARE IDIOT MORTY", "NOTATION", 1);
                    return;
                }
                
                if (this.phoneno.getText().length() != 10 && this.phoneno.getText() == "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*+_{}:()/;,.'")
                {
                    JOptionPane.showMessageDialog(null, "10 NUMBERS OR GET THE F12 OUT OF HERE B1TCH", "NOTATION", 1);
                }
                      
                else         
                {        
                    try
                    {
                      pubtbl.UpdatePubtoSQL(this.idpubtxt.getText(), this.addresstxt.getText(), this.phoneno.getText());
                      Bookinfo a = new Bookinfo();
                      a.setVisible(true);
                      a.ClearDatapub();
                      a.ShowDatapub();
                      JOptionPane.showMessageDialog(null, "Cập nhật thành công", "Thông báo", 1);
                      this.dispose();
                      
                    }
                    catch (SQLException e)
                    {       
                        JOptionPane.showMessageDialog(null, "Lỗi cơ sở dữ liệu", "Thông báo", 1);   
                    }
                }
            }    
    }//GEN-LAST:event_inputbtnMouseClicked

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
            java.util.logging.Logger.getLogger(UPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UPublisher.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UPublisher().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField addresstxt;
    public javax.swing.JTextField idpubtxt;
    private javax.swing.JButton inputbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField phoneno;
    // End of variables declaration//GEN-END:variables
}
