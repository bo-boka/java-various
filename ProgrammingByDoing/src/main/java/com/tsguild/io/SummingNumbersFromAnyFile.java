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
public class SummingNumbersFromAnyFile{
    public static void main(String[] args) throws IOException {
        PrintWriter writer = new PrintWriter(new FileWriter("3nums.txt"));
        writer.println(3);
        writer.println(4);
        writer.println(1);
        writer.flush();
        writer.close();
        PrintWriter writer2 = new PrintWriter(new FileWriter("3nums2.txt"));
        writer2.println(2);
        writer2.println(7);
        writer2.println(9);
        writer2.flush();
        writer2.close();
        PrintWriter writer3 = new PrintWriter(new FileWriter("3nums3.txt"));
        writer3.println(5);
        writer3.println(6);
        writer3.println(4);
        writer3.flush();
        writer3.close();
        
        System.out.println("Please choose which file to open: (1, 2, or 3)");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        String openFile = "";
        if (choice == 1){
            openFile = "3nums.txt";
        } else if (choice == 2){
            openFile = "3nums2.txt";
        } else if (choice == 3){
            openFile = "3nums3.txt";
        }
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader(openFile)));
        int fileNums = 0;
        while(reader.hasNextInt()){
            fileNums += reader.nextInt();
        }
        reader.close();
        System.out.println("Number sum from file is = "+fileNums);
    }
}
