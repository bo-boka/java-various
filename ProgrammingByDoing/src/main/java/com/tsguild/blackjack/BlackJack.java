/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.blackjack;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BlackJack {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int thePot = 0;
        String again = "";
        int wager = 0;
        String move;
        System.out.println("\nWelcome to my blackjack program!");
        do {
            System.out.println("\nWhat is your starting bet?"); //first bet starts the pot. Player can play until money hits 0.
            wager = sc.nextInt();
            if (thePot != 0) { // makes sure this isn't the first bet
                while (wager > thePot) { //validation
                    System.out.println("You don't have that much money to bet.");
                    System.out.println("You're current amount is " + thePot);
                    System.out.println("How much would you like to bet?");
                    wager = sc.nextInt();
                }
                while (wager < 1) { // validation
                    System.out.println("You must bet more than 0");
                    System.out.println("How much money would you like to bet?");
                    wager = sc.nextInt();
                }
                thePot -= wager; // subtracts all subsequent bets after the first from the pot
            }

            while (wager < 1) { //validation
                System.out.println("You must bet more than 0");
                System.out.println("How much money would you like to bet?");
                wager = sc.nextInt();
            }
            int card1 = (rand.nextInt(10) + 2);
            int card2 = (rand.nextInt(10) + 2);
            int playerTotal = card1 + card2;
            System.out.println("You get a " + card1 + " and a " + card2);
            System.out.println("Your total is " + playerTotal + ".");

            int dCard1 = (rand.nextInt(10) + 2);
            int dCard2 = (rand.nextInt(10) + 2);
            int dealerTotal = dCard1 + dCard2;
            System.out.println("\nThe dealer has a " + dCard1 + " showing, and a hidden card.");
            System.out.println("Their total is hidden, too.");

            do {
                System.out.println("\nWould you like to \"hit\" or \"stay\"?");
                move = sc.next();
                if (move.equals("hit")) {
                    card1 = (rand.nextInt(10) + 2);
                    playerTotal += card1;
                    System.out.println("You drew a " + card1);
                    System.out.println("Your total is " + playerTotal);
                }
            } while (move.equals("hit") && playerTotal < 21);

            if (playerTotal > 21) {
                System.out.println("BUST. Dealer wins.");
            } else {
                System.out.println("\nOkay, dealer's turn.");
                Thread.sleep(600); // pauses for 600 milliseconds
                System.out.println("\nTheir hidden card was a " + dCard2);
                System.out.println("Their total was " + dealerTotal);
                Thread.sleep(1000); // pauses for 1000 milliseconds
                while (dealerTotal <= 16) { // dealer stays after 16
                    dCard1 = (rand.nextInt(10) + 2);
                    dealerTotal += dCard1;
                    System.out.println("\nDealer chooses to hit.");
                    System.out.println("Dealer drew a " + dCard1);
                    System.out.println("Dealer's total is " + dealerTotal);
                    Thread.sleep(1000); // pauses for 1000 milliseconds
                }
                if (dealerTotal > 21) {
                    System.out.println("\nDEALER BUSTED. You win!");
                    thePot += wager * 2;
                } else {
                    System.out.println("\nDealer stays.");
                    Thread.sleep(1000); // pauses for 1000 milliseconds
                    System.out.println("\nDealer's total is " + dealerTotal);
                    System.out.println("Your total is " + playerTotal);
                    Thread.sleep(1000); // pauses for 1000 milliseconds
                    if (dealerTotal == playerTotal) { //dealer wins on a tie
                        System.out.println("\nDealer wins.");
                    } else if (dealerTotal < playerTotal) {
                        System.out.println("\nYOU WIN.");
                        thePot += wager * 2;
                    } else {
                        System.out.println("\nDealer wins.");
                    }
                }
            }
            again = ""; //resets play again
            if (thePot > 0) { //game ends once the pot hits zero
                System.out.println("You have $" + thePot + " left to play.");
                System.out.println("Would you like to play again? (y/n)");
                again = sc.next();
            }
        } while (again.equals("y"));
    }
}
