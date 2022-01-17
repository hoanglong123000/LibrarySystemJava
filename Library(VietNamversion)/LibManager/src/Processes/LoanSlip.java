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
import javax.swing.JOptionPane;

/**
 *
 * @author long
 */
public class LoanSlip {
    public Connect cn = new Connect();
    
    public ResultSet Display() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM LoanSlip";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet Display(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM LoanSlip where idloanslip='"+id+"'";
        return cn.LoadData(selecttbl);
    }
    
    public void InsertdatatoSQL(String id, Date loandate, Date paydate, int numbook) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO LoanSlip values('"+id+"','"+loandate+"','"+paydate+"','"+numbook+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public ResultSet SearchLoanSlip(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM LoanSlip WHERE idloanslip LIKE N'%"+id+"%' ";
        return cn.LoadData(selecttbl);
    }
    
    public void UpdatedatatoSQL(String id, Date loandate, Date paydate, int numbook) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE LoanSlip SET loandate = '"+loandate+"', paydate = '"+paydate+"', numofbook = '"+numbook+"' WHERE idloanslip = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public void DeletecardfromSQL(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "Delete from LoanSlip where idloanslip = '"+id+"'";
        cn.UpdateData(deletedatafromtbl);
    }
}
