/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers.game;

import java.io.File;

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
        File[] files = new File("C:\\Develop\\BlackjackProject\\Blackjack\\Blackjack_Groep3\\web\\rescources\\icons").listFiles();
        showFiles(files);
    }

    public static void showFiles(File[] files) {
        for (File file : files) {
            if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                showFiles(file.listFiles()); // Calls same method again.
            } else {
                System.out.println("File: " + file.getName());
            }
        }
    }
}


