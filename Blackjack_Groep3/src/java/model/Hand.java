/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Status;
import static enums.Value.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anthony Lannoote
 */
public class Hand {

    private List<Card> cards;
    private int bet;
    private Status status;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
    
    private int calculateValue(){
        int waarde = 0;
        boolean hasAce = false;
        
        for(Card c : cards){
            if(c.getValue().equals(ACE)){
                hasAce = true;
            }
            waarde =+ c.getValue().getNumVal();
        }
        
        if(waarde > 21 && hasAce == true){
            waarde =- 10;
        }
        return waarde;
    }

    public int getValue() {
        return calculateValue();
    }

}
