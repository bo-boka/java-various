/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import static java.lang.Integer.max;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class IntToBinaryCountConsecutive1s {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter base-10 number:");
        
        System.out.println(binary1s(scan.nextInt()));
        
    }
    
    public static int binary1s(int n){
            
            String bi = "";
            int count = 0;
            int max = 0;
            while (n > 0){
                bi += n%2;
                n = n/2;
            }
//            bi += 0;
            for (int i = 0; i < bi.length(); i++){
                if (bi.charAt(i) == '1') {
                    count++;              
                } else {
                    if (count >= max){
                        max = count;
                        count = 0;
                    }
                    count = 0;
                }
            }
            if (count > max) max = count;
            
            return max;
        }
}
