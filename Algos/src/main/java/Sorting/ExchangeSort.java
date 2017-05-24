/*
 *  Copyright 2017 SarahBoka
 */

package Sorting;

import java.util.Arrays;

/*
 * @author Sarah
 */

public class ExchangeSort {

    //sorts ascending
    //NOT efficient, but slightly better than bubble
    public static void main(String[] args) {
        int[] arr = {43, 52, 17, 65, 64, 17, 34, 1, 49};
        System.out.println(Arrays.toString(sortAscending(arr)));
    }
    
    public static int[] sortAscending(int[] arr){
        int i, j, temp;
        for (i = 0; i < arr.length -1; i++) {
            for (j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
