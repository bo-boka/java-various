/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class TestTheTests {
    public static void main(String[] args) {
        
        
        int[] numbers = {1, 1, 2, 1, 2, 3};
        int[] arr123 = {1, 2, 3};
        boolean isIn = false;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (Arrays.equals(Arrays.copyOfRange(numbers, i, i+3), arr123)) {
                isIn = true;
            }
        }
        System.out.println(isIn);
    }
    
}
