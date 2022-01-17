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
public class IdentityCard {
    public Connect cn = new Connect();
    
    public ResultSet DisplayCard() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Identitycard";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet DisplayCard(String id) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Identitycard where ididencard='"+id+"'";
        return cn.LoadData(selecttbl);
    }
    
    public void InsertCardtoSQL(String id, Date Exdate, String Address, boolean gen, String Email, int age) throws SQLException
    {
        cn.connectSQL();
        String inserttotbl = "INSERT INTO Identitycard values('"+id+"','"+gen+"',N'"+Address+"','"+Exdate+"','"+age+"',N'"+Email+"')";
        cn.UpdateData(inserttotbl);
    }
    
    public void UpdateCardtoSQL(String id, Date Exdate, String Address, boolean gen, String Email, int age) throws SQLException
    {
        cn.connectSQL();
        String updatetotbl = "UPDATE Identitycard SET gender = '"+gen+"', address = N'"+Address+"', Expdate = '"+Exdate+"', age ='"+age+"', email = N'"+Email+"' WHERE ididencard = '"+id+"'";
        cn.UpdateData(updatetotbl);
    }
    
    public ResultSet SearchCard(String id, String addr, String email) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Identitycard WHERE ididencard LIKE N'%"+id+"%' OR address LIKE N'%"+addr+"%' OR email LIKE N'%"+email+"%' ";
        return cn.LoadData(selecttbl);
    }
    
    public void DeletedatafromSQL(String id) throws SQLException
    {
        cn.connectSQL();
        String deletedatafromtbl = "DELETE FROM Identitycard WHERE ididencard = '"+id+"'";
        cn.UpdateData(deletedatafromtbl);
    }
}
