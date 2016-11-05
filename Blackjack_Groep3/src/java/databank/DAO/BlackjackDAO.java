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

    public BlackjackDAO() {

    }

    //nog aanpassen naar stored procedures...
    public static ResultSet selectUsers(String tabel, int where, String orderVeld) {

        String query = "SELECT * FROM " + tabel + " ORDER BY " + orderVeld;
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

    public static void editUserName( int waarde, int id) {        
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        
        try {
            Statement stmt = con.createStatement();

            stmt.executeUpdate("UPDATE users set nickname = " + waarde + " WHERE userid = " + id);
        } catch (SQLException e) {
            e.printStackTrace();
        }        
    }
    
}
