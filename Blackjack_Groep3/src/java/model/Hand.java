/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.HandStatus;
import static enums.HandStatus.*;
import static enums.Value.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anthony Lannoote
 */
public class Hand {

    private List<Card> cards;
    private HandStatus status;
    private int value;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }
    
    public void setSecondCardInvisible(){
        this.cards.get(1).setVisable(false);
    }
    
    public void setSecondCardVisible(){
        this.cards.get(1).setVisable(true);
    }

    public void setStatus(HandStatus status) {
        this.status = status;
    }

    public void setStatusStand() {
        this.status = STAND;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }


    public int getValue() {
        this.value = calculateValue();
        this.evaluate();
        return this.value;
    }

    public HandStatus getStatus() {
        return this.status;
    }

       /**
     * Berekenen van de waarde van je hand
     * @return 
     */
    private int calculateValue() {
        int value = 0;
        int ace = 0;
        Iterator<Card> IterCard = this.cards.iterator();

        while (IterCard.hasNext()) {
            Card card = IterCard.next();

            value += card.getValue().getNumVal();
            
            if (card.getValue().equals(ACE)) {
                ++ace;
            }
            if (value > 21 && ace > 0) {
                value -= 10;
                --ace;
            }
        }
        return value;
    }
    
    /**
     * Controle op een Bust of Blackjack
     * @return 
     */
    public void evaluate() {
        int value = this.value;
        if (value > 21) {
            this.status = BUSTED;
        } else if (value == 21 && cards.size() == 2) {
            this.status = BLACKJACK;
        }
    }

}
