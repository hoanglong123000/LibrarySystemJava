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


public class Reader {
    public Connect cn = new Connect();
    
    public ResultSet Display() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Reader";
        return cn.LoadData(selecttbl);
    }
    
    
    public ResultSet DisplayReader(String name) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Reader WHERE Fullname=N'"+name+"'";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet SearchReader(String name, String email, String phoneno) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Reader WHERE Fullname LIKE N'%"+name+"%' OR Email LIKE N'%"+email+"%' OR Phonenum LIKE N'%"+phoneno+"%'  ";
        return cn.LoadData(selecttbl);
    }
    
    

    
    public void InsertReadertoSQL(String name, String email, boolean gen, int age, String phoneno) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Reader values(N'"+name+"',N'"+email+"','"+gen+"','"+age+"','"+phoneno+"')";
        cn.UpdateData(inserttotbl);
    }
    
    
    public void UpdateReadertoSQL(String name, String email, boolean gen, int age, String phoneno) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Reader SET Email = '"+email+"', Gender = '"+gen+"', Age = '"+age+"', Phonenum = '"+phoneno+"' WHERE Fullname = '"+name+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public void DeletePub(String name) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Reader WHERE Fullname = N'"+name+"'";
        cn.UpdateData(deletedatafromtbl);
    }
}
