/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.loops;

/**
 *
 * @author apprentice
 */
public class ArrayFront9 {
//        Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
//    The array length may be less than 4. 
//
//    arrayFront9({1, 2, 9, 3, 4}) -> true
//    arrayFront9({1, 2, 3, 4, 9}) -> false
//    arrayFront9({1, 2, 3, 4, 5}) -> false

    public boolean arrayFront9(int[] numbers) {
        int count = 0;
        if (numbers.length < 4){
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == 9){
                    count++;
                }
            }
        } else {
            for (int i = 0; i < 4; i++) {
                if (numbers[i] == 9){
                    count++;
                }
            }
        }
        if (count > 0){
            return true;
        } else {
            return false;
        }
    }
}
