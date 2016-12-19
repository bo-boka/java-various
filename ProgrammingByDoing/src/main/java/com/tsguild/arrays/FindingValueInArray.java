/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FindingValueInArray {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50)+1;
        }
        
        System.out.print("Array: ");
        
        for (int elem : arr){
            System.out.print(elem+" ");
        }
        System.out.println();
        System.out.println("Give me a value to find: ");
        int val = sc.nextInt();
        
        for (int elem : arr){
            if (val == elem){
                System.out.println(elem+" is in the array.");
            }
        }
    }
}
