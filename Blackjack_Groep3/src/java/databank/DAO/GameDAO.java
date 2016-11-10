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
import java.util.Iterator;
import model.Icon;

/**
 *
 * @author Anthony Lannoote
 */
public class GameDAO {

    private Connection connectie;
    private Statement statement;

    public GameDAO() {
    }

    public static void insertGame(String date) {

        String query = "insert into game(date) values(?)";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);

        try {
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, date);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static ResultSet getGameLastId(){
        String query = "SELECT max(id) FROM game";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        Statement stmt = null;
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        }catch(SQLException e){
            e.printStackTrace();
        }
        return rs;
    }

}
