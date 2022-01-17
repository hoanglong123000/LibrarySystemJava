/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processes;

/**
 *
 * @author long
 */
import Databases.Connect;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Publisher {
      public Connect cn = new Connect();
    
    public ResultSet DisplayPub() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Publisher";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet DisplayPub(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Publisher WHERE Idpublisher='"+id+"'";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet SearchPub(String id, String addr, String phoneno) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Publisher WHERE Idpublisher LIKE N'%"+id+"%' OR address LIKE N'%"+addr+"%' OR phonenum LIKE N'%"+phoneno+"%' ";
        return cn.LoadData(selecttbl);
    }
    
    public void InsertPubtoSQL(String id, String addr, String phonenum) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Publisher values('"+id+"',N'"+addr+"','"+phonenum+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdatePubtoSQL(String id, String addr, String phonenum) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Publisher SET address = N'"+addr+"', phonenum = '"+phonenum+"' WHERE Idpublisher = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public void DeletePub(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Publisher WHERE Idpublisher = '"+id+"' ";
        cn.UpdateData(deletedatafromtbl);
    }
}
