/*
 * Xander is e Legend
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.UserDAO;
import model.User;

/**
 *
 * @author Xander
 */
public class AccountbeheerService {
    
    public void insertuser(String iconid, String nickname, int balance, int isadmin, String email, String password){
        
        UserDAO.insertUser(iconid, nickname,balance, isadmin, email, password);
    }
    
}
