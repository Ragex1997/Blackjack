/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.DAO;

import databank.blackjackdb.DatabaseSingleton;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

/**
 *
 * @author Julie
 */
public class DatumDAO {
    private Connection connectie;
    private Statement statement;
    
    public DatumDAO(){
       
    }
    //datum per spel toevoegen
    public static void insertGameDatum(int id){
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        
        String query ="INSERT into game(date)" + "values(?)";
        
        try{            
            PreparedStatement stmt = con.prepareStatement(query);
            
            stmt.setInt(1, id);            
            stmt.executeUpdate();            
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }    
    
    //datum opvragen uit db
    public static ResultSet selectDateById(String tabel, int id){
        String query = "SELECT date FROM game WHERE id= ?";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        try{
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }
}
