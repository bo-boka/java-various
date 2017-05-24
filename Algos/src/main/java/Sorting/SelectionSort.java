/*
 *  Copyright 2017 SarahBoka
 */

package Sorting;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class SelectionSort {
    //combination of searching and sorting
    //inner loop finds target value (smallest or largest) and outer loop places 
        //it towards end as it decrements 
    //inefficient because no way to end sort early even it begins w/ sorted arr
    public static void main(String[] args) {
        
        int[] arr = {43, 52, 17, 65, 64, 17, 34, 1, 49};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }
    
    public static int[] sortAscending(int[] arr){
        int i, j, temp;
        for (i = arr.length - 1; i > 0; i--) {
            int target = 0;
            for (j = 1; j <= i; j++) {
                if (arr[j] > arr[target]){
                    target = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[target];
            arr[target] = temp;
        }
        return arr;
    }
}
