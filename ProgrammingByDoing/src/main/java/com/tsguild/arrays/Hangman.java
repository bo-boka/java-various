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
    static String[] wordList = {"abcdefg", "abcdefg", "abcdefg", "abcdefg", 
                            "entropy", "abcdefg", "abcdefg", "abcdefg"};
    static String wordChoice = wordList[rand.nextInt(wordList.length)];  
    static String[] word = new String[wordChoice.length()];
    static String guess;
    static String misses = "";
    static int guessCount;
    static int letterCount;
    static boolean keepGoing = true;
    
    public static void main(String[] args) { //repeat letters, set missed guess instead of adding to word length, hasWon doesn't work
        
        initDisplay();
        
        while(keepGoing) {
            guess = playAndDisplay(wordChoice);
        
            int location = wordChoice.indexOf(guess);
            if (location == -1){
                misses += guess;
            } else {
                word[location] = guess;
            }
            guessCount++;
            
            keepGoing = hasWon() && maxedAttempts();
        }
        
    }
    
    public static boolean maxedAttempts(){
        int maxGuess = wordChoice.length() + 6;
        if (guessCount == maxGuess) 
            return false;
        else return true;
    }
    
    public static boolean hasWon(){
        for (String elem : word){
            if (elem == "_") {
                letterCount++;
            }
        }
        if (letterCount == 0) {
            System.out.println("Congrats!"); 
            return false;
        }
        return true;
    }
   
    
    public static void initDisplay(){
        for (int i = 0; i < word.length; i++) {
            word[i] = "_";
        }
    }
    
    public static String playAndDisplay(String wordChoice){
        
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
