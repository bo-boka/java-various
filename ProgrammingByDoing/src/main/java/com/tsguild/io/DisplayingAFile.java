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
public class DisplayingAFile {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Please choose which file to open: ");
        Scanner sc = new Scanner(System.in);
        String openFile = sc.next();
        
        Scanner reader = new Scanner(new BufferedReader(new FileReader(openFile)));
        String fileStuff = "";
        while(reader.hasNextLine()){
            fileStuff += reader.nextLine() + "\n";
        }
        reader.close();
        System.out.println(fileStuff);
    }
}
