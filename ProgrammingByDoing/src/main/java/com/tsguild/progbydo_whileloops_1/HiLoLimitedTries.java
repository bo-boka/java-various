/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_whileloops_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class HiLoLimitedTries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");
        int num = rand.nextInt(100) + 1;
        System.out.println("First guess: ");
        int guess = sc.nextInt();
        int tries = 1;

        while (tries < 7 && guess != num) {
            while (guess > 100 || guess < 1) {
                System.out.println("That's not a valid entry.");
                tries++;
                System.out.println("Guess #" + tries);
                guess = sc.nextInt();
            }
            if (num < guess) {
                System.out.println("Sorry, that's too high");
                tries++;
                System.out.println("Guess #" + tries);
                guess = sc.nextInt();
            } else {
                System.out.println("Sorry, that's too low.");
                tries++;
                System.out.println("Guess #" + tries);
                guess = sc.nextInt();
            }
        }
        if (tries == 0) {
            System.out.println("Sorry, you didn't guess it in 7 tries, loser.");
        } else {
            System.out.println("Right on. You guessed it!");
            System.out.println("It only took you " + tries + " tries.");
        }
    }
}
