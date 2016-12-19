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
public class NumGuessWithCounter {
    
    public static void main(String[] args) {
        
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int x = 0;
        int myNum = rand.nextInt(1000) + 1;
        int count = 0;

        System.out.println("I've chosen a number between 1-1000, guess what it is?!");
        int userNum = sc.nextInt();
        System.out.println("You chose " + userNum);
        
        System.out.println();
        if (userNum == myNum) {
            System.out.println("Correct! Congratulations!");
            count++;
        } else {
            while (userNum != myNum) {
                if (userNum < myNum) {
                    x = myNum - userNum;
                } else {
                    x = userNum - myNum;
                }
                if (x > 500) {
                    System.out.println("So cold, you're practically in the north pole. Guess again.");
                    userNum = sc.nextInt();
                    count++;
                } else if (x <= 500 && x > 200) {
                    System.out.println("Pretty chilly. Guess again.");
                    userNum = sc.nextInt();
                    count++;
                } else if (x <= 200 && x > 100) {
                    System.out.println("Tepid, but approaching room temp.");
                    userNum = sc.nextInt();
                    count++;
                } else if (x <= 100 && x > 50) {
                    System.out.println("Warm, but still a bit off.");
                    userNum = sc.nextInt();
                    count++;
                } else if (x <= 50 && x > 20) {
                    System.out.println("Heating up...");
                    userNum = sc.nextInt();
                    count++;
                } else if (x <= 20 && x >= 10) {
                    System.out.println("Hot hot hot, you're practically bubbling!");
                    userNum = sc.nextInt();
                    count++;
                } else {
                    System.out.println("So hot, it's like living on the SUN!");
                    userNum = sc.nextInt();
                    count++;
                }
            }
        }
        
        System.out.println("Yep, you got it! I chose " + myNum + "!");
        System.out.println("It only took you " + count + " tries.");
    }
    

}
