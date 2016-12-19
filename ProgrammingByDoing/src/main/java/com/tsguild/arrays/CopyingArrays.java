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
public class CopyingArrays {
    public static void main(String[] args) {
        
    int[] arr = new int[10];
    Random rand = new Random();
    
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(101)+1;
        }
        
        int[] copyArr = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            copyArr[i] = arr[i];
        }
        
        arr[9] = -7;
        
        System.out.print("Array 1: ");
        for (int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.print("Array 2: ");
        for (int elem : copyArr){
            System.out.print(elem + " ");
        }
    }
}
