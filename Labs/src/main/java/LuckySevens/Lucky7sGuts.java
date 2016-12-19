/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuckySevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Lucky7sGuts {
    
    public static int intOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        int num = sc.nextInt();
        return num;
    }
    
    public static int checkIntRange(int min, int max, String prompt){
        int num = intOut(prompt);
        while (num < min || num > max){
            System.out.println("Invalid answer.");
            num = intOut(prompt);
        }
        return num;
    }
    
    public static void playGame(int betAmount, int highMoney){
        Random rollDice = new Random();
        int roll1;
        int roll2;
        int count = 0;
        int highRoll = 0;
        do {
            roll1 = rollDice.nextInt(7);
            roll2 = rollDice.nextInt(7);
            
            if ((roll1 + roll2) == 7) {
                betAmount += 4;
                count++;
                if (betAmount > highMoney) {
                    highMoney = betAmount;
                    highRoll = count;
                }
                System.out.println(betAmount);               
            } else {           
                betAmount -= 1;
                System.out.println(betAmount);
                count++;
            }
        } while (betAmount != 0);
        System.out.println("Number of rolls: " + (count + 1));
        System.out.println("Your highest amount was $"+ highMoney + " after "+ (highRoll + 1) +" rolls.");
    }
}
