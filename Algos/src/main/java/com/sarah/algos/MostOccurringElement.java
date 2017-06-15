/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class MostOccurringElement {
    //find the element that occurs the most in a string
    public static void main(String[] args) {
        String s = "bcadabdbbbdeedadad";
        System.out.println(mostOccurringElem(s));
    }
    
    public static char mostOccurringElem(String s){
	char[] str = s.toCharArray();
	int max = 0;
	int count = 0;
	char maxElem = str[0];
	int len = str.length;
        int i, j;
	for (i = 0; i < len-1; i++){
		for (j = i+1; j < len; j++){
			if (str[i] == str[j]){
				count++;				
			}
		}
		if (count > max){
			max = count;
			maxElem = str[i];
		}
                count=0;
	}
	return maxElem;
    }
}
