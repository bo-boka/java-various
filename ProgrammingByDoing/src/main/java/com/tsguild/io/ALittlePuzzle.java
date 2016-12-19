/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ALittlePuzzle {
     public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which file to open?: ");
        String file = sc.next();

        Scanner reader = new Scanner(new BufferedReader(new FileReader(file)));
        String fileStuff = "";
        while (reader.hasNextLine()) {
            fileStuff += reader.nextLine() + "\n";
        }
        reader.close();
        
         for (int i = 0; i < fileStuff.length(); i+=3) {
             System.out.print(fileStuff.charAt(i));
         }
     }
}
