/*
 * Xander is e Legend
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
 * @author Xander
 */
public class AccountbeheerService {
    
    public void insertuser(String iconid, String nickname, int balance, int isadmin, String email, String password){
        
        UserDAO.insertUser(iconid, nickname,balance, isadmin, email, password);
    }
    
    
    public void deleteUser(String nickName){
        UserDAO.deleteUser(nickName);
    }
    
    public void updateUser(String nickname, String nicknamenew, int balance, int isadmin, String email, String password){
        UserDAO.updateUser(nickname, nicknamenew, 0, 0, email, password, 0);
    }
    
    public List<String> getusers(){
        return Conversie.convertResultsetToList(UserDAO.getUsers());
    }
}
