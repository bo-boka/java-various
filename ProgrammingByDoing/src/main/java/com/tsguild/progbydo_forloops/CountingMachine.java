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
public class CountingMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Count to: ");
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
    }
}
