/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class BubbleSort {
    public static void main(String[] args) {
    //sorts array in ascending order and prints a count of the number of sorts
    //bubble sort is NOT an efficient sorting algo
        int[] a = {1, 3, 2};
        int temp;
        int count = 0;
        int endPosition = 1;
        int swapPosition;
        while (endPosition > 0) {
            swapPosition = 0;
            for (int i = 0; i < a.length-1; i++){
                if (a[i] > a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                    count++;
                    swapPosition = i;
                }
            }
        }
        System.out.println(count);
    
    }
}
