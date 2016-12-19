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
public class BasicArray2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100)+1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Slot "+ i +" contains a "+ arr[i]);
            
        }
    }
}
