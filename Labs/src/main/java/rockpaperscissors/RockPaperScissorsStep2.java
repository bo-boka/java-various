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
public class RockPaperScissorsStep2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String input;
        int userChoice = 0;
        int botChoice = 0;
        int rounds;

        System.out.println("How many rounds would you like to play?");
        rounds = sc.nextInt();
        if (rounds < 1 || rounds > 10) {
            System.out.println("Out of range.");
        } else {
            for (int i = 0; i < rounds; i++) {
                System.out.println("rock, paper, or scissors? ");
                input = sc.next();
                if (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors")) {
                    do {
                        System.out.println("Invalid Entry");
                        System.out.println("rock, paper, or scissors? ");
                        input = sc.next();
                    } while (!input.equals("rock") && !input.equals("paper") && !input.equals("scissors"));
                }
                if (input.equals("rock")) {
                    userChoice = 0;
                } else if (input.equals("paper")) {
                    userChoice = 1;
                } else if (input.equals("scissors")) {
                    userChoice = 2;
                }
                botChoice = rand.nextInt(3);
                if (userChoice == botChoice) {
                    System.out.println("Tie!");
                } else if (botChoice == 0) {
                    if (userChoice == 1) {
                        System.out.println("You win");
                    } else {
                        System.out.println("Bot wins");
                    }
                } else if (botChoice == 1) {
                    if (userChoice == 0) {
                        System.out.println("Bot wins");
                    } else {
                        System.out.println("You win");
                    }
                } else if (botChoice == 2) {
                    if (userChoice == 0) {
                        System.out.println("You win");
                    } else {
                        System.out.println("Bot wins");
                    }
                }
            }
        }
    }
}
