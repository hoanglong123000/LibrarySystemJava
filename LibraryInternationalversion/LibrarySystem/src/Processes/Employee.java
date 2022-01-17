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



public class Employee {
    public Connect cn = new Connect();
    
    public ResultSet Display() throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Employee";
        return cn.LoadData(selecttbl);
    }
    
    public ResultSet Display(String name) throws SQLException
    {
        cn.connectSQL();
        String selecttbl = "SELECT * FROM Employee WHERE Name ='"+name+"'";
        return cn.LoadData(selecttbl);
    }
    
  
    
}
