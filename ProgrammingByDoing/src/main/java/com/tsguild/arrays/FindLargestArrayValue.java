/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arrays;

import java.util.Random;

/**
 *
 * @author apprentice
 */
public class FindLargestArrayValue {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.print("Array: ");
        for (int elem : arr) {
            System.out.print(elem+" ");
        }
        int highVal = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > highVal) {
                highVal = arr[i];
            }
        }
        System.out.println("\nThe largest value is " + highVal);
    }
}
