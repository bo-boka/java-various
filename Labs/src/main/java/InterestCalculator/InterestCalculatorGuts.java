/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterestCalculator;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class InterestCalculatorGuts {
    
    public static float floatOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        float num = sc.nextFloat();
        return num;
    }
    
    public static float checkFloatRange(float min, float max, String prompt){
        float num = floatOut(prompt);
        while (num < min || num > max){
            System.out.println("Invalid answer.");
            num = floatOut(prompt);
        }
        return num;
    }
    
    public static String stringOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String words = sc.next();
        return words;
    }
    
    public static float valAndConPeriod(String prompt){
        String words = stringOut(prompt);
        while (!words.equals("quarterly") && !words.equals("monthly") && !words.equals("daily")) {
                System.out.println("Invalid answer.");
                words = stringOut(prompt);
            } 
        float yearFraction = 0;
        if (words.equals("quarterly")){
            yearFraction = 4;
        } else if (words.equals("monthly")){
            yearFraction = 12;
        } else if (words.equals("daily")) {
            yearFraction = 365;
        }
        return yearFraction;
    }
    
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
    
    public static float compoundInterest(float annInt, float compPeriod){
        return annInt/compPeriod;
    }
    
    public static void makeMoney(int yrsInvest, float principal, float compInt, float compPeriod){
        for (int j = 0; j < yrsInvest; j++){
            float beginPrincipal = principal;
            for (int i = 0; i < compPeriod; i++){
                principal += principal * (compInt/100);
            }
            System.out.println("Year " + (j+1) + ": Beginning pricipal was $" + Math.round(beginPrincipal * 100.0) / 100.0);
            System.out.println("        Interest earned was $" + Math.round((principal - beginPrincipal) * 100.0) / 100.0);
            System.out.println("        End of year principal was $" + Math.round(principal * 100.0) / 100.0);
        }
    }
}
