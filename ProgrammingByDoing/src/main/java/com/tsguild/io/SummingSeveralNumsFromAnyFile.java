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
public class SummingSeveralNumsFromAnyFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("While file to open? ");
        String file = sc.next();
        
        int fileStuff = 0;
        Scanner reader = new Scanner(new BufferedReader(new FileReader(file)));
        while (reader.hasNextInt()){
            fileStuff += reader.nextInt();
        }
        System.out.println(fileStuff);
    }
}
