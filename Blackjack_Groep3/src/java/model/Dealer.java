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
    private Icon icon;
    private Hand hand;

    public Dealer(int minStand) {
        this.minStand = minStand;
        this.icon = new Icon("Java the Hutt", "/Blackjack_Groep3/rescources/icons/Java the Hutt.png");
        this.hand = new Hand();
    }

    public int getMinStand() {
        return minStand;
    }

    public Icon getIcon() {
        return icon;
    }
    
    public Hand getHand() {
        return hand;
    }
    
    public void addCard(Card card){
        this.hand.addCard(card);
    }
}
