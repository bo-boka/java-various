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
public class Sum {
//    Given an array of ints, return the sum of all the elements. 
//
//sum({1, 2, 3}) -> 6
//sum({5, 11, 2}) -> 18
//sum({7, 0, 0}) -> 7

    public int sum(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        } else {
            int total = 0;
            for (int s : numbers) {
                total += s;
            }
            return total;
        }
    }
}
