/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class RotateLeftNTimes {

    public static void main(String[] args) {
        //n is array size given
        //d is number of shifts
        int[] givenArr = {2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(shiftArrTimeComplexity(givenArr, 4)));
        System.out.println(Arrays.toString(shiftArrSpaceComplexity(givenArr, 4)));
        
    }
    
    public static int[] shiftArrTimeComplexity(int[] a, int s){//used a data structure
        
        int n = a.length; 
        int[] newA = new int[n];
        for (int i = 0; i < n; i++){
            if (i-s < 0) newA[n - Math.abs(i - s)] = a[i];
            else newA[i - s] = a[i];
        }
        return newA;
    }
    
    public static int[] shiftArrSpaceComplexity(int[] a, int s){//nested loop
        int n = a.length; 
        int temp;
        for (int i = 0; i < s; i++){
            temp = a[0];
            for (int j = 0; j < a.length-1; j++){
                a[j] = a[j+1];
            }
            a[n-1] = temp;
        }
        return a;
    }
}

//psuedocode
	 
//solving for time complexity:
//
//int[] newArr = new int[n];
//for arr.length 
//	newArr[arr.length - abs(arr[i] - d)] = arr[i];
//	
//	
//solving for space complexity:
//
//int temp; 	
//for length of shifts
//	temp = a[0]
//	for a.length-1		
//		a[j] = a[j+1]
//	end loop
//	a[length-1] = temp
//end loop
//	
//===============	
//	
//	[7] [8] [9] [10] [11] [12]  length = 6;
//	 0   1   2   3    4     5
//	 