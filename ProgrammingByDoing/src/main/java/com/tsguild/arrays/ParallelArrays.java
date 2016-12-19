/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arrays;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ParallelArrays {
    public static void main(String[] args) {
        
        String[] namesA = {"Bob", "Sue", "Betty"};
        double[] gradesA = {73.5, 92.5, 83.7};
        int[] idA = {3847, 8748, 4902};
        
        for (int i = 0; i < namesA.length; i++) {
            System.out.println(namesA[i] +" "+ gradesA[i]+" "+idA[i]);
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ID number: ");
        int iD = sc.nextInt();
        int choice=0;
        for (int i = 0; i < namesA.length; i++) {
            if (iD == idA[i]){
                choice = i;
            }
        }
        
        System.out.println("Name: " +namesA[choice]); 
        System.out.println("Grade: "+gradesA[choice]);       
        System.out.println("ID #; "+idA[choice]);              
    }
}
