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



public class Book {
    public Connect cn = new Connect();
    
    public ResultSet Displaybook() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Book";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet Displaybook(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Book WHERE Idbook ='"+id+"'";
        return cn.LoadData(selecttbl);
    }
    
    public void InsertbooktoSQL(String id, int pubyear, String title, String type, int ammount, Date datepub) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Book values('"+id+"','"+pubyear+"',N'"+title+"',N'"+type+"', '"+ammount+"', '"+datepub+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdatebooktoSQL(String id, int pubyear, String title, String type, int ammount, Date datepub) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Book SET pubyear = '"+pubyear+"', title = N'"+title+"', type = N'"+type+"', ammount = '"+ammount+"', datepub = '"+datepub+"'  WHERE Idbook = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public void Deletebook(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Book WHERE Idbook = '"+id+"'";
        cn.UpdateData(deletedatafromtbl);
    }
    
    public ResultSet Searchbook(String id, String title, String type) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Book WHERE Idbook LIKE N'%"+id+"%' OR title LIKE N'%"+title+"%' OR type LIKE N'%"+type+"%'";
        return cn.LoadData(selecttbl);
    }
    
    
    
}
