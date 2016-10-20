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

    public User(String nickName, int balance, String icon) {
        this.nickName = nickName;
        this.balance = balance;
        this.icon = icon;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
    
    public void addCard(Card card){
        this.hand.addCard(card);
    }
    
    
    
}
