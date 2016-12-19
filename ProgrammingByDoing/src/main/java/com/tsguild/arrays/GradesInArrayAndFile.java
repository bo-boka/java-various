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
public class GradesInArrayAndFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        //still need to output into file
        System.out.println("Name (first last): ");
        String name = sc.nextLine();
        System.out.println("Filename: ");
        String file1 = sc.nextLine();
        
        int[] grades = new int[5];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = rand.nextInt(100)+1;
        }
        System.out.println("Here are your randomly-selected grades (hope you pass):");
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Grade "+ i +": "+grades[i]);
        }
        
    }
}
