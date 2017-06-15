/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class AnagramStrings {
    public static void main(String[] args) {
        String a = "abccd";
        String b = "bcadc";
        System.out.println(areAnagrams(a, b));
    }
    
    public static boolean areAnagrams(String a, String b){
	if (a == null || b == null) return false;
	if (a.length() != b.length()) return false;
	StringBuilder newA = new StringBuilder(a);
        int i, j;
	for (i = 0; i < b.length(); i++){
		for (j = 0; j < newA.length(); j++){
			if (b.charAt(i) == newA.charAt(j)){
				newA.deleteCharAt(j);
				break;
			} 
			if (j == newA.length() - 1) return false;
		}		
	}
//        return newA.length() == 0;
        return true;
    }
}
