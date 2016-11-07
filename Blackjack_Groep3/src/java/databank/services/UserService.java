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
    
    /**
     * Geeft de lijst van alle users terug met headUsers als deze ingelogd is
     * @param isHeadUser Geef True mee als de headuser is ingelogd anders false
     * @return 
     */
    public List<User> getListOfUsers(boolean isHeadUser){
        
        List<User>users = Conversie.convertResultSetToListOfUsers(UserDAO.getAllDataUsers(isHeadUser));
        
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
