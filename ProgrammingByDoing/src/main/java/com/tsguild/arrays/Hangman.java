/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Hangman {
    
    static Random rand = new Random();
    public static Scanner sc = new Scanner(System.in);
    static String[] wordList = {"abadefg", "abadefg", 
                            "entropy", "abadefg"};
    static String wordChoice = wordList[rand.nextInt(wordList.length)];  
    static String[] word = new String[wordChoice.length()];
    static String guess;
    static String misses = "";
    static int guessCount;
    static int letterCount;
    static boolean keepGoing = true;
    
    public static void main(String[] args) { 
        
        initDisplay();
        
        while(keepGoing) {
            guess = playAndDisplay();
        
            int location = wordChoice.indexOf(guess);
            if (location == -1){
                misses += guess;
            } else {
                word[location] = guess;
                wordChoice = wordChoice.substring(0, location) + "_" + wordChoice.substring(location+1);
            }
            guessCount++;
            
            keepGoing = hasWon() && maxedAttempts();
        }
        
    }
    
    public static boolean maxedAttempts(){
        int maxGuess = wordChoice.length() + 6;
        return guessCount != maxGuess;
    }
    
    public static boolean hasWon(){
        for (int i = 0; i < wordChoice.length(); i++){
            if (wordChoice.charAt(i) != '_') return true;
        }
        System.out.println("Congrats!");
        for (String elem : word){
            System.out.print(elem+" ");
        }
        
        return false;
    }
   
    
    public static void initDisplay(){
        for (int i = 0; i < word.length; i++) {
            word[i] = "_";
        }
    }
    
    public static String playAndDisplay(){
        
        System.out.println("\n+==+==+==+==+==+==+==+==+");
        System.out.print("\nWord: ");
        for (String elem : word){
            System.out.print(elem+" ");
        }
        System.out.println("\n\nMisses: "+ misses);
        
        System.out.print("\nGuess: ");
        guess = sc.next();
        return guess;
        
    }
}
