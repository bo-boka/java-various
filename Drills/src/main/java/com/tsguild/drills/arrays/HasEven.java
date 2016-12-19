package com.tsguild.drills.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author apprentice
 */
public class HasEven {
//    Given an int array , return true if it contains an even number (HINT: Use Mod (%)). 
//
//hasEven({2, 5}) -> true
//hasEven({4, 3}) -> true
//hasEven({7, 5}) -> false

    public boolean hasEven(int[] numbers) {

        for (int n : numbers) {
            if (n % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
