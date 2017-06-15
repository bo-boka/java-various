/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sarah
 */
public class RemoveDuplicates {
    
    public static void main(String[] args) {
        String s = "abcbdb";
//        String s = "abcbefb";
        System.out.println(removeDupesNoBuffer(s));
    }
    public static String removeDupesWSet(String s){
        String[] arr = s.split(""); // turning String into array, can't use toCharArray because Set accepts only objects, not primitives
        Set<String> set = new HashSet<>();
        set.addAll(Arrays.asList(arr)); //then turning array to list and then adding to set which doesn't accept duplicates
        return String.join("", set); //turning set back to String
        
//        set.forEach(System.out::println); //fancy way to print set elements
    }
    
    public static String removeDupesNoBuffer(String s){ 
	char[] str = s.toCharArray();
	int len = s.length();
	int numDupes = 0;
	int i, j;
	for (i = 0; i < len-1; i++){
            for (j = i+1; j < len - numDupes; j++){
                if (str[i] == str[j]) {				
                    numDupes++;
                    if (j == len - numDupes){
                            str[j] = 0;
                    } else if (str[j] == str[len-numDupes]){ 
                            while (str[j] == str[len-numDupes] && j != len - numDupes){
                                    numDupes++;
                            }
                            str[j] = str[len-numDupes];
                    } else {
                            str[j] = str[len-numDupes];
                    }						
                }
            } // abcbdb
	}
        System.out.println(Arrays.toString(str));
	return new String(str).substring(0, len-numDupes);
    }
}
