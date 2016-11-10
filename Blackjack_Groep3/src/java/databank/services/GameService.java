/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.GameDAO;
import databank.DAO.UserDAO;
import databank.util.Conversie;
import java.text.SimpleDateFormat;
import javax.enterprise.context.Conversation;
import model.Game;
import model.User;

/**
 *
 * @author Anthony Lannoote
 */
public class GameService {
    
    public void insertGame(Game game){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormat.format(game.getDate().getTime());
        GameDAO.insertGame(date);
    }
    
    public int getLastGameId(){
        int id = Conversie.convertResultSetToInt(GameDAO.getGameLastId(), "id");
        
        return id;
    }
    
}
