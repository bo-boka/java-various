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
public class LocatingLargestArrayValue {
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
        int slot = 0;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == highVal){
                slot = i;
            }
        }
        System.out.println("\nThe largest value is " + highVal+" in slot "+ slot);
    
    }
}
