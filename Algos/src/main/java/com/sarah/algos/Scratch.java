/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Scratch {
    
   
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverseCString(arr)));
    }
    
    public static int[] reverseCString(int[] arr){
	int temp;
	for (int i = 0; i < (arr.length)/2; i++){
		temp = arr[i];
		arr[i] = arr[arr.length - (i + 1)];
		arr[arr.length - (i + 1)] = temp;
		
	}
	return arr;
    }
}
