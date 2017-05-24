/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * @author Sarah
 */

public class IsUniqueString {
    public static void main(String[] args) {
        //returns true if every character is unique
        System.out.println(isUniqueNoDataStructure("abcda"));
        System.out.println(isUnique("abcda"));
    
    }
    
    //another solution w/o data structure would be to sort the string and then check for repeating neighbors
    //this would take no data structure and be cheaper than O(n^2)
    public static boolean isUniqueNoDataStructure(String s){
	int tail = 0;
	int len = s.length();
	while (tail < len - 1){
		for (int i = tail+1; i < len; i++){
			if (s.charAt(tail) == s.charAt(i)){
				return false;
			}			
		}
		tail++;
	}
	return true;
    }
    
    //solution using data structure
    public static boolean isUnique(String s){
	Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (!set.add(s.charAt(i))) return false;
        }
        return true;
    }
    
    
}
