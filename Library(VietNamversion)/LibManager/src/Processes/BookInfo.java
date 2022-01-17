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
public class BookInfo {
    public Connect cn = new Connect();
    
    public ResultSet DisplayBookInfo() throws SQLException
    {
            this.cn.connectSQL();
            String selecttbl = "SELECT * FROM Book_info";
            return this.cn.LoadData(selecttbl);
    }
    
    public ResultSet DisplayBookInfo(String fullname) throws SQLException
    {
            this.cn.connectSQL();
            String selecttbl = "SELECT * FROM Book_info where PubFullName= N'"+fullname+"'";
            return this.cn.LoadData(selecttbl);
    }
    
    public void InsertBooktoSQL(String id, String idpub, String pubfullname, boolean gen) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Book_info values('"+id+"', '"+idpub+"',N'"+pubfullname+"', '"+gen+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdateBooktoSQL(String id, String idpub, String pubfullname, boolean gen) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Book_info SET Idpublisher = '"+idpub+"', PubFullName = N'"+pubfullname+"', Gender = '"+gen+"' WHERE Idbook = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public void Deletebook(String pubfullname) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Book_info WHERE PubFullName = '"+pubfullname+"'";
        cn.UpdateData(deletedatafromtbl);
    }
    
    public ResultSet Searchbookinfo(String fullname) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Book_info BI, Book B, Publisher P WHERE PubFullName LIKE N'%"+fullname+"%' AND BI.Idbook = B.Idbook AND BI.Idpublisher = P.Idpublisher";
        return cn.LoadData(selecttbl);
    }
    
    
    
   
}
