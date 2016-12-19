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
public class StringTimes {
//        Given a String and a non-negative int n, return a larger String that is n copies of the original String. 
//
//    stringTimes("Hi", 2) -> "HiHi"
//    stringTimes("Hi", 3) -> "HiHiHi"
//    stringTimes("Hi", 1) -> "Hi"

    public String stringTimes(String str, int n) {
        String newStr = str;
        if (n < 0){
            return "nope";
        } else {
            for (int i = 1; i < n; i++) {
                newStr += str;
            }
        }
        return newStr;
    }
}
