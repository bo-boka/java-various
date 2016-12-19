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
public class SafeSqRoot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("SQUARE ROOT!");
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        while (num <= 0) {
            System.out.println("Number has to be greater than 0.");
            System.out.println("Try again:");
            num = sc.nextInt();
        }
        double sqRtNum = Math.sqrt(num);
        System.out.println(sqRtNum);
    }
}
