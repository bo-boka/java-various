/*
 *  Copyright 2017 SarahBoka
 */

package Sorting;

import java.util.Arrays;
import java.util.Random;

/*
 * @author Sarah
 */

public class Quicksort {
    public static void main(String[] args) {
        int[] a = {5, 2, 4, 7, 8, 1, 9, 3};
        System.out.println(Arrays.toString(quicksort(a)));
    }
    
    public static int[] quicksort(int[] a){
        
        int[] b = new int[a.length];
        
        //ideally you would choose pivot that won't yeild worst case scenario by getting 3 random numbers and choosing middle
        //but for now, choose last index
        int pivot = a[a.length-1];
        //create wall
        
        if ()
//        int wall = a[i-1];
//        int current = a[i];
        return b;
    }
}
