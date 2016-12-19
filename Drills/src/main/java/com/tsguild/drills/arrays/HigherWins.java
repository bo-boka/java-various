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
public class HigherWins {
//        Given an array of ints, figure out which is larger between the first and last elements in the array, 
//    and set all the other elements to be that value. Return the changed array. 
//
//    higherWins({1, 2, 3}) -> {3, 3, 3}
//    higherWins({11, 5, 9}) -> {11, 11, 11}
//    higherWins({2, 11, 3}) -> {3, 3, 3}

    public int[] higherWins(int[] numbers) {
//        int highNum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] > highNum){
//                highNum = numbers[i];
//            }
//        }
//        int[] newArr = new int[numbers.length];
//        for (int i = 0; i < numbers.length; i++) {
//            newArr[i] = highNum;
//        }
//        return newArr;

        int highNum = 0;
        if (numbers[0] > numbers[numbers.length-1]){
            highNum = numbers[0];
        } else if (numbers[0] < numbers[numbers.length-1]){
            highNum = numbers[numbers.length-1];
        } else {
            highNum = numbers[0];
        }
        int[] newArr = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            newArr[i] = highNum;
        }
        return newArr;
    }
}
