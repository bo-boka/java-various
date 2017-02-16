/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

/**
 *
 * @author Sarah
 */
public class MaxDiffInArray {
    public static void main(String[] args) {
        
        int[] elements = {1, 2, 5};
        
        int len = elements.length - 1;
        int maximumDifference = 0;
        for (int  i = 0; i < len; i++){
            for (int j = i+1; j <= len; j++){
                int diff = Math.abs(elements[i] - elements[j]);  
                if (diff > maximumDifference) maximumDifference = diff;
            }
        }
        System.out.println(maximumDifference);
    }
}
