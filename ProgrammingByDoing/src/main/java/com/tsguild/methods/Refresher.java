/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class Refresher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("What is your name:");
        String name = sc.next();
        int count = 10;
        if (name.equals("Mitchell")){
            count = 5;
        }
        for (int i = 1; i <= count; i++) {
            System.out.println(name);
        }
    }    
    
}
