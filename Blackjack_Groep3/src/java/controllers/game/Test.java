/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.game;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import databank.services.UserService;
import enums.HandStatus;
import static enums.HandStatus.BUSTED;
import java.util.ArrayList;
import java.util.List;
import model.Game;
import model.Icon;
import model.User;

/**
 *
 * @author Anthony Lannoote
 */
public class Test {
    
    /**
     * @param args the command line arguments
     */
        

    //Voor het eventueel overlopen van de map met icons
    public static void main(String... args) {
    
        List<User>users = new ArrayList<User>();
        users.add(new User("Anthony", 500, new Icon("", "/Blackjack_Groep3/rescources/icons/Java the Hutt.png")));
        Game game = new Game(users);
        
        game.getDeck().fillDeck();
        game.getDeck().shuffleDeck();
        game.cardDistribution();
        

        users.get(0).getHand().setStatus(BUSTED);
        
        if(users.get(0).getHand().getStatus().equals(BUSTED)){
            System.out.println("Busted");
            System.out.println(users.get(0).getHand().getStatus());
        }else{
            System.out.println("not busted");
            System.out.println(users.get(0).getHand().getStatus());
        }
        UserService userService = new UserService();
        userService.updateUserBalance(users.get(0));
    }
}


