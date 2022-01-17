/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import Processes.LoanSlip;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
public final class Loanslipscreen extends javax.swing.JFrame {

    /**
     * Creates new form Loanslipscreen
     */
    
    private final DefaultTableModel tableModel = new DefaultTableModel();
    private final LoanSlip loansliptbl = new LoanSlip();
    public ULoanSlip uloansliptbl = new ULoanSlip();
    public ILoanSlip iloansliptbl = new ILoanSlip();
    
    public Loanslipscreen() throws SQLException {
        initComponents();
        String []cols = {"Mã phiếu", "Ngày mượn", "Ngày trả", "Số lượng sách"};
        this.tableModel.setColumnIdentifiers(cols);
        this.jTable1.setModel(tableModel);
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
        idtext = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        searchborrowedcardtxt = new javax.swing.JTextField();
        importexcelreaderbtn = new javax.swing.JButton();
        createbtn = new javax.swing.JButton();
        exportexcelbtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        printbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(736, 371, 371, 371));
        setForeground(java.awt.Color.blue);
        setMaximizedBounds(new java.awt.Rectangle(736, 371, 736, 371));
        setMaximumSize(new java.awt.Dimension(736, 371));
        setMinimumSize(new java.awt.Dimension(736, 371));
        setResizable(false);
        setSize(new java.awt.Dimension(736, 371));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/documents.png"))); // NOI18N
        jLabel1.setText("BẢNG PHIẾU MƯỢN");

        updatebtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/refresh.png"))); // NOI18N
        updatebtn.setText("Cập nhật");
        updatebtn.setHideActionText(true);
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
        deletebtn.setText("Xóa");
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
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setSelectionBackground(new java.awt.Color(120, 120, 215));
        jTable1.setShowGrid(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        idtext.setText("jTextField1");
        idtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtextActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Tìm kiếm:");

        searchborrowedcardtxt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        searchborrowedcardtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchborrowedcardtxtActionPerformed(evt);
            }
        });
        searchborrowedcardtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchborrowedcardtxtKeyReleased(evt);
            }
        });

        importexcelreaderbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        importexcelreaderbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/1.png"))); // NOI18N
        importexcelreaderbtn.setText("Nhập từ Excel");
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
        createbtn.setText("Tạo");
        createbtn.setHideActionText(true);
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

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/return.png"))); // NOI18N
        jButton1.setText("Quay lại");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchborrowedcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(343, 343, 343))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(449, 449, 449)
                                .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(83, 83, 83)
                                .addComponent(jLabel1)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(createbtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updatebtn)
                        .addGap(18, 18, 18)
                        .addComponent(importexcelreaderbtn)
                        .addGap(42, 42, 42)
                        .addComponent(printbtn)
                        .addGap(40, 40, 40)
                        .addComponent(exportexcelbtn)
                        .addGap(27, 27, 27)
                        .addComponent(deletebtn)
                        .addGap(0, 39, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(searchborrowedcardtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(idtext, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(importexcelreaderbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn)
                    .addComponent(createbtn)
                    .addComponent(printbtn)
                    .addComponent(exportexcelbtn)
                    .addComponent(deletebtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.getAccessibleContext().setAccessibleName("Loanslipcard");
        jLabel1.getAccessibleContext().setAccessibleDescription("");
        updatebtn.getAccessibleContext().setAccessibleName("updateslipbtn");
        deletebtn.getAccessibleContext().setAccessibleName("deleteslipbtn");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
     public void autoid()
    {
       java.util.Random r = new java.util.Random();
       int start = 100000;
       int end = 999999;
       int res = r.nextInt(end - start) + start;
      
       this.iloansliptbl.Idloansliptxt.setText(String.valueOf(res));
    }
   
    
    public void ShowData() throws SQLException
    {
        ResultSet res = loansliptbl.Display();
        try 
        {
            while(res.next())
            {
                String rows[] = new String[4];
    
                rows[0] = res.getString(1);
                rows[1] = String.valueOf(res.getDate(2));
                rows[2] = String.valueOf(res.getDate(3));
                rows[3] = String.valueOf(res.getInt(4));
                this.tableModel.addRow(rows);
            }
        }
        catch (SQLException e)
        {
            
        }
        
    }
    
    public void ClearData() throws SQLException
    {
        for (int i = tableModel.getRowCount()-1; i >= 0; i--)
        {
            tableModel.removeRow(i);
        }
            
    }
    
    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_updatebtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deletebtnActionPerformed

    private void deletebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deletebtnMouseClicked
        // TODO add your handling code here:
        try
        {
            if(idtext.getText().length() == 0)
            {
                JOptionPane.showMessageDialog(null, "Bạn không thể xóa nếu bạn không lựa chọn một dòng trong bảng", "Thông báo", 1);
                return;
            }
            else
            {
                int ynoption = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (ynoption == JOptionPane.YES_OPTION)
                {
                    loansliptbl.DeletecardfromSQL(idtext.getText());
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        try
        {
           
            this.updatebtn.setEnabled(true);
            this.deletebtn.setEnabled(true);
            int row = jTable1.getSelectedRow();
            
            ResultSet r = this.loansliptbl.Display((jTable1.getModel().getValueAt(row, 0)).toString());
            if (r.next())
            {
                idtext.setText(r.getString("idloanslip"));
                uloansliptbl.Idloansliptxt.setText(r.getString("idloanslip"));
                uloansliptbl.borroweddatetxt.setDate(r.getDate("loandate"));
                uloansliptbl.paydatetxt.setDate(r.getDate("paydate"));
                uloansliptbl.numberofbook.setText(r.getString("numofbook"));
            }
        } 
        catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void updatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updatebtnMouseClicked
        // TODO add your handling code here:
        uloansliptbl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_updatebtnMouseClicked

    private void idtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtextActionPerformed
    
    public void ShowData(String id)
    {
        try
        {
            ResultSet result = null;
            result = this.loansliptbl.SearchLoanSlip(id);
            this.ClearData();
            while(result.next())
            {
                String rows[] = new String[4];
    
                rows[0] = result.getString(1);
                rows[1] = String.valueOf(result.getDate(2));
                rows[2] = String.valueOf(result.getDate(3));
                rows[3] = String.valueOf(result.getInt(4));
                this.tableModel.addRow(rows);
            }
            
        
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Readerscrn.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    private void searchborrowedcardtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchborrowedcardtxtKeyReleased
        try {
            
            // TODO add your handling code here:         
            this.ClearData();
            this.ShowData(searchborrowedcardtxt.getText());
        } catch (SQLException ex) {
            Logger.getLogger(Bookinfo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_searchborrowedcardtxtKeyReleased

    private void searchborrowedcardtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchborrowedcardtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchborrowedcardtxtActionPerformed

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
                    XSSFCell excelloandate = excelrow.getCell(1);
                    XSSFCell excelpaydate = excelrow.getCell(2);
                    XSSFCell excelnumbook = excelrow.getCell(3);
                    SimpleDateFormat a = new SimpleDateFormat("dd/MM/yyyy");
                    
                    JOptionPane.showMessageDialog(null, "Nhập tập tin Excel thành công", "Thông báo", 1);
                    this.tableModel.addRow(new Object[] {excelid, excelloandate, excelpaydate, excelnumbook});
                    this.loansliptbl.InsertdatatoSQL(excelid.toString(), this.convertJavaDateToSqlDate(a.parse(excelloandate.toString())), this.convertJavaDateToSqlDate(a.parse(excelpaydate.toString())), Integer.parseInt(excelnumbook.toString()));
                    
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
        iloansliptbl.setVisible(true);
        this.autoid();
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
                    for (int i = 0; i < this.tableModel.getRowCount(); i++)
                    {
                        XSSFRow excelrow = excelsheet.createRow(i);
                        for(int j = 0; j < this.tableModel.getColumnCount(); j++)
                        {
                            XSSFCell excelcolumn = excelrow.createCell(j);
                            excelcolumn.setCellValue(this.tableModel.getValueAt(i, j).toString());
                        }
                    }
                    excelFOS = new FileOutputStream(excelfilechooser.getSelectedFile() + ".xlsx");
                    excelBOS = new BufferedOutputStream(excelFOS);
                    excelexportfile.write(excelBOS);
                    JOptionPane.showMessageDialog(null, "Xuất ra thành tập tin Excel thành công", "Thông báo", 1);
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

            Boolean printloansliptbl = this.jTable1.print();
            if (printloansliptbl)
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
    public static void main(String args[]) throws SQLException {
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
            java.util.logging.Logger.getLogger(Loanslipscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Loanslipscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Loanslipscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Loanslipscreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new Loanslipscreen().setVisible(true);
                
            } catch (SQLException ex) {
                Logger.getLogger(Loanslipscreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton createbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JButton exportexcelbtn;
    private javax.swing.JTextField idtext;
    private javax.swing.JButton importexcelreaderbtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton printbtn;
    public javax.swing.JTextField searchborrowedcardtxt;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
