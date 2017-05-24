/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class ReverseArray {

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
