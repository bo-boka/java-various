/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class Merge2SortedArrays {

//    Write a function that, give two sorted lists of integers, 
//    returns the two lists merged together in a single ordered list. 
//    Make the function as efficient as possible.
//
//Example: for inputs [1,4,8,12] and [2,5,7,8,9] 
//      the function should return [1,2,4,5,7,8,8,9,12].
    public static void main(String[] args) {
        int[] a = {1, 4, 8, 12};
        int[] b = {2, 5, 7, 8, 9, 15};
        System.out.println(Arrays.toString(sort2(a, b)));
    }

    public static int[] sort2(int[] a, int[] b){
	int countA = 0;
	int countB = 0;
	int[] arr = new int[a.length + b.length];
	for (int i = 0; i < arr.length; i++){
            if (countA < a.length && countB < b.length){
                if (a[countA] < b[countB]){
                    arr[i] = a[countA];
                    countA++;
                } else {
                    arr[i] = b[countB];
                    countB++;
                }
            } else {
                if (countA == a.length){
                    arr[i] = b[countB];
                    countB++;
                } else {				
                    arr[i] = a[countA];
                    countA++;
                }
            } 		
	}
	return arr;
    }

}
