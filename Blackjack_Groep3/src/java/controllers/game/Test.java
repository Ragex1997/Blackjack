/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.game;

import com.sun.javafx.scene.control.skin.VirtualFlow;
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
        users.add(new User("Anthony", 50, new Icon("", "/Blackjack_Groep3/rescources/icons/Java the Hutt.png")));
        Game game = new Game(users);
        
        game.getDeck().fillDeck();
        game.getDeck().shuffleDeck();
        game.cardDistribution();
        
        System.out.println(users.get(0).getHand().getCards().get(0).getCardImage());
        System.out.println(users.get(0).getHand().getCards().get(1).getCardImage());
        
    }
}


