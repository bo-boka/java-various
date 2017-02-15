/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class MultidemMatrixHourglassMaxSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 6 lines of 6 nums separated by space:");
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }       
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < 4; i++){           
            for (int j = 0; j < 4; j++){  
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > max){
                    max = sum;
                    sum = 0;
                }
                sum = 0;
            }            
        }
        System.out.println(max);
    }
}
