/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.spacetimecomplexity;

import java.util.Scanner;

/*
 * @author Sarah
 */

public class Primality {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        int len = scan.nextInt();
        for (int i = 0; i < len; i++){
            System.out.println(isPrime(scan.nextInt()) ? "Prime" : "Not prime");
        }
    }
    
    public static boolean isPrime(int n){
        if (n < 2)return false;
        else {
            for (int i = 2; i <= (int) Math.sqrt(n); i++){
                if (n % i == 0) return false;
            }
            return true;
        }
    }
}
