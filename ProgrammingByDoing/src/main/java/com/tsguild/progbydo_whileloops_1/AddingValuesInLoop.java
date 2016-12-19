/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_whileloops_1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddingValuesInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int total = 0;
        int num;
        
        System.out.println("I will add up the number you give me.");
        do {
            System.out.println("Number: ");
            num = sc.nextInt();
            total += num;
            System.out.println("THe total so far is " + total);
        } while (num != 0);
        System.out.println("The total is " + total);
    }
}
