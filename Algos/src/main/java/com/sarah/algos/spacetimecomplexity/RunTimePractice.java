/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.spacetimecomplexity;

import java.util.Arrays;
import java.util.HashMap;

/*
 * @author Sarah
 */

//Asymptotic Analysis: mean of discussing general efficiency of an algorithm
//In time complexity, 'n' represents size of data set being processed
//look at its growth rate as n approaches infinity
// i.e., how does it grow as a function of time — especially as  gets large?

//Four main types of complexities from fastest to slowest, depending:
//Constant:     O(1)            declarations, instantiations, comparisons
//Logarithmic:  O(log(n))       binary search
//              O(n log n)
//Linear:       O(n)            loops
//              
//Quadratic:    O(^2)           nested loops

//to find the running time, find the dominant operation 
//(operation that takes up the most amount of time), i.e. upper bound
public class RunTimePractice {
    // Linear time: O(n)
    public static int findRepetitions(String s, char c){
        int sum = 0; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n+1, n
            if(s.charAt(i) == c) sum++; // n
        }
        return sum; // 1
    }
    
    //Quadratic time: O(n * m)
    // brute force solution because every single outcome is checked unnecessarily
    // i.e. even though we already found matching char, we still check the rest of the chars
    public static int[] findRepetitionsV1(String s, char[] c){
        int[] tally = new int[c.length]; // 1
        for (int i = 0; i < s.length(); i++) { // 1, n +1, n
            for (int j = 0; j < c.length; j++) { // n(pretty sure), n*m + 1, n*m
                if (s.charAt(i) == c[j]){ // n*m
                    tally[j] += 1; // n*m
                }
            }
        }
        return tally; // 1
    }
    
    //Optiimal time = the size of our input equals the size of our solution
    //using a data structure takes up more space but can save on runtime
    // Optimal time: O(n+m)
    public static int[] findRepetitionsV2(String s, char[] c){
        int[] tally = new int[c.length]; // 1
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            } else {
                int num = map.get(s.charAt(i));
                map.put(s.charAt(i), num+1);
            }
        }
        for (int j = 0; j < c.length; j++) {
            if (!map.containsKey(c[j])){
                tally[j] = 0;
            } else {
                tally[j] = map.get(c[j]);
            }
        }
        return tally;
    }

    public static void main(String[] args) {
        
        long startTime = System.currentTimeMillis();
        System.out.println(findRepetitions("abcabdefad", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test: "+ duration);
        
        char[] tally = {'a', 'b', 'z'};
        startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(findRepetitionsV1("zzzzzzzzzzzzzzzzzzzYYYYYYYYYYYYYDDDDDDDDDDDDJJJJJJJJJJJJJJJRRRRRRRRRRRRRRRRLLLLLLLLLLLLLLLLLLFFFFFFFFFFFFFFFFFFFFFFFPPPPPPPPPPPPPPPPPVVVVVVVVVVVVVVVVVBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAADDDDDDDDDDDDDDDDOOOOOOOOOOOOOOAAAAAAAAAAAAAAACCCCCCCCCCCCCCWWWWWWWWWWWWWWWWWWWWWDDDDDDDDDDDDDDDDDDDDIIIIIIIIIIIIIBBBBBBBBBBBBBBJJJJJJJJJJJNNNNNNNNNNNDDDDDDDDDDMMMMMMMMMMSSSSSSSSSSSSAAAAAAAAAAACCCCCCCCabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefadabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefadabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefad", tally)));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: "+ duration);
        
        startTime = System.currentTimeMillis();
        System.out.println(Arrays.toString(findRepetitionsV2("zzzzzzzzzzzzzzzzzzzYYYYYYYYYYYYYDDDDDDDDDDDDJJJJJJJJJJJJJJJRRRRRRRRRRRRRRRRLLLLLLLLLLLLLLLLLLFFFFFFFFFFFFFFFFFFFFFFFPPPPPPPPPPPPPPPPPVVVVVVVVVVVVVVVVVBBBBBBBBBBBBBBBBBBAAAAAAAAAAAAAADDDDDDDDDDDDDDDDOOOOOOOOOOOOOOAAAAAAAAAAAAAAACCCCCCCCCCCCCCWWWWWWWWWWWWWWWWWWWWWDDDDDDDDDDDDDDDDDDDDIIIIIIIIIIIIIBBBBBBBBBBBBBBJJJJJJJJJJJNNNNNNNNNNNDDDDDDDDDDMMMMMMMMMMSSSSSSSSSSSSAAAAAAAAAAACCCCCCCCabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefadabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefadabcafd;djfs'eopghiodknvoiudfkjhsdfukeyhjbfsdjkxieiuyesj,fdljkcnksdnkjshdfjkshdfbdefad", tally)));
        endTime = System.currentTimeMillis();
        duration = endTime - startTime;
        System.out.println("Test: "+ duration);
    }
}
