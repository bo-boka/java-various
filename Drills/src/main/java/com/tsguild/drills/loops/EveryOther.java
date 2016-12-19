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
public class EveryOther {
//        Given a String, return a new String made of every other char starting with the first, so "Hello" yields "Hlo". 
//
//    everyOther("Hello") -> "Hlo"
//    everyOther("Hi") -> "H"
//    everyOther("Heeololeo") -> "Hello"

    public String everyOther(String str) {
        char[] arr = str.toCharArray();
        String newStr = "";
//        newStr += arr[0];
        for (int i = 0; i < str.length(); i+=2) {
//            if (i % 2 == 0){
                newStr += arr[i];
//            }
        }
        
        return newStr;
    }
}
