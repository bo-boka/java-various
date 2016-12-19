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
public class SummingThreeNumbersInFile {
    public static void main(String[] args) throws IOException {
        
        PrintWriter writer = new PrintWriter(new FileWriter("3nums.txt"));
        writer.println(3);
        writer.println(4);
        writer.println(1);
        writer.flush();
        writer.close();
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader("3nums.txt")));
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        while(reader.hasNextInt()){
            num1 = reader.nextInt();
            num2 = reader.nextInt();
            num3 = reader.nextInt();
        }
        int fileNums = num1 + num2 + num3;
        reader.close();
        System.out.println(num1+" + "+ num2+" + "+ num3 +" = "+fileNums);
    }
}
