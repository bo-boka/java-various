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
public class Count9 {
//        Given an array of ints, return the number of 9's in the array. 
//
//    count9({1, 2, 9}) -> 1
//    count9({1, 9, 9}) -> 2
//    count9({1, 9, 9, 3, 9}) -> 3

    public int count9 (int[] numbers) {
        int count = 0;
        for (int n : numbers){
            if (n == 9){
                count++;
            }
        }
        return count;
    }
}
