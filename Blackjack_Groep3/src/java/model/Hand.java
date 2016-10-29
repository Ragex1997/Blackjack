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

    public Hand() {
        this.cards = new ArrayList<Card>();
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
        return calculateValue();
    }

    public HandStatus getStatus() {
        return evaluate();
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

            value = +card.getValue().getNumVal();
            
            if (card.getValue().equals(ACE)) {
                ace++;
            }
            if (value > 21 && ace > 0) {
                value = - 10;
                ace--;
            }
        }
        this.evaluate();
        return value;
    }
    
    /**
     * Controle op een Bust of Blackjack
     * @return 
     */
    private HandStatus evaluate() {
        HandStatus status = null;
        int value = this.getValue();
        if (value > 21) {
            status = BUSTED;
        } else if (value == 21 && cards.size() == 2) {
            status = BLACKJACK;
        }
        return status;
    }

}
