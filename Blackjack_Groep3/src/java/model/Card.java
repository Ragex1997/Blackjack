/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import enums.Suit;
import enums.Value;
import org.kohsuke.rngom.util.Uri;

/**
 *
 * @author Anthony Lannoote
 */
public class Card {
    
    private final Suit suit;
    private final Value value;
    private Boolean visable;
    private Uri cardImage;
    private Uri backImage;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Value getValue() {
        return value;
    }

    public void setVisable(Boolean visable) {
        this.visable = visable;
    }

    public Boolean getVisable() {
        return visable;
    }

    public Uri getCardImage() {
        return cardImage;
    }

    public void setCardImage(Uri cardImage) {
        this.cardImage = cardImage;
    }

    public Uri getBackImage() {
        return backImage;
    }

    public void setBackImage(Uri backImage) {
        this.backImage = backImage;
    }
    
    
    
}
