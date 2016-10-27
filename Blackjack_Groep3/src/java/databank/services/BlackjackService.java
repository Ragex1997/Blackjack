/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.BlackjackDAO;
import databank.util.Conversie;
import java.util.List;

/**
 *
 * @author Julie
 */
public class BlackjackService {
    
    public List<String>getUsers(){
        return Conversie.convertResultsetToList(BlackjackDAO.selectUsers("user", 0, "nickname"));
    }
}
