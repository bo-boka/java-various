/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.loops;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class Array123 {
//        Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere. 
//
//    array123({1, 1, 2, 3, 1}) -> true
//    array123({1, 1, 2, 4, 1}) -> false
//    array123({1, 1, 2, 1, 2, 3}) -> true

    public boolean array123(int[] numbers){ //have no idea why this test doesn't pass
        int[] arr123 = {1, 2, 3};
        boolean isIn = false;
        for (int i = 0; i < numbers.length - 2; i++) {
            if (Arrays.equals(Arrays.copyOfRange(numbers, i, i+3), arr123)) {
                isIn = true;
            }
        }
        return isIn;
    } 
}
