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
        int[] a = {1, 1, 1, 2}; 
        System.out.println(Arrays.toString(quickSortLongV(a))); 
    }
    
    public static int[] quickSortLongV(int[] arr){
        //to sort arrays with repeat digits, check if array has all same
        //also checks if array has 1 element
        boolean sameOr1 = true;
        for (int n : arr){
            if (arr[0] != n) sameOr1 = false;
        }
        if (sameOr1){ //base case for recursive call
            return arr;
        } else {
            int pivot = arr[arr.length - 1];
            int wall = -1;
            int i, temp;
            for (i = 0; i < arr.length; i++){
                    if (pivot > arr[i]){
                            wall++;
                            if (wall != i){
                                    temp = arr[i];
                                    arr[i] = arr[wall];
                                    arr[wall] = temp;
                            }
                    }
            }
            wall++;
            for (i = arr.length-1; i > wall; i--){ //shifting elements to
                    arr[i] = arr[i-1];              //insert pivot
            }
            
            arr[wall] = pivot;  //inserting pivot
            //creating 2 arrays out from each side of pivot/wall
            int[] arr1 = new int[wall];
            int[] arr2 = new int[arr.length - wall];
            for (i = 0; i < wall; i++){
                    arr1[i] = arr[i];
            }
            for (i = 0; i < arr2.length; i++){
                    arr2[i] = arr[i+wall];
            }
            System.out.println("sorted: "+Arrays.toString(arr));
            System.out.println("1 half: "+Arrays.toString(arr1));
            System.out.println("2 half: "+Arrays.toString(arr2));
//            recursive call on each side
            return addArrays(quickSortLongV(arr1), quickSortLongV(arr2));
        }
    }
    
    public static int[] addArrays(int[] a, int[] b){
        int[] arr = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (a.length > i){
                    arr[i] = a[i];
            } else {
                    arr[i] = b[count];
                    count++;
            }
        }
        return arr;
    }
}

//psuedocode...

//arr = {1, 2, 6, 4, 11, 9, 5}
//
////first split array into 2 sides larger and smaller than pivot
//int pivot = last element value
//int wall = zeroith - 1
//int i = 0
//
//for i in arr
//	if i is smaller than pivot
//		wall++
//		swap i and wall

////so far: arr = {1, 2, 4, 6, 11, 9, 5}
//		
////put pivot where it belongs at end of wall by shifting elements:
//temp = pivot
////loop starting from end to wall
//for i = arr.length-1; i > wall; i--
//	arr[i] = arr[i-1]
//pivot goes into wall position + 1		
//		
////so far: arr = {1, 2, 4, 5, 6, 11, 9}
//
////do it again on either side of wall recursively:
////use 2 for loops to put each side into array and call quickSort()
////make base case:
//!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!if (arr.length == 1) return arr;
////arr = quickSort(arr1) + quickSort(arr2)
//int[] arr1 = new int[wall];
//int[] arr2 = new int[arr.length - (wall + 1)];
//for (i = 0; i < wall; i++){
//	arr1[i] = arr[i];
//}
//for (i = 0; i < arr2.length; i++){
//	arr2[i] = arr[i+wall+1];
//}
//qArr1 = quickSort(arr1);
//qArr2 = quickSort(arr2);
//int count = 0;
//for (i = 0; i < arr.length; i++){
//	if (arr1.length > i){
//		arr[i] = arr1[i];
//	} else {
//		arr[i] = arr2[count];
//		count++;
//	}
//}