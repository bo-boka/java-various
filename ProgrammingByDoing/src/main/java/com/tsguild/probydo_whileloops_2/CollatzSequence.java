/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.probydo_whileloops_2;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CollatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Starting number:");
        int num = sc.nextInt();
        
        while (num != 1){
            if (num % 2 == 0){
                num /= 2;
            } else {
                num = num * 3 + 1;
            }
            System.out.println(num);
        }
    }
}
