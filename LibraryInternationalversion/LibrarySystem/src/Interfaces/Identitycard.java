/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Databases.Connect;
import Interfaces.Bookinfo;
import Interfaces.Readerscrn;
import Interfaces.UIdentitycard;
import Processes.IdentityCard;
import java.awt.print.PrinterException;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
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
public class Identitycard extends javax.swing.JFrame {

    /**
     * Creates new form Identitycard
     */
    private final DefaultTableModel Idencardmodel = new DefaultTableModel();
    private final IdentityCard Idencardtable = new IdentityCard();
    public UIdentitycard uidentitytbl = new UIdentitycard();
    public Connect cn = new Connect();
    public AIdentitycard aidentitytbl = new AIdentitycard();
    
    public Identitycard() throws SQLException {
        initComponents();
        String []cols = {"ID", "SEX", "ADDRESS", "EXPIRED DATE", "AGE", "EMAIL"};
        Idencardmodel.setColumnIdentifiers(cols);
        jTable1.setModel(Idencardmodel);
        this.ShowData();
        
        this.updatebtn.setEnabled(false);
        this.deletebtn.setEnabled(false);
        
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
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searchidcardtxt = new javax.swing.JTextField();
        importexcelreaderbtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        exportexcelbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/reading.png"))); // NOI18N
        jLabel1.setText("IDENTITY CARD LIST");

        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/refresh.png"))); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updatebtnMouseClicked(evt);
            }
        });
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/delete.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deletebtnMouseClicked(evt);
            }
        });
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jTextField1.setText("jTextField1");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("SEARCH FOR:");

        searchidcardtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchidcardtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchidcardtxtActionPerformed(evt);
            }
        });
        searchidcardtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchidcardtxtKeyReleased(evt);
            }
        });

        importexcelreaderbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        importexcelreaderbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/1.png"))); // NOI18N
        importexcelreaderbtn.setText("IMPORT FROM EXCEL");
        importexcelreaderbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                importexcelreaderbtnMouseClicked(evt);
            }
        });
        importexcelreaderbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importexcelreaderbtnActionPerformed(evt);
            }
        });

        createbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        createbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/add-documents.png"))); // NOI18N
        createbtn.setText("ADD");
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
        exportexcelbtn.setText("SAVE AS EXCEL");
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

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/return.png"))); // NOI18N
        jButton1.setText("RETURN");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        printbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        printbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/documents.png"))); // NOI18N
        printbtn.setText("PRINT");
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(316, 316, 316)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(201, 201, 201)
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(searchidcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createbtn)
                .addGap(18, 18, 18)
                .addComponent(importexcelreaderbtn)
                .addGap(26, 26, 26)
                .addComponent(printbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exportexcelbtn)
                .addGap(10, 10, 10)
                .addComponent(updatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deletebtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(225, 225, 225))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchidcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(importexcelreaderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printbtn)
                    .addComponent(exportexcelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn)
                    .addComponent(deletebtn))
                .addGap(25, 25, 25))
        );

        updatebtn.getAccessibleContext().setAccessibleName("updatecardbtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
         try
        {
           this.updatebtn.setEnabled(true);
           this.deletebtn.setEnabled(true);
           int row = jTable1.getSelectedRow();
            
            ResultSet r = this.Idencardtable.DisplayCard((jTable1.getModel().getValueAt(row, 0)).toString());
            if (r.next())
            {
               
                this.jTextField1.setText(r.getString("ididencard"));
                this.uidentitytbl.IDcardtxt.setText(r.getString("ididencard"));
                if (r.getBoolean("gender"))
                {
                    this.uidentitytbl.Malechck.setSelected(true);
                    this.uidentitytbl.Femalechck.setSelected(false);
                }
                else
                {
                    this.uidentitytbl.Malechck.setSelected(false);
                    this.uidentitytbl.Femalechck.setSelected(true);
                }
                this.uidentitytbl.addresstxt.setText(r.getString("address"));
                this.uidentitytbl.Expdatetxt.setDate(r.getDate("Expdate"));
                this.uidentitytbl.agetxt.setText(String.valueOf(r.getInt("age")));
                this.uidentitytbl.emailtxt.setText(r.getString("email"));
                
            }
        } 
        catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        // TODO add your handling code here:
        this.uidentitytbl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatebtnMouseClicked
    
    public void autoid()
    {
       java.util.Random r = new java.util.Random();
       int start = 100000;
       int end = 999999;
       int res = r.nextInt(end - start) + start;
       
       this.aidentitytbl.IDcardtxt.setText(String.valueOf(res));
      
    }
    
    
    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
         try
        {
            if(this.jTextField1.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "YOU HAVEN'T CHOOSE YET", "WARNING", 1);
                return;
            }
            else
            {
                
                int ynoption = JOptionPane.showConfirmDialog(this, "ARE YOU SURE TO DELETE THIS? ALL OF YOUR ITEMS WILL BE REMOVED IN SQL", "WARNING", JOptionPane.YES_NO_OPTION);
                if (ynoption == JOptionPane.YES_OPTION)
                {
                    this.Idencardtable.DeletedatafromSQL(this.jTextField1.getText());
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
    }//GEN-LAST:event_deletebtnMouseClicked

    private void searchidcardtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchidcardtxtKeyReleased
        try {
            // TODO add your handling code here:
    
            this.ClearData();
            this.ShowData(this.searchidcardtxt.getText(), this.searchidcardtxt.getText(), this.searchidcardtxt.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchidcardtxtKeyReleased
    
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
        return new java.sql.Date(date.getTime());  
    }
    
    private void importexcelreaderbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_importexcelreaderbtnMouseClicked
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
                    XSSFCell excelgender = excelrow.getCell(1);
                    XSSFCell exceladdress = excelrow.getCell(2);
                    XSSFCell excelexdate = excelrow.getCell(3);
                    XSSFCell excelage = excelrow.getCell(4);
                    XSSFCell excelemail = excelrow.getCell(5);
                    SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
                    
                    this.Idencardmodel.addRow(new Object[] {excelid, excelgender, exceladdress, excelexdate, excelage, excelemail});
                    this.Idencardtable.InsertCardtoSQL(excelid.toString(), this.convertJavaDateToSqlDate(a.parse(excelexdate.toString())), exceladdress.toString(), excelgender.toString().equals("Nam")?true:false, excelemail.toString(), Integer.parseInt(excelage.toString()));
                    JOptionPane.showMessageDialog(null, "IMPORT SUCCESSFULLY", "WARNING", 1);
                }
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(Identitycard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Identitycard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importexcelreaderbtnMouseClicked

    private void importexcelreaderbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importexcelreaderbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_importexcelreaderbtnActionPerformed

    private void createbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createbtnMouseClicked
        // TODO add your handling code here:
        this.aidentitytbl.setVisible(true);
        this.autoid();
        this.dispose();
        
    }//GEN-LAST:event_createbtnMouseClicked

    private void createbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_createbtnActionPerformed

    private void searchidcardtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchidcardtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchidcardtxtActionPerformed

    private void exportexcelbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportexcelbtnMouseClicked
        // TODO add your handling code here:
        FileOutputStream excelFOS = null;
        BufferedOutputStream excelBOS = null;
        XSSFWorkbook excelexportfile = null;
        JFileChooser excelfilechooser = new JFileChooser("C:\\");
            excelfilechooser.setDialogTitle("SAVE AS EXCEL");
            FileNameExtensionFilter f = new FileNameExtensionFilter("xlsx", "xlsm");
            excelfilechooser.setFileFilter(f);
            int excelchooser = excelfilechooser.showSaveDialog(null);

            if (excelchooser == JFileChooser.APPROVE_OPTION)
            {

                try {
                    excelexportfile = new XSSFWorkbook();
                    XSSFSheet excelsheet = excelexportfile.createSheet("JTable Sheet");
                    for (int i = 0; i < this.Idencardmodel.getRowCount(); i++)
                    {
                        XSSFRow excelrow = excelsheet.createRow(i);
                        for(int j = 0; j < this.Idencardmodel.getColumnCount(); j++)
                        {
                            XSSFCell excelcolumn = excelrow.createCell(j);
                            excelcolumn.setCellValue(this.Idencardmodel.getValueAt(i, j).toString());
                        }
                    }
                    excelFOS = new FileOutputStream(excelfilechooser.getSelectedFile() + ".xlsx");
                    excelBOS = new BufferedOutputStream(excelFOS);
                    excelexportfile.write(excelBOS);
                    JOptionPane.showMessageDialog(null, "SAVE SUCCESSFULLY", "WARNING", 1);
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

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        try {
            // TODO add your handling code here:
            Readerscrn l = new Readerscrn();
            l.setVisible(true);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(Identitycard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void printbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printbtnMouseClicked
        // TODO add your handling code here:
        try {
            // TODO add your handling code here:

            Boolean printreadertbl = this.jTable1.print();
            if (printreadertbl)
            {
                JOptionPane.showMessageDialog(null, "PRINTED SUCCESSFULLY", "WARNING", 1);
            }
            else
            {
               
            }

        } catch (PrinterException ex) {
            Logger.getLogger(DetailReceiptscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_printbtnMouseClicked

     public void ClearData() throws SQLException
    {
        for (int i = Idencardmodel.getRowCount()-1; i >= 0; i--)
        {
            Idencardmodel.removeRow(i);
        }
            
    }
     
    public void ShowData() throws SQLException
    {
        ResultSet displaydata = Idencardtable.DisplayCard();
        try 
        {
            while(displaydata.next())
            {
                String rows[] = new String[6];
    
                rows[0] = displaydata.getString(1);
                rows[1] = displaydata.getBoolean(2)?"MALE":"FEMALE";
                rows[2] = displaydata.getNString(3);
                rows[3] = String.valueOf(displaydata.getDate(4));
                rows[4] = String.valueOf(displaydata.getInt(5));
                rows[5] = displaydata.getString(6);
                Idencardmodel.addRow(rows);
            }
        }
        catch (SQLException e)
        {
            
        }
        
    }
    
    public void ShowData(String id, String addr, String email)
    {
        try
        {
            ResultSet result = null;
            result = this.Idencardtable.SearchCard(id, addr, email);
            this.ClearData();
            while(result.next())
            {
               String rows[] = new String[6];
    
                rows[0] = result.getString(1);
                rows[1] = result.getBoolean(2)?"MALE":"FEMALE";
                rows[2] = result.getNString(3);
                rows[3] = String.valueOf(result.getDate(4));
                rows[4] = String.valueOf(result.getInt(5));
                rows[5] = result.getString(6);
                Idencardmodel.addRow(rows);
            }
            
        
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Readerscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
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
            java.util.logging.Logger.getLogger(Identitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Identitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Identitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Identitycard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Identitycard().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Identitycard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exportexcelbtn;
    private javax.swing.JButton importexcelreaderbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton printbtn;
    public javax.swing.JTextField searchidcardtxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}