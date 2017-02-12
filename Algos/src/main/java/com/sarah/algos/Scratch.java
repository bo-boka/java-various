/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Scratch {

public static void main(String[] args) {
        System.out.println("Enter stuff: ");

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int numCases = scan.nextInt();
        for (int i = 1; i <= numCases; i++){
            String s = scan.next();
            char[] cArr = s.toCharArray();
            for (int j = 0; j < cArr.length; j++){
                if (j % 2 == 0) System.out.print(cArr[j]);
            }
            System.out.print(" ");
            for (int k = 0; k < cArr.length; k++){
                if (k % 2 != 0) System.out.print(cArr[k]);
            }
            System.out.println();
        }
        
        
    
    }
}
