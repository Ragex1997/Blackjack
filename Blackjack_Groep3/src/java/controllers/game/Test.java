/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.game;

import databank.services.IconService;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import model.Deck;
import model.Icon;

/**
 *
 * @author Anthony Lannoote
 */
public class Test {
    
    /**
     * @param args the command line arguments
     */
        

    //Voor het eventueel overlopen van de map met icons
    public static void main(String... args) {
        
        

        
    }

    public static void makeIconListFromFiles() {
        
        File[] files = new File("C:\\Develop\\BlackjackProject\\Blackjack\\Blackjack_Groep3\\web\\rescources\\icons").listFiles();
        List<Icon>icons = new ArrayList<Icon>();
        IconService iconService = new IconService();
        
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
            } else {
                String name = file.getName();
                String filePath = file.getAbsolutePath();
                filePath = filePath.substring(filePath.indexOf("\\Blackjack_Groep3\\"));
                filePath = filePath.replace("web\\", "");
                System.out.println(filePath);
                icons.add(new Icon(name, filePath));
            }
        }
        iconService.InsertIconList(icons);
    }
}


