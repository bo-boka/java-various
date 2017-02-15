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
        int num = 6;
        String[] arr = {" "," "," "," "," "," "};
        
        for (int i = 0; i < 6; i++){
            System.out.println();
            for (int j = 0; j < i; j++) {
                arr[i] = "#";
            }
            System.out.print(Arrays.toString(arr));
        }
        
        
    
    }
}
