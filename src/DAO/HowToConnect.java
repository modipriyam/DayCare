/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author priyammodi
 */
public class HowToConnect {

    /**
     *
     */
    private static final String url = "jdbc:mysql://localhost:3306/DayCare";
    private static final String user = "root";
    private static final String password = "Boston@23";

    // JDBC variables for opening and managing connection
    private static java.sql.Connection con;
    private static Statement stmt;
    private static ResultSet rs;
    
    public HowToConnect(){
        demo();
    }
    public static void demo() {
        // TODO code application logic here
        String query = "select FirstName, RegistrationDate  from Student_Details";
        try{  
            con = DriverManager.getConnection(url, user, password);
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
            
            }

        catch(Exception e){
                System.out.println(e);
            }  
    }
    
}
