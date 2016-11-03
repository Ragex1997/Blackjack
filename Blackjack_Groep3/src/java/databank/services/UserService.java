/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.UserDAO;
import databank.util.Conversie;
import java.util.List;
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
    
    public User getUserByNickName(String nickname){
        User user = Conversie.convertResultSetToUser(UserDAO.getUserDataByNickName(nickname));
        return user;
    }
    
    public void updateUserBalance(User user){
        String nickName = user.getNickName();
        int balance = user.getBalance();
        UserDAO.updateUserBalanceByNickName(nickName, balance);
    }
}
