/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import enums.GameStatus;
import enums.HandStatus;
import static enums.HandStatus.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony Lannoote
 */
public class Game {

    private List<User> users;
    private Dealer dealer;
    private Deck deck;

    public Game(List<User> users) {
        this.users = new ArrayList<User>(users);
    }

    /**
     * De kaarten worden verdeeld onder de dealer en de spelers
     */
    public void cardDistribution() {
        //Kaarten worden verdeeld onder alle spelers en de dealer 
        //Ze krijgen er elk 2
        while (dealer.getHand().getCards().size() < 2) {
            dealer.addCard(deck.drawCard());

            for (User u : users) {
                u.addCard(deck.drawCard());
            }
        }
    }

    /**
     * De speler trekt een kaart van het Deck
     * @param user 
     */
    public void playerHit(User user) {
        user.addCard(deck.drawCard());
    }

    /**
     * De dealer trekt een kaart van het Deck
     */
    public void dealerHit() {
        dealer.addCard(deck.drawCard());
    }

    public int playerStand(User user) {
        return user.getHand().getValue();
    }

    public int dealerStand() {
        return this.dealer.getHand().getValue();
    }
    
    public void evaluateGame(){
        
        int dealerPoints;
        HandStatus dealerHandStatus;
        HandStatus userHandStatus;
        
        List<User>userWinners = new ArrayList<User>(this.users);
        
        dealerPoints = this.dealer.getHand().getValue();
        dealerHandStatus = this.dealer.getHand().getStatus();
        
        for(User u : userWinners){
            userHandStatus = u.getHand().getStatus();
            
            if(userHandStatus == BUSTED){
                userWinners.remove(u);
            }
            
        }
        
    }

}

