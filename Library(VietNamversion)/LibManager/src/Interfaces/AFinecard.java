/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import Processes.Finecard;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;

/**
 *
 * @author long
 */
public class AFinecard extends javax.swing.JFrame {

    /**
     * Creates new form AFinecard
     */
    private final Finecard finecardtbl = new Finecard();
    
    public AFinecard() {
        initComponents();
        this.autoid();
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
        idfinecardtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        contenttxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        costtxt = new javax.swing.JTextField();
        inputbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/ticket1.png"))); // NOI18N
        jLabel1.setText("Nhập thẻ phạt");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã thẻ phạt:");

        idfinecardtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Nội dung:");

        contenttxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Phí phạt:");

        costtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        inputbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        inputbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        inputbtn.setText("Nhập");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(idfinecardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contenttxt))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(inputbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(idfinecardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addComponent(contenttxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(costtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputbtn)
                .addContainerGap())
        );

        jLabel2.getAccessibleContext().setAccessibleName("idfinecardlbl");
        idfinecardtxt.getAccessibleContext().setAccessibleName("idfinecardtxt");
        jLabel3.getAccessibleContext().setAccessibleName("Contentlbl");
        contenttxt.getAccessibleContext().setAccessibleName("contenttxt");
        jLabel4.getAccessibleContext().setAccessibleName("Costlbl");
        costtxt.getAccessibleContext().setAccessibleName("costtxt");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());  
    }
    
     public void autoid()
    {
       java.util.Random r = new java.util.Random();
       int start = 100000;
       int end = 999999;
       int res = r.nextInt(end - start) + start;
      
       this.idfinecardtxt.setText(String.valueOf(res));
    }
   
   
    
    private void inputbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputbtnActionPerformed

    private void inputbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inputbtnMouseClicked
        // TODO add your handling code here:
            if (contenttxt.getText().length() == 0 || idfinecardtxt.getText().length() == 0 || costtxt.getText().length() == 0) 
            {
                JOptionPane.showMessageDialog(null, "Mời bạn nhập đẩy đủ tất cả thông tin trên", "Thông báo", 1);
                return;
            }
         
            else 
            {
                if (idfinecardtxt.getText().length() != 6)
                {
                    JOptionPane.showMessageDialog(null, "Quy định của mã phiếu là 6 ký tự", "Thông báo", 1);
                    return;
                }
                
                if (contenttxt.getText().length() > 250)
                {
                    JOptionPane.showMessageDialog(null, "Bạn đã giới hạn của trang nội dung! Mời bạn tạo thẻ phạt mới để điền thêm nội dung", "Thông báo", 1);
                    return;
                }
                      
                else         
                {        
                    try
                    {
                      finecardtbl.InsertDatatoSQL(idfinecardtxt.getText(), contenttxt.getText(), Integer.parseInt(costtxt.getText()));
                      Finecardscreen a = new Finecardscreen();
                      a.setVisible(true);
                      a.ClearData();
                      a.ShowData();
                      JOptionPane.showMessageDialog(null, "Thêm thành công!", "Thông báo", 1);
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
            java.util.logging.Logger.getLogger(AFinecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AFinecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AFinecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AFinecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AFinecard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contenttxt;
    private javax.swing.JTextField costtxt;
    public javax.swing.JTextField idfinecardtxt;
    private javax.swing.JButton inputbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
   }
