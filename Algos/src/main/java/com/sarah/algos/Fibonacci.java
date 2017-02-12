/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Fibonacci {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter sequence index: ");
        int n = scan.nextInt();
    
        BigInteger a = BigInteger.valueOf(0);           
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(0);
        
        for (int i = 0; i < n-1; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
