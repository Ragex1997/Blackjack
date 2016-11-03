/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.GameStatus;

/**
 *
 * @author Anthony Lannoote
 */
public class User {
    
    private String nickName;
    private int balance;
    private Icon icon;
    private Hand hand;
    private int bet;
    private GameStatus gameStatus;

    public User(String nickName, int balance, Icon icon) {
        this.nickName = nickName;
        this.balance = balance;
        this.icon = icon;
        this.bet = 1;
        this.hand = new Hand();
    }
    
    

    public String getNickName() {
        return nickName;
    }

    public int getBalance() {
        return balance;
    }

    public Icon getIcon() {
        return icon;
    }

    public Hand getHand() {
        return hand;
    }

    public int getBet() {
        return bet;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }
    
    public void addCard(Card card){
        this.getHand().addCard(card);
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
    
    public void addPayout(int payout){
        this.balance += payout;
    }
    
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setBet(int bet) {
        this.bet = bet;
        this.balance -= this.bet;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    

    
    
}
