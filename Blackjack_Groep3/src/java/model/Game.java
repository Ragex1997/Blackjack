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
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Anthony Lannoote
 */
public class Game {

    private List<User> users = new ArrayList<User>();
    private Dealer dealer;
    private Deck deck;
    private Calendar date;

    public Game(List<User> users) {
        this.users.addAll(users);
        this.dealer = new Dealer(16);
        this.deck = new Deck();
        this.date = Calendar.getInstance();
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

    public Calendar getDate() {
        return date;
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
     * Zet zijn Status op Stand en berekend de waarde van zijn hand
     *
     * @param user
     */
    public void playerStand(User user) {
        user.getHand().setStatus(STAND);
        user.getHand().getValue();
    }

    /**
     * Beslist als de dealer moet hitten of standen De dealer zel hitten als hij
     * minder heeft dan 17 of als iedereen een hoger hand heeft dan hij.
     */
    public void dealersTurn() {
        int value = this.dealer.getHand().getValue();
        int minValue = 1000;
        int minStand = this.dealer.getMinStand();

        for (User u : this.users) {
            if (minValue > u.getHand().getValue() && BUSTED != u.getHand().getStatus()) {//Als de User NIET Busted is zal hij ze mee tellen
                minValue = u.getHand().getValue();                                       //als het ook nog lager is dan minValue
            }
        }

        while (minStand > value || minValue > value && minValue != 1000) {
            this.dealer.addCard(deck.drawCard());
            value = this.dealer.getHand().getValue();
        }
    }

    /**
     * Hier bereken we wie er gewonnen heeft en wie er verliest of gelijk speelt
     * En worden ze uitbetaald
     */
    public void evaluateGame() {

        int dealerPoints;
        int userPoints;
        int payout;
        HandStatus dealerHandStatus;
        HandStatus userHandStatus;

        dealerPoints = this.dealer.getHand().getValue();
        dealerHandStatus = this.dealer.getHand().getStatus();

        for (User u : this.users) {
            userHandStatus = u.getHand().getStatus();

            if (userHandStatus == BUSTED) {
                u.setGameStatus(LOSS);
            } else if (userHandStatus == BLACKJACK) {
                u.setGameStatus(WIN);
                payout = (int) (u.getBet() * 2.5);
                u.addPayout(payout);
            } else if (evaluateUserWin(u)) {
                payout = (int) (u.getBet() * 2);
                u.setGameStatus(WIN);
                u.addPayout(payout);

            } else if (evaluteUserPush(u)) {
                payout = (int) (u.getBet());
                u.setGameStatus(PUSH);
                u.addPayout(payout);
            } else {
                u.setGameStatus(LOSS);
            }
        }
    }

    /**
     * Kijkt of de user gewonnen heeft Wordt gebruikt in evaluateGame
     *
     * @param u
     * @return
     */
    private boolean evaluateUserWin(User u) {

        int dealerValue = this.dealer.getHand().getValue();
        HandStatus dealerHandStatus = this.dealer.getHand().getStatus();
        int userValue = u.getHand().getValue();
        boolean win = false;

        if (userValue > dealerValue || dealerHandStatus == BUSTED) {
            win = true;
        }

        return win;
    }

    /**
     * Kijkt of de User een push heeft Wordt gebruikt in evaluateGame
     *
     * @param u
     * @return
     */
    private boolean evaluteUserPush(User u) {

        int dealerPoints = this.dealer.getHand().getValue();
        int userPoints = u.getHand().getValue();
        boolean push = false;

        if (userPoints == dealerPoints) {
            push = true;
        }
        return push;
    }
}
