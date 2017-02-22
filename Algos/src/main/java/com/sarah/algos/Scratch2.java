/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Scratch2 {
    public static void main(String[] args) {
        System.out.println(divisorSum(6));
    }
    
    public static int divisorSum(int n){
        int sum = 0;
        for (int i = 1; i < n+1; i++){
            if (n % i == 0){
                sum += i;
            }
        }
        return sum;
    }
}
