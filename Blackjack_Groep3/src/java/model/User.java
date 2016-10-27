/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Anthony Lannoote
 */
public class User {
    
    private String nickName;
    private int balance;
    private String icon;
    private Hand hand;
    private int bet;

    public User(String nickName, int balance, String icon) {
        this.nickName = nickName;
        this.balance = balance;
        this.icon = icon;
    }
    
    

    public String getNickName() {
        return nickName;
    }

    public int getBalance() {
        return balance;
    }

    public String getIcon() {
        return icon;
    }

    public Hand getHand() {
        return hand;
    }

    public int getBet() {
        return bet;
    }
    
    public void addCard(Card card){
        this.getHand().addCard(card);
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    

    
    
}
