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
public class WhereIsIt {

    public static void main(String[] args) {

        int[] arr = new int[10];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(50) + 1;
        }
        System.out.println("Array: ");
        for (int elem : arr) {
            System.out.print(elem + " ");
        }

        System.out.println("\nValue to find: ");
        int val = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                System.out.println(val + " is in slot " + i);
                count++;
            }
        }
        if (count == 0) {
            System.out.println(val + " is not in the array.");
        }

    }
}
