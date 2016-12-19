/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

/**
 *
 * @author apprentice
 */
public class FindingPrimeNumbers {
    
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
        
    }
    
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0){
            return true;
        }   else {
            return false;
        }
    }
}
