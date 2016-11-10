/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.services;

import databank.DAO.UserDAO;
import databank.util.Conversie;
import enums.HandStatus;
import java.util.List;
import model.User;

/**
 *
 * @author Anthony Lannoote
 */
public class UserService {

    /**
     * Geeft de lijst van alle users terug met headUsers als deze ingelogd is
     *
     * @param isHeadUser Geef True mee als de headuser is ingelogd anders false
     * @return
     */
    public List<User> getListOfUsers(boolean isHeadUser) {

        List<User> users = Conversie.convertResultSetToListOfUsers(UserDAO.getAllDataUsers(isHeadUser));

        return users;
    }

    public User getUserByNickName(String nickname) {
        User user = Conversie.convertResultSetToUser(UserDAO.getUserDataByNickName(nickname));
        return user;
    }
    public int getUserIdByNickName(String nickname){
        int id = Conversie.convertResultSetToId(UserDAO.getUserDataByNickName(nickname));
        return id;
    }

    public void updateUserBalance(User user) {
        String nickName = user.getNickName();
        int balance = user.getBalance();
        UserDAO.updateUserBalanceByNickName(nickName, balance);
    }

    public void insertToGameUser(User user) {
        
        GameService gameService = new GameService();
        
        int userId = getUserIdByNickName(user.getNickName());
        int gameId = gameService.getLastGameId();
        int userBet = user.getBet();
        String userStatus = "";
        //We moeten er bij kunnen vermelden of het een BLACKJACK was of niet 
        //want bij BLACKJACK wordt je meer uit betaalt
        if(user.getHand().getStatus() == HandStatus.BLACKJACK){
            userStatus = "BLACKJACK";
        }else{
            userStatus = user.getGameStatus().toString();
        }

        UserDAO.InsertGameUserData(userId, gameId, userBet, userStatus);
    }
}
