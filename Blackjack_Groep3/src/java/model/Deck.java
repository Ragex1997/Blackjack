/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Suit;
import enums.Value;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Anthony Lannoote
 */
public class Deck {
    
    private List<Card>cards;

    public Deck(List<Card> cards) {
        this.cards = new ArrayList<Card>();
    }
    
    public void fillDeck(){
        for(int i = 0 ; i < 52 ; i++){
            for(Suit s : Suit.values()){
                for(Value v : Value.values()){
                    this.cards.add(new Card(s, v));
                }
            }
        }
    }
    /**
     * Het Deck wordt door elkaar geschudt
     */
    public void shuffleDeck(){
        Collections.shuffle(this.cards);
    }
    /**
     * Geeft de eerste kaart terug van het Deck(cards)
     * en verwijderd deze
     * @return 
     */
    public Card drawCard(){    
        Card card = this.cards.get(0);
        removeCard(card);
        return card;
    }
    
    public void removeCard(Card card){
        this.cards.remove(card);
    }
    
    public void addCard(Card card){
        this.cards.add(card);
    }
    
}
