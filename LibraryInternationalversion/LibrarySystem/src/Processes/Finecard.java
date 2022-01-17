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
public class Finecard {
    public Connect cn = new Connect();
    
    public ResultSet DisplayFinecard() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Finecard";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet DisplayFinecard(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Finecard where Idfinecard='"+id+"'";
        return cn.LoadData(selecttbl);
    }
    
    public void InsertDatatoSQL(String id, String content, int cost) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Finecard values('"+id+"',N'"+content+"','"+cost+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdateDatatoSQL(String id, String content, int cost) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Finecard SET Contents = N'"+content+"', Cost ='"+cost+"' WHERE Idfinecard = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public ResultSet SearchFineCard(String id, String content) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Finecard WHERE Idfinecard LIKE N'%"+id+"%' OR Contents LIKE N'%"+content+"%'    ";
        return cn.LoadData(selecttbl);
    }
    
    public void DeleteDatafromSQL(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Finecard WHERE Idfinecard = '"+id+"'";
        cn.UpdateData(deletedatafromtbl);
    } 
}
