/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.consoleio;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class IOUserPrompt {
    
    public IOUserPrompt(){}
    
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
    
    public static String stringOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        String words = sc.nextLine();
        return words;
    }
    
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
    
    public static double doubleOut(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        double num = sc.nextDouble();
        return num;
    }
    
    public static double checkDoubleRange(double min, double max, String prompt){
        double num = doubleOut(prompt);
        while (num < min || num > max){
            System.out.println("Invalid answer.");
            num = doubleOut(prompt);
        }
        return num;
    }
    
}
