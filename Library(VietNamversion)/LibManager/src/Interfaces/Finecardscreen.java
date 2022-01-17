/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Processes.Finecard;
import java.awt.print.PrinterException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JFileChooser;
import javax.swing.RowFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.TableRowSorter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author long
 */



public class Finecardscreen extends javax.swing.JFrame {

    /**
     * Creates new form Finecardscreen
     */
    private final DefaultTableModel fcardmodel = new DefaultTableModel();
    private final Finecard fcardtable = new Finecard();
    public UFinecard ufinetbl = new UFinecard();
    public AFinecard afinetbl = new AFinecard();
    
    
    public Finecardscreen() throws SQLException {
        initComponents();
        String []cols = {"Mã phiếu", "Nội dung", "Phí"};
        this.fcardmodel.setColumnIdentifiers(cols);
        this.FinecardTable.setModel(fcardmodel);
        this.ShowData();
        
        this.Updatefinecardbtn.setEnabled(false);
        this.Deletefinecardbtn.setEnabled(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        FinecardTable = new javax.swing.JTable();
        Deletefinecardbtn = new javax.swing.JButton();
        Updatefinecardbtn = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        returnbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        searchtickettxt = new javax.swing.JTextField();
        importexcelbbtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        exportexcelbtn = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/ticket1.png"))); // NOI18N
        jLabel1.setText("PHIẾU PHẠT");

        FinecardTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        FinecardTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        FinecardTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FinecardTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(FinecardTable);

        Deletefinecardbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Deletefinecardbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/delete.png"))); // NOI18N
        Deletefinecardbtn.setText("Xóa");
        Deletefinecardbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeletefinecardbtnMouseClicked(evt);
            }
        });
        Deletefinecardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletefinecardbtnActionPerformed(evt);
            }
        });

        Updatefinecardbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Updatefinecardbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/refresh.png"))); // NOI18N
        Updatefinecardbtn.setText("Cập nhật");
        Updatefinecardbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdatefinecardbtnMouseClicked(evt);
            }
        });
        Updatefinecardbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatefinecardbtnActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        returnbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/return.png"))); // NOI18N
        returnbtn.setText("Quay lại");
        returnbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnbtnMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Tìm kiếm:");

        searchtickettxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchtickettxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchtickettxtKeyReleased(evt);
            }
        });

        importexcelbbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        importexcelbbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/1.png"))); // NOI18N
        importexcelbbtn.setText("Nhập từ Excel");
        importexcelbbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importexcelbbtnMouseClicked(evt);
            }
        });
        importexcelbbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importexcelbbtnActionPerformed(evt);
            }
        });

        createbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        createbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        createbtn.setText("Tạo");
        createbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createbtnMouseClicked(evt);
            }
        });
        createbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createbtnActionPerformed(evt);
            }
        });

        exportexcelbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        exportexcelbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/1.png"))); // NOI18N
        exportexcelbtn.setText("Xuất ra Excel");
        exportexcelbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportexcelbtnMouseClicked(evt);
            }
        });
        exportexcelbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportexcelbtnActionPerformed(evt);
            }
        });

        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/documents.png"))); // NOI18N
        printbtn.setText("In");
        printbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printbtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Updatefinecardbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(importexcelbbtn)
                                .addGap(18, 18, 18)
                                .addComponent(printbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addComponent(exportexcelbtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Deletefinecardbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(returnbtn)
                                .addGap(165, 165, 165)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(225, 225, 225)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(searchtickettxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(returnbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchtickettxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Updatefinecardbtn)
                    .addComponent(Deletefinecardbtn)
                    .addComponent(importexcelbbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(createbtn)
                    .addComponent(exportexcelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printbtn))
                .addGap(33, 33, 33))
        );

        Deletefinecardbtn.getAccessibleContext().setAccessibleName("Deletefinecardbtn");
        Updatefinecardbtn.getAccessibleContext().setAccessibleName("Updatefinecardbtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void ShowData() throws SQLException
    {
        ResultSet re = fcardtable.DisplayFinecard();
        try 
        {
            while(re.next())
            {
                String rows[] = new String[3];
    
                rows[0] = re.getString(1);
                rows[1] = re.getString(2);
                rows[2] = String.valueOf(re.getInt(3));
                fcardmodel.addRow(rows);
            }
        }
        catch (SQLException e)
        {
            
        }
        
    }
    
     public void ClearData() throws SQLException
    {
        for (int i = this.fcardmodel.getRowCount()-1; i >= 0; i--)
        {
            this.fcardmodel.removeRow(i);
        }
            
    }
    
    
    private void FinecardTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FinecardTableMouseClicked
        // TODO add your handling code here:
           try
        {
            this.Updatefinecardbtn.setEnabled(true);
            this.Deletefinecardbtn.setEnabled(true);

            int row = FinecardTable.getSelectedRow();
            
            ResultSet r = this.fcardtable.DisplayFinecard((FinecardTable.getModel().getValueAt(row, 0)).toString());
            if (r.next())
            {
                this.jTextField1.setText(r.getString("Idfinecard"));
                this.ufinetbl.idfinecardtxt.setText(r.getString("Idfinecard"));
                this.ufinetbl.contenttxt.setText(r.getString("Contents"));
                this.ufinetbl.costtxt.setText(String.valueOf(r.getInt("Cost")));
            }
        } 
        catch (SQLException ex) {
            
        }
    }
    
    public void ShowData(String id, String content)
    {
        try
        {
            ResultSet result = null;
            result = this.fcardtable.SearchFineCard(id, content);
            this.ClearData();
            while(result.next())
            {
                String rows[] = new String[3];
    
                rows[0] = result.getString(1);
                rows[1] = result.getString(2);
                rows[2] = String.valueOf(result.getInt(3));
                fcardmodel.addRow(rows);
            }
            
        
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Readerscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        this.ufinetbl.setVisible(true);
        
    }                                      

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {                                       
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FinecardTableMouseClicked
    
    
    
    
    
    private void returnbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnbtnMouseClicked
        // TODO add your handling code here:
            try {
            // TODO add your handling code here:
            Readerscrn l = new Readerscrn();
            l.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Identitycard.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }//GEN-LAST:event_returnbtnMouseClicked

    private void DeletefinecardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletefinecardbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DeletefinecardbtnActionPerformed

    private void DeletefinecardbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeletefinecardbtnMouseClicked
        // TODO add your handling code here:
        try
        {
            if(this.jTextField1.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Bạn không thể xóa nếu bạn không lựa chọn một dòng trong bảng", "Thông báo", 1);
                return;
            }
            else
            {
                int ynoption = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (ynoption == JOptionPane.YES_OPTION)
                {
                    this.fcardtable.DeleteDatafromSQL(this.jTextField1.getText());
                    this.ClearData();
                    this.ShowData();
                }
                else
                {
                    return;
                }
               
            }
        }
        catch (SQLException ex)
        {

        }
    }//GEN-LAST:event_DeletefinecardbtnMouseClicked

    private void UpdatefinecardbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatefinecardbtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_UpdatefinecardbtnActionPerformed

    private void UpdatefinecardbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdatefinecardbtnMouseClicked
        // TODO add your handling code here:
        this.ufinetbl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_UpdatefinecardbtnMouseClicked

    private void searchtickettxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchtickettxtKeyReleased
        try {
            // TODO add your handling code here:
            this.ClearData();
            this.ShowData(this.searchtickettxt.getText(), this.searchtickettxt.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_searchtickettxtKeyReleased

    private void importexcelbbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importexcelbbtnMouseClicked
        // TODO add your handling code here:
        try
        {
            File excelfile;
            FileInputStream excelFIS = null;
            BufferedInputStream excelBIS = null;
            XSSFWorkbook excelJTableImport = null;

            String path = "C:\\";
            JFileChooser excelfilechooser = new JFileChooser();
            int excelchooser = excelfilechooser.showOpenDialog(null);

            if (excelchooser == JFileChooser.APPROVE_OPTION)
            {
                excelfile = excelfilechooser.getSelectedFile();
                excelFIS = new FileInputStream(excelfile);
                excelBIS = new BufferedInputStream(excelFIS);

                excelJTableImport = new XSSFWorkbook(excelBIS);
                XSSFSheet excelSheet = excelJTableImport.getSheetAt(0);

                for(int i = 0; i <= excelSheet.getLastRowNum(); i++)
                {
                    XSSFRow excelrow = excelSheet.getRow(i);
                    XSSFCell excelid = excelrow.getCell(0);
                    XSSFCell excelcontent = excelrow.getCell(1);
                    XSSFCell excelcost = excelrow.getCell(2);
                    this.fcardmodel.addRow(new Object[] {excelid, excelcontent, excelcost});
                    this.fcardtable.InsertDatatoSQL(excelid.toString(), excelcontent.toString(), Integer.parseInt(excelcost.toString()));
                }
                JOptionPane.showMessageDialog(null, "Nhập tập tin Excel thành công", "Thông báo", 1);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importexcelbbtnMouseClicked

    private void importexcelbbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importexcelbbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importexcelbbtnActionPerformed

    private void createbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtnMouseClicked
        // TODO add your handling code here:
        this.afinetbl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createbtnMouseClicked

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createbtnActionPerformed

    private void exportexcelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportexcelbtnMouseClicked
        // TODO add your handling code here:
        FileOutputStream excelFOS = null;
        BufferedOutputStream excelBOS = null;
        XSSFWorkbook excelexportfile = null;
        JFileChooser excelfilechooser = new JFileChooser("C:\\");
            excelfilechooser.setDialogTitle("Xuất ra tập tin EXCEL");
            FileNameExtensionFilter f = new FileNameExtensionFilter("xlsx", "xlsm");
            excelfilechooser.setFileFilter(f);
            int excelchooser = excelfilechooser.showSaveDialog(null);

            if (excelchooser == JFileChooser.APPROVE_OPTION)
            {

                try {
                    excelexportfile = new XSSFWorkbook();
                    XSSFSheet excelsheet = excelexportfile.createSheet("JTable Sheet");
                    for (int i = 0; i < this.fcardmodel.getRowCount(); i++)
                    {
                        XSSFRow excelrow = excelsheet.createRow(i);
                        for(int j = 0; j < this.fcardmodel.getColumnCount(); j++)
                        {
                            XSSFCell excelcolumn = excelrow.createCell(j);
                            excelcolumn.setCellValue(this.fcardmodel.getValueAt(i, j).toString());
                        }
                    }
                    excelFOS = new FileOutputStream(excelfilechooser.getSelectedFile() + ".xlsx");
                    excelBOS = new BufferedOutputStream(excelFOS);
                    excelexportfile.write(excelBOS);
                    JOptionPane.showMessageDialog(null, "Lưu thành Excel thành công", "Thông báo", 1);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
                } finally {
                    try {
                        if (excelBOS != null)
                        {
                            excelBOS.close();
                        }
                        if (excelFOS != null)
                        {
                            excelFOS.close();
                        }
                        if (excelexportfile != null)
                        {
                            excelexportfile.close();
                        }

                    } catch (IOException ex) {
                        Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
    }//GEN-LAST:event_exportexcelbtnMouseClicked

    private void exportexcelbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportexcelbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exportexcelbtnActionPerformed

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Boolean printfinecardtbl = this.FinecardTable.print();
            if (printfinecardtbl)
            {
                JOptionPane.showMessageDialog(null, "In thành công", "Thông báo", 1);
            }
            else
            {
                
            }

        } catch (PrinterException ex) {
            Logger.getLogger(DetailReceiptscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printbtnMouseClicked

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
            java.util.logging.Logger.getLogger(Finecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Finecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Finecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Finecard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Finecardscreen().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Finecardscreen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletefinecardbtn;
    private javax.swing.JTable FinecardTable;
    private javax.swing.JButton Updatefinecardbtn;
    public javax.swing.JButton createbtn;
    private javax.swing.JButton exportexcelbtn;
    private javax.swing.JButton importexcelbbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton printbtn;
    private javax.swing.JButton returnbtn;
    public javax.swing.JTextField searchtickettxt;
    // End of variables declaration//GEN-END:variables

   
}
