/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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

    public void playerHit(User user) {
        user.addCard(deck.drawCard());
    }

    public void dealerHit() {
        dealer.addCard(deck.drawCard());
    }

    public void playerStand(User user) {
        
    }

    public void dealerStand() {
        
    }

}
