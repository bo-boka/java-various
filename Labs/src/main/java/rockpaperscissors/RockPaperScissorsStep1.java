/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RockPaperScissorsStep1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        String x;
        int userChoice = 0;
        int botChoice;
        
        botChoice = rand.nextInt(3);
        do {
            System.out.println("rock, paper, or scissors? ");
            x = sc.next();
        } while (!x.equals("rock") && !x.equals("paper") && !x.equals("scissors"));

            if (x.equals("rock")){
                userChoice = 0;
            } else if (x.equals("paper")){
                userChoice = 1;
            } else if (x.equals("scissors")) {
                userChoice = 2;
            }

            if (userChoice == botChoice){
                System.out.println("Tie!");
            } else {

                if (botChoice == 0){
                    if (userChoice == 1) {
                        System.out.println("You win");
                    } else {
                        System.out.println("Bot wins");
                    }
                } else if (botChoice == 1) {
                    if (userChoice == 0){
                        System.out.println("Bot wins");
                    } else {
                        System.out.println("You win");
                    }
                } else if (botChoice == 2){
                    if (userChoice == 0){
                        System.out.println("You win");
                    } else {
                        System.out.println("Bot wins");
                    }
                }
            }
        
    }
}
