/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaces;
import Databases.Connect;
import javax.swing.JOptionPane;
import Processes.IdentityCard;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import javax.swing.ButtonGroup;
import java.text.SimpleDateFormat;
/**
 *
 * @vauthor long
 */
public class AIdentitycard extends javax.swing.JFrame {

    /**
     * Creates new form AIdentitycard
     */
    public Connect cn = new Connect();
    private final IdentityCard Identitycardtbl = new IdentityCard();
    public AIdentitycard() {
        initComponents();
        ButtonGroup b = new ButtonGroup();
        
        
        Calendar calen = Calendar.getInstance();
        
        calen.add(Calendar.MONTH, 12);
        
        this.Expdatetxt.setDate(calen.getTime());
        
        b.add(Malechck);
        b.add(Femalechck);
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
        IDcardtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Malechck = new javax.swing.JRadioButton();
        Femalechck = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        okbutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        Expdatetxt = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(481, 408));
        setMinimumSize(new java.awt.Dimension(481, 408));
        setResizable(false);
        setSize(new java.awt.Dimension(481, 408));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/reading.png"))); // NOI18N
        jLabel1.setText("THẺ THÀNH VIÊN");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Mã thẻ thành viên:");

        IDcardtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        IDcardtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDcardtxtActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Hạn sử dụng:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Giới tính:");

        Malechck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Malechck.setText("Nam");
        Malechck.setActionCommand("");

        Femalechck.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Femalechck.setText("Nữ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Địa chỉ:");

        addresstxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        okbutton.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        okbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        okbutton.setText("Nhập");
        okbutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbuttonMouseClicked(evt);
            }
        });
        okbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbuttonActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Tuổi:");

        agetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        agetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agetxtActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Email:");

        emailtxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        Expdatetxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Malechck, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Femalechck, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(IDcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(okbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(102, 102, 102))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Expdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(IDcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Malechck)
                    .addComponent(Femalechck))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(agetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Expdatetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(okbutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.getAccessibleContext().setAccessibleName("IDcardlbl");
        IDcardtxt.getAccessibleContext().setAccessibleName("idcardtxt");
        jLabel3.getAccessibleContext().setAccessibleName("expireddatelbl");
        Malechck.getAccessibleContext().setAccessibleName("Malechck");
        Femalechck.getAccessibleContext().setAccessibleName("Femalechck");
        jLabel5.getAccessibleContext().setAccessibleName("Addresslbl");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public java.sql.Date ConverttoSqlDate(java.util.Date datejava)
    {
        return new java.sql.Date(datejava.getTime());
    }
    
    
    private void okbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbuttonActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_okbuttonActionPerformed

    private void IDcardtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDcardtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDcardtxtActionPerformed

    private void okbuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbuttonMouseClicked
        // TODO add your handling code here:
        if (IDcardtxt.getText().length() == 0 || addresstxt.getText().length() == 0 || agetxt.getText().length() == 0 || emailtxt.getText().length() == 0 || Expdatetxt.getDate() == null)         
            {
                JOptionPane.showMessageDialog(null, "Mời bạn nhập đẩy đủ tất cả thông tin trên", "Thông báo", 1);
                return;
            }
        
        
            else 
            {
                if (IDcardtxt.getText().length() != 6)
                {
                    JOptionPane.showMessageDialog(null, "Quy định của mã phiếu là 6 ký tự", "Thông báo", 1);
                    return;
                }
                
                if (Malechck.isSelected())
                {
                    Femalechck.setEnabled(false);
                }
                
                if (Femalechck.isSelected())
                {
                    Malechck.setEnabled(false);
                }    
                
                if (addresstxt.getText().length() > 100)
                {
                    JOptionPane.showMessageDialog(null, "Giới hạn của trang địa chỉ! Mời bạn làm thẻ độc giả mới", "Thông báo", 1);
                    return;
                }
                      
                else         
                {        
                    try
                    {
                      Identitycardtbl.InsertCardtoSQL(IDcardtxt.getText(), ConverttoSqlDate(Expdatetxt.getDate()), addresstxt.getText(), Malechck.isSelected(), emailtxt.getText(), Integer.parseInt(agetxt.getText()));
                    
                      JOptionPane.showMessageDialog(null, "Thêm thành công!", "Thông báo", 1);
                      Identitycard identbl = new Identitycard();
                      identbl.ClearData();
                      identbl.ShowData();
                      identbl.setVisible(true);
                      this.dispose();
                    }
                    catch (SQLException e)
                    {       
                        JOptionPane.showMessageDialog(null, "Lỗi cơ sở dữ liệu", "Thông báo", 1);   
                    }
                }   
                
            }
           
                
    }//GEN-LAST:event_okbuttonMouseClicked

    private void agetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agetxtActionPerformed

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
            java.util.logging.Logger.getLogger(AIdentitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AIdentitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AIdentitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AIdentitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AIdentitycard().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser Expdatetxt;
    public javax.swing.JRadioButton Femalechck;
    public javax.swing.JTextField IDcardtxt;
    public javax.swing.JRadioButton Malechck;
    public javax.swing.JTextField addresstxt;
    public javax.swing.JTextField agetxt;
    public javax.swing.JTextField emailtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JButton okbutton;
    // End of variables declaration//GEN-END:variables
}
