/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.blackjackdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Julie
 */
public class DatabaseSingleton {
    public static DatabaseSingleton ref;//variable van eigen class
    private Connection connection;
    
    private DatabaseSingleton(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public static DatabaseSingleton getDatabaseSingleton(){//zorgen dat maar 1 instantie
        if(ref == null){
            ref = new DatabaseSingleton();
        }
        return ref;
    }
    
    public Connection getConnection(boolean autoCommit){//object aanmaken van connectie
        try{
            connection = DriverManager.getConnection(
                            DatabaseProperties.HOSTNAME,
                            DatabaseProperties.USERNAME,
                            DatabaseProperties.PASSWORD);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return connection;
    }
}
