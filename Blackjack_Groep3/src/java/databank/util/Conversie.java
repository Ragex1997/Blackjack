/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.util;

import databank.services.DatumService;
import databank.services.IconService;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import model.Icon;
import model.User;

/**
 *
 * @author Julie
 */
public class Conversie {
    
    public static int convertResultSetToInt(ResultSet rs, String rowName) {
        int result = 0;
        try {
            while (rs.next()) {
                result = Integer.parseInt(rs.getString("max(" + rowName + ")"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static List<String> convertResultsetToList(ResultSet rs) {
        List lijst = new ArrayList();

        try {
            while (rs.next()) {
                String str = null;

                str = rs.getString("nickname");

                lijst.add(str);
            }

        } catch (SQLException ex) {

        }
        return lijst;
    }

    public static Icon convertResultSetToIcon(ResultSet rs) {

        Icon icon = null;
        String name = null;
        String location = null;

        try {
            while (rs.next()) {

                name = rs.getString("name");
                location = rs.getString("location");
                icon = new Icon(name, location);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return icon;
    }

    public static List<User> convertResultSetToListOfUsers(ResultSet rs) {

        List<User> users = new ArrayList<User>();

        IconService iconService = new IconService();

        int id = 0;
        String nickName = null;
        int balance = 0;
        Icon icon = null;
        User user = null;

        try {
            while (rs.next()) {
                nickName = rs.getString("nickname");
                balance = Integer.parseInt(rs.getString("balance"));

                id = Integer.parseInt(rs.getString("id"));
                icon = iconService.getIconById(id);

                user = new User(nickName, balance, icon);
                users.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return users;
    }

    public static User convertResultSetToUser(ResultSet rs) {

        IconService iconService = new IconService();

        int id = 0;
        String nickName = null;
        int balance = 0;
        Icon icon = null;
        User user = null;

        try {
            while (rs.next()) {
                nickName = rs.getString("nickname");
                balance = Integer.parseInt(rs.getString("balance"));

                id = Integer.parseInt(rs.getString("id"));
                icon = iconService.getIconById(id);

                user = new User(nickName, balance, icon);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
    public static int convertResultSetToId(ResultSet rs) {

        int id = 0;

        try {
            while (rs.next()) {
                id = Integer.parseInt(rs.getString("id"));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return id;
    }
    
    //date van spel in database steken
    public static Calendar convertResultSetToGame(ResultSet rs){

        DatumService datumService = new DatumService();
        
        int id = 0;
        Calendar date = null;
        
        try{
            while(rs.next()){
                id = Integer.parseInt(rs.getString("id"));
                date = datumService.getGameDateById(id);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return date;
    }
}
