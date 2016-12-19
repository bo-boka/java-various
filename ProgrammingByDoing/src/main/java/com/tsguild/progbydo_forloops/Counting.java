/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_forloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Type in a message, and I'll display it five times.");
        System.out.println("Message: ");
        String message = sc.nextLine();
        
        for (int n = 2; n <= 10; n = n+2) {
            System.out.println(n + ". " + message);
        }
    }// n = n+1 adds 1 to n each time the loop is executed
    // int n = 1 declares and initializes the variable and puts the value of 1 in n
    
    
}
