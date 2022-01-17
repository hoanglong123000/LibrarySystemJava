/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author long
 */

import javax.swing.JOptionPane;
import Processes.BookInfo;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import Databases.Connect;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.ButtonGroup;


public final class IBookInfo extends javax.swing.JFrame {

    /**
     * Creates new form ILoanSlip
     */
    
    public Connect cn = new Connect();
    
     private final BookInfo booktbl = new BookInfo();
   
      
    public IBookInfo() {
        initComponents();
        this.Fillidbookbox();
        this.Fillidpubbox();
        ButtonGroup b = new ButtonGroup();        
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
        jLabel3 = new javax.swing.JLabel();
        fullnametxt = new javax.swing.JTextField();
        okbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Malechck = new javax.swing.JRadioButton();
        Femalechck = new javax.swing.JRadioButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(532, 530, 530, 530));
        setMinimumSize(new java.awt.Dimension(532, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(532, 400));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("IDBOOK:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/book (1).png"))); // NOI18N
        jLabel2.setText("BOOK");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("FULL NAME:");

        fullnametxt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        fullnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnametxtActionPerformed(evt);
            }
        });

        okbtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        okbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        okbtn.setText("ENTER");
        okbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okbtnMouseClicked(evt);
            }
        });
        okbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okbtnActionPerformed(evt);
            }
        });
        okbtn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                okbtnKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("IDPUBLISHER:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("GENDER:");

        Malechck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Malechck.setText("MALE");
        Malechck.setActionCommand("");

        Femalechck.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Femalechck.setText("FEMALE");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fullnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Malechck, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Femalechck))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel2)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fullnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Malechck)
                    .addComponent(Femalechck))
                .addGap(27, 27, 27)
                .addComponent(okbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel3.getAccessibleContext().setAccessibleName("loandatelbl");
        fullnametxt.getAccessibleContext().setAccessibleName("");
        okbtn.getAccessibleContext().setAccessibleName("okbtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void Fillidbookbox()
    {
        try
        {
            cn.connectSQL();
            String sql = "SELECT Idbook FROM Book";
            PreparedStatement st = cn.conn.prepareStatement(sql);
            ResultSet ref = st.executeQuery();
            while(ref.next())
            {
                String idbook = ref.getString("Idbook");
                jComboBox1.addItem(idbook);
            }
            
        }
        catch (Exception e)
        {
            
        }
    }
    
    private void Fillidpubbox()
    {
        try
        {
            cn.connectSQL();
            String sql = "SELECT Idpublisher FROM Publisher";
            PreparedStatement st = cn.conn.prepareStatement(sql);
            ResultSet ref = st.executeQuery();
            while(ref.next())
            {
                String idpub =  ref.getString("Idpublisher");
                jComboBox2.addItem(idpub);
            }
        }
        catch (Exception e)
        {
            
        }
    }
    
    private void fullnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnametxtActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_fullnametxtActionPerformed
    
    
    
    private void okbtnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_okbtnKeyPressed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_okbtnKeyPressed

    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());  
    }
    
    
    private void okbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_okbtnActionPerformed

    private void okbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okbtnMouseClicked
        // TODO add your handling code here:
           
            if (this.fullnametxt.getText().length() == 0)  
            {
                JOptionPane.showMessageDialog(null, "PLEASE FILL ALL FIELDS", "WARNING", 1);
                return;
            }
                     
            else 
            {    
                
            }
            
                  try
                    {
                      this.booktbl.InsertBooktoSQL(jComboBox1.getSelectedItem().toString(), jComboBox2.getSelectedItem().toString(), fullnametxt.getText(), Malechck.isSelected());
                      JOptionPane.showMessageDialog(null, "ADD SUCCESFULLY!", "WARNING", 1);
                      Bookinfo l = new Bookinfo();
                      l.setVisible(true);
                      l.ClearDatabook();
                      l.ClearDatapub();
                      l.ClearDataBookInfo();
                      l.ShowDatab();
                      l.ShowDatapub();
                      l.ShowDatabi();
                      this.dispose();
                    }
                  catch (SQLException e)
                    {       
                     JOptionPane.showMessageDialog(null, "ERROR", "WARNING", 1);   
                    }
                  
        
    }//GEN-LAST:event_okbtnMouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

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
            java.util.logging.Logger.getLogger(IBookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IBookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IBookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IBookInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IBookInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton Femalechck;
    public javax.swing.JRadioButton Malechck;
    public javax.swing.JTextField fullnametxt;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton okbtn;
    // End of variables declaration//GEN-END:variables
}
