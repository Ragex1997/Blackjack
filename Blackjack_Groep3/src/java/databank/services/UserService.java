/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.UserDAO;
import databank.util.Conversie;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import model.User;

/**
 *
 * @author Anthony Lannoote
 */
public class UserService {
    
    public List<User> getListOfUsers(){
        
        List<User>users = Conversie.convertResultSetToListOfUsers(UserDAO.getAllDataUsers());
        
        return users;
    }
    
    public User getUserByNickName(String Nickname){
        User user = Conversie.convertResultSetToUser(UserDAO.getUserDataByNickName(Nickname));
        return user;
    }
    
}
