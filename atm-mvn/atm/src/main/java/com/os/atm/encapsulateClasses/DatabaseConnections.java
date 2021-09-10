/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.os.atm.encapsulateClasses;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author smourya
 */
public class DatabaseConnections {
    
    
    public Connection databaseCon(){
        Connection connection= null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/atm","root","");
//            Statement statement = connection.createStatement();
            System.out.println("Connected");
        }catch(ClassNotFoundException | SQLException ex){

            ex.printStackTrace();
        }
        return connection;
    
    }
}
