/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class Sort2Arrays {

//    Write a function that, give two sorted lists of integers, returns the two lists merged together in a single ordered list. Make the function as efficient as possible.
//
//Example: for inputs [1,4,8,12] and [2,5,7,8,9], the function should return [1,2,4,5,7,8,8,9,12].

    public static int[] sort(int[] a, int[] b){

        ArrayList<Integer> sortedArr = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {

            if (a[i] < b[i]) {
                sortedArr.add(a[i]);
                sortedArr.add(b[i+1]);
            } else {
                sortedArr.add(b[i]);
                sortedArr.add(a[i+1]);
            }
        }

    }


    public static int[] sort(int[] a, int[] b){

        ArrayList<Integer> sortedArr = new ArrayList<>();

        int j=0;
        for (int i = 0; i < a.length;) {

            if (a[i] < b[j]) {
                sortedArr.add(a[i]);
                i++;
            } else {
                sortedArr.add(b[j]);
                j++;
            }
        }


         1, 2, 4, 5, 7, 8, 8, 
    }
}
