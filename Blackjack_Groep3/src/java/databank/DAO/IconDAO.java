/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.DAO;

import databank.blackjackdb.DatabaseSingleton;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Anthony Lannoote
 */
public class IconDAO {
    
    private Connection connectie;
    private Statement statement;

    public IconDAO() {
    }
    
    public static ResultSet getIconById(int id){
        
        String query = "SELECT name, location FROM icon where id = "+id;
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        Statement stmt = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;  
    }
    
    public static void InsertDataIcon(String name, String location){
        
        
        
    }
    
}
