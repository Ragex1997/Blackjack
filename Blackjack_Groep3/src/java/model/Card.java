/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Suit;
import enums.Rank;

/**
 *
 * @author Anthony Lannoote
 */
public class Card {
    
    private final Suit suit;
    private final Rank value;
    private Boolean visable;
    private String cardImage;
    private String backImage;

    public Card(Suit suit, Rank value) {
        this.suit = suit;
        this.value = value;
        this.cardImage = "rescources/playingCards/" + suit.getSuit() + "/" + value.toString() + ".png";
        this.backImage = "rescources/playingCards/playingcardback.png";
        this.visable = true;
    }

    public Rank getValue() {
        return value;
    }

    public void setVisible(Boolean visible) {
        this.visable = visible;
    }

    public Boolean getVisable() {
        return visable;
    }

    public String getFrontImage() {
        return cardImage;
    }

    public String getBackImage() {
        return backImage;
    } 
}
