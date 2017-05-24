/*
 *  Copyright 2017 SarahBoka
 */

package Sorting;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class InsertionSort {

    //can be very fast/efficient w small arrays, but not larger
    public static void main(String[] args) {
        
        int[] arr = {43, 52, 17, 65, 64, 17, 34, 1, 49};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }
    
    public static int[] sortAscending(int[] arr){
        int i, j, key;
        for (i = 1; i < arr.length; i++) {
            key = arr[i];
            for (j = i - 1; j >= 0 && arr[j] > key; j--) { //change to < to sort
                arr[j+1] = arr[j];                          //descending
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
