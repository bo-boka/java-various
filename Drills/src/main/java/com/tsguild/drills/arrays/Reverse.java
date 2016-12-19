/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

/**
 *
 * @author apprentice
 */
public class Reverse {
//    Given an numbers of ints length 3, return a new numbers with the elements in reverse order, 
//            so for example {1, 2, 3} becomes {3, 2, 1}. 

    public int[] reverse(int[] numbers) {
        for (int i = 0; i < numbers.length / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - 1 - i];
            numbers[numbers.length - 1 - i] = temp;
        }
        return numbers;
    }
}
