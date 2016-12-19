/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DisplayingSomeMultiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a number:");
        int num = sc.nextInt();
        
        for (int i = 1; i <= 12; i++) {
            System.out.println(i + "x" + num + " = " + (i * num));
        }
    }
}
