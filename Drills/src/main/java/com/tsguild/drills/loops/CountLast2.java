/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.loops;

/**
 *
 * @author apprentice
 */
public class CountLast2 {
//        Given a String, return the count of the number of times that a subString length 2 appears in the String 
//    and also as the last 2 chars of the String, so "hixxxhi" yields 1 (we won't count the end subString). 
//
//    countLast2("hixxhi") -> 1
//    countLast2("xaxxaxaxx") -> 1
//    countLast2("axxxaaxx") -> 2

    public int countLast2(String str) {
        if (str.length() < 2){
            return 0;
        } else {
            int count = 0;
            String endStr = str.substring(str.length()-2);
            for (int i = 0; i < str.length()-2; i++) {
                if (str.substring(i, i+2).equalsIgnoreCase(endStr))
                    count++;
            }
            return count;
        }
    }
}
