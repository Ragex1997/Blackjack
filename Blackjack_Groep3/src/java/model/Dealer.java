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
public class Dealer {

    private int minStand;
    private int maxStand;
    private String icon;
    private Hand hand;

    public Dealer(int minStand, int maxStand, String icon) {
        this.minStand = minStand;
        this.maxStand = maxStand;
        this.icon = icon;
    }
    
    public void addCard(Card card){
        this.hand.addCard(card);
    }

    public Hand getHand() {
        return hand;
    }
    
    
    
}
