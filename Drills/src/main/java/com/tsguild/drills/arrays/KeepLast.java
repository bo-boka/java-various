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
public class KeepLast {
//        Given an int array, return a new array with double the length where its last element is the same as the original array,
//    and all the other elements are 0. The original array will be length 1 or more. 
//    Note: by default, a new int array contains all 0's. 
//
//    keepLast({4, 5, 6}) -> {0, 0, 0, 0, 0, 6}
//    keepLast({1, 2}) -> {0, 0, 0, 2}
//    keepLast({3}) -> {0, 3}

    public int[] keepLast(int[] numbers) {
        if (numbers == null) return numbers;
        int len = numbers.length;
        int[] newArr = new int[len * 2];
        newArr[newArr.length-1] = numbers[len-1];
        return newArr;
    }
}
