/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.probydo_whileloops_2;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class RightTriChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");
        System.out.println("Side 1: ");
        int s1 = sc.nextInt();
        System.out.println("Side 2: ");
        int s2  = sc.nextInt();
        
        while (s1 > s2){
            System.out.println(s1 + " is smaller than " + s2 + ". Try again.");
            System.out.println("Side 2: ");
            s2  = sc.nextInt();
        }
        System.out.println("Side 3: ");
        int s3  = sc.nextInt();
        while (s2 > s3){
            System.out.println(s2 + " is smaller than " + s3 + ". Try again.");
            System.out.println("Side 3: ");
            s3  = sc.nextInt();
        }
        if ((s1 * s1) + (s2*s2) == (s3*s3)){
            System.out.println("Your three sides are " + s1 +" "+ s2 + " "+ s3);
            System.out.println("These sides *do* make a right triangle!");
        } else {
            System.out.println("NO! These sides do not make a right triangle!");
        }
    }
}
