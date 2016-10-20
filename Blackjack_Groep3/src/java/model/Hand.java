/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Status;
import enums.Value;
import static enums.Value.ACE;
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
    private int points;

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

//    private int calculatePoints() {
//        int points = 0;
//        int hasAce = 0;
//        for (Card c : cards) {
//            if(c.getValue().equals(ACE)){             
//                if(hasAce == 1){
//                    if(hasAce == 2){
//                        hasAce = 3;
//                    }
//                    hasAce = 2;
//                }
//                hasAce = 1;
//            }
//            points =+ getValueFromCard(c.getValue());
//        }
//        switch (hasAce){
//            case 0:
//                return points;
//            case 1:
//                if(points > 11){
//                    points =+ 1;
//                }else{
//                    points =+10;
//                }
//                return points;
//            case 2:
//                if()
//                
//        }
//        
//    }

    private int getValueFromCard(Value value) {
        
        return value.getNumVal();
    }

}
