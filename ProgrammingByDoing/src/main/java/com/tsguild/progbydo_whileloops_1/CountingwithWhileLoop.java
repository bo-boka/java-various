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
public class CountingwithWhileLoop {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
         System.out.println("Type in a message, and I'll display it five times.");
         System.out.println("Message: ");
         String message = sc.next();
         System.out.println("How many times would you like it to display?");
         int num = sc.nextInt();
         
         int n = 0;
         while (n < (num * 10)){
             System.out.println((n + 10) + ". " + message);
             n = n + 10;
         }
    }// n++ adds 1 to n each time the loop executes
    //
}
