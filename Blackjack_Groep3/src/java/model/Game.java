/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import static enums.GameStatus.*;
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
        this.dealer = new Dealer(17);
        this.deck = new Deck();
    }

    public Deck getDeck() {
        return deck;
    }

    public List<User> getUsers() {
        return users;
    }

    public Dealer getDealer() {
        return dealer;
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
     *
     * @param user
     */
    public void playerHit(User user) {
        user.addCard(deck.drawCard());
        user.getHand().getValue();
    }

    /**
     * Beslist als de dealer moet hitten of standen
     * De dealer zel hitten als hij minder heeft dan 17 of als 
     * iedereen een hoger hand heeft dan hij.
     */
    public void dealersTurn() {
        int value = this.dealer.getHand().getValue();
        int minValue = 16;

        for (User u : this.users) {
            if (minValue > u.getHand().getValue() && BUSTED != u.getHand().getStatus()) {
                minValue = u.getHand().getValue();
            }
        }

        while (16 > value || minValue > value) {
            this.dealer.addCard(deck.drawCard());
            value = this.dealer.getHand().getValue();
        }
    }

    public void playerStand(User user) {
        user.getHand().setStatusStand();
        user.getHand().getValue();
    }


    private boolean evaluteUserPush(User u) {

        int dealerPoints = this.dealer.getHand().getValue();
        int userPoints = u.getHand().getValue();
        boolean push = false;

        if (userPoints == dealerPoints) {
            push = true;
            u.setGameStatus(PUSH);
        }
        return push;
    }

    private boolean evaluateUserWin(User u) {

        int dealerPoints = this.dealer.getHand().getValue();
        HandStatus dealerHandStatus = this.dealer.getHand().getStatus();
        int userPoints = u.getHand().getValue();
        boolean win = false;

        if (userPoints > dealerPoints || dealerHandStatus == BUSTED) {
            win = true;
            u.setGameStatus(WIN);
        }

        return win;
    }

    public void evaluateGame() {

        int dealerPoints;
        int userPoints;
        int payout;
        HandStatus dealerHandStatus;
        HandStatus userHandStatus;

        List<User> userWinners = new ArrayList<User>(this.users);

        dealerPoints = this.dealer.getHand().getValue();
        dealerHandStatus = this.dealer.getHand().getStatus();
        
        
        
        for (User u : userWinners) {
            userHandStatus = u.getHand().getStatus();

            if (userHandStatus == BUSTED) {
                this.users.get(this.users.indexOf(u)).setGameStatus(LOSS);
                userWinners.remove(u);
            } else if (userHandStatus == BLACKJACK) {
                this.users.get(this.users.indexOf(u)).setGameStatus(WIN);
                payout = (int) (u.getBet() * 2.5);
                u.addPayout(payout);
            } else if (evaluateUserWin(u)) {
                payout = (int) (u.getBet()) * 2;
                u.addPayout(payout);

            } else if (evaluteUserPush(u)) {
                payout = (int) (u.getBet());
                u.addPayout(payout);
            }else{
                u.setGameStatus(LOSS);
            }
        }
    }
}
