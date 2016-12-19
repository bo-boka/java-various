/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_forloops;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class AddingValuesForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Number: ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nThe sum is " + sum);
    }
}
