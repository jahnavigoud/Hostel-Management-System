/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hostelmanagement.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import java.util.logging.Logger;

/**
 *
 * @author jahnavi
 */
public class DBConnection {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/hosteldb?useSSL=false";
    static final String USER = "root";
    static final String PASS = "root";
    public static Connection connection = null;

    
    private static final Logger logger = Logger.getLogger(DBConnection.class.getName());
    
    public static Connection connect(){
	try{
	    Class.forName("com.mysql.jdbc.Driver");
	    connection = DriverManager.getConnection(DB_URL, USER, PASS);
            logger.log(Level.INFO,"Database Connected Successfully");
        }
	catch(Exception e){
	    logger.log(Level.SEVERE,"Exception occurred while connecting to database");
            e.printStackTrace();
	}
        return connection;
    }
    
    public static Connection getConnection(){
     if(connection!=null){
         return connection;
     }
     connection = connect();
     return connection;
    }
    

}
