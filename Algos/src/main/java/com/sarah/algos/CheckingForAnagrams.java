/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos;

/*
 * @author Sarah
 */

public class CheckingForAnagrams {
    
    public static int numberNeeded(String first, String second) { //using StringBuiler on both strings because can't iterate through
                                                                  //string > 1000 chars, seemingly without it
        
        String newString = "";
        StringBuilder b = new StringBuilder(second); 
        StringBuilder a = new StringBuilder(first); 

        int count = 0;
        int i = 0;
        
        while (!b.toString().isEmpty() && i < a.length()){
            int j;
            for (j = 0; j < b.length(); j++){
                if (a.charAt(i) == b.charAt(j)) {
                    count++;
                    break;
                } 
            }
            if (count > 0) b.deleteCharAt(j);
            else newString += a.charAt(i);
            i++;
            count = 0;
        }
        return newString.length() + b.length();
    }
    
    public static void main(String[] args) {
        String a = "zt";
        String b = "ztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoendztdkfslsfasdiwoend";
        
        System.out.println(numberNeeded(a, b));
    }
}

//psuedocode
//
//String s = "";
//turn string b into StringBuiler
//int sum;
//
//while b is not empty or loop is not finished
//	for each char in string a
//		if not in string b then 
//			add to new string
//		else
//			remove from string b
//			break to stop checking
//		
//sum = string b length + new string length 