/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processes;

import Databases.Connect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author long
 */
public class DetailReceipt {
    public Connect cn = new Connect();
    
    public ResultSet DisplayReceipt() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM DetailReceipt";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet DisplayReceipt(String fullname) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM DetailReceipt WHERE Fullname=N'"+fullname+"'";
        return this.cn.LoadData(selecttbl);
    }
    
    public ResultSet SearchReceipt(String fullname, String id, String fyear) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM DetailReceipt WHERE Fullname LIKE N'%"+fullname+"%' OR ididencard LIKE '%"+id+"%' OR FoundedLoanSlipDate LIKE '%"+fyear+"%'  ";
        return cn.LoadData(selecttbl);
    }
    
     public void InsertReceipttoSQL(String fullname, String id, String fyear, int cost, Date iddate) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO DetailReceipt values(N'"+fullname+"','"+id+"',N'"+fyear+"', '"+cost+"', '"+iddate+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdateReceipttoSQL(String fullname, String id, String fyear, int cost, Date iddate) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE DetailReceipt SET Fullname = N'"+fullname+"', FoundedLoanSlipDate = '"+fyear+"', Cost = '"+cost+"', FoundedIdencardDate = '"+iddate+"' WHERE ididencard = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    
    public void DeleteReceipt(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM DetailReceipt WHERE ididencard = '"+id+"'";
        cn.UpdateData(deletedatafromtbl);
    }
   
}
    