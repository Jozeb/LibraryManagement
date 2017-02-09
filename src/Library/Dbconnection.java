/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Akhtar
 */
public class Dbconnection {
    Connection conn=null;
   static Connection connectDB() throws ClassNotFoundException{
    
    try
    {
       // Class.forName("org.sqlite.JDBC");
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","asasas");
        
        return conn;
        
     
    }
    
    catch(Exception e)
    {
        JOptionPane.showMessageDialog(null,e);
        e.printStackTrace();
        return null;
    }
  
    
}
}
