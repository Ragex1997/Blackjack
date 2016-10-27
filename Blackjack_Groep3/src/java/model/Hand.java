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

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }
    
    private int calculateValue(){
        int value = 0;
        boolean hasAce = false;
        
        
        Iterator<Card> IterCard = this.cards.iterator();
        
        while(IterCard.hasNext()){
            Card card = IterCard.next();
            
            if(card.getValue().equals(ACE)){
                hasAce = true;
            }
            value =+ card.getValue().getNumVal();
        }
        
        if(value > 21 && hasAce == true){
            value =- 10;
        }
        return value;
    }

    public int getValue() {
        return calculateValue();
    }
    
    public HandStatus getStatus(){
        return evaluate();
    }
    
    private HandStatus evaluate(){
        
        HandStatus status = null;
        int value = this.getValue();
        if(value > 21){
            status = BUSTED;
        }else if(value == 21 && cards.size() == 2){
            status = BLACKJACK;
        }
        return status;
    }

}
