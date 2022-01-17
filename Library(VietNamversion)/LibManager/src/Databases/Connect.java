/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databases;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author long
 */
public class Connect {
    public  Connection conn = null;
    
    public void connectSQL() throws  SQLException{
        String username = "long";
        String password = "12345+@l";
        String url = "jdbc:sqlserver://LAPTOP-5C698NK2\\SQLEXPRESS;databaseName=Librarydata";
        conn = java.sql.DriverManager.getConnection(url, username, password);
        System.out.println("OK");
       
    }
    
    public ResultSet LoadData(String sql) throws SQLException
    {
        ResultSet res = null;
        this.connectSQL();
        try 
        {
            Statement st = conn.createStatement();
            return st.executeQuery(sql);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return null;
        }   
    }
    
    public void UpdateData(String sql)
    {
        try 
        {
            Statement statem = conn.createStatement();
            statem.executeUpdate(sql);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
    
    
}
    
   


    
