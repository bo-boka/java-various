/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/**
 *
 * @author apprentice
 */
public class HighScore {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("You got a high score!");
        System.out.println("\nPlease enter your score: ");
        int score = sc.nextInt();
        System.out.println("Please enter your name: ");
        String name = sc.next();
        
        PrintWriter writer = new PrintWriter(new FileWriter("score.txt"));
        
        writer.println(name + " : "+ score);
        writer.flush();
        writer.close();
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader("score.txt")));
        String fileStuff = "";
        while(reader.hasNextLine()){
            fileStuff += reader.nextLine();
        }
        reader.close();
        System.out.println(fileStuff);
    }
}
