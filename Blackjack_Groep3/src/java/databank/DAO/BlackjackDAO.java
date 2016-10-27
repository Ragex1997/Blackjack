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
 * @author Julie
 */
public class BlackjackDAO {
    private Connection connection;
    private Statement statement;    
    public BlackjackDAO(){
        
    }
    
    public static ResultSet selectUsers(String tabel, int where, String orderVeld){
        
        String query = "SELECT nickname, icon, balance FROM " + tabel + " WHERE userid =" + where;
        Connection con = DatabaseSingleton.getDatabaseSingleton()
                            .getConnection(true);
        ResultSet rs = null;
        Statement stmt = null;
        
        try{
            stmt
                    = con.createStatement();
            
            rs = stmt.executeQuery(query);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
    
    public static ResultSet editUsers(String tabel, int where, String orderVeld){
        String query = "UPDATE nickname, icon, balance FROM " + tabel + "WHERE userid = " + where;
        Connection con = DatabaseSingleton.getDatabaseSingleton()
                            .getConnection(true);
        ResultSet rs = null;
        Statement stmt = null;
        
        try{
            stmt
                    = con.createStatement();
            
            rs = stmt.executeQuery(query);
        } catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
}
