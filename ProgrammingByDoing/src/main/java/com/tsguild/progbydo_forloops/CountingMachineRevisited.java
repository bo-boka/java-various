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
public class CountingMachineRevisited {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Count from: ");
        int start = sc.nextInt();
        System.out.println("Count to: ");
        int end = sc.nextInt();
        System.out.println("Count by: ");
        int step = sc.nextInt();
        
        for (int i = start; i < end; i+=step) {
            System.out.println(i + " ");
        }
    }
}
