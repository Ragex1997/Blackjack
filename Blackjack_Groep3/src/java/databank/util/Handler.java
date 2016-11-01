/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databank.util;

/**
 *
 * @author Anthony Lannoote
 */
public class Handler {
    
    public static String handleCard(String cardLocation){
        if(cardLocation == null){
            cardLocation = "";
        }
        return cardLocation;
    }
    
}
