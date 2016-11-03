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
 * @author Anthony Lannoote
 */
public class UserDAO {

    private Connection connectie;
    private Statement statement;

    public UserDAO() {
    }

    public static ResultSet getAllDataUsers() {
        String query = "SELECT * FROM user";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(query);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static ResultSet getUserDataByNickName(String NickName) {

        String query = "SELECT * FROM user where nickname = ?";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(query);
            stmt.setString(1, NickName);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static void updateUserBalanceByNickName(String nickName, int balance) {
        String query = "UPDATE user SET balance = " + balance + " where user.nickname = '" + nickName + "'";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);

        try {
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
