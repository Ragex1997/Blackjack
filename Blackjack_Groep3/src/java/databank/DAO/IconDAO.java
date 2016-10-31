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
import java.util.List;
import model.Icon;

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
        
        String query = "SELECT name, location FROM icon where id = ?";
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        ResultSet rs = null;
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(query);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;  
    }
    
    public static void InsertDataIcon(List<Icon>icons){
        
        String query = "insert into icon(location, name) values(?,?)";
        
        Connection con = DatabaseSingleton.getDatabaseSingleton().getConnection(true);
        
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            Iterator<Icon>it = icons.iterator();
            while (it.hasNext()) {
                Icon icon = it.next();
                stmt.setString(1, icon.getLocation());
                stmt.setString(2, icon.getName());
                stmt.executeUpdate(); 
            }
        } catch (SQLException e) {
            e.printStackTrace();   
        }
        
    }
    
}
