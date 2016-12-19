/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_dowhile;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AgainWithNumGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int tries = 1;
        System.out.println("I have chosen a number between 1-10. Guess.");
        int num = rand.nextInt(10) + 1;
        System.out.println("Your guess: ");
        int guess = sc.nextInt();
        do {

            if (guess != num) {
                System.out.println("That is incorrect. Guess again.");
                System.out.println("Your guess: ");
                guess = sc.nextInt();
                tries++;
            }

        } while (guess != num);
        System.out.println("That's right!");
        System.out.println("It only took you " + tries);
    }
}
