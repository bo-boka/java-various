/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.conditionals;

/**
 *
 * @author apprentice
 */
public class FrontBack {
//        Given a String, return a new String where the first and last chars have been exchanged. 
//
//    frontBack("code") -> "eodc"
//    frontBack("a") -> "a"
//    frontBack("ab") -> "ba"

    public String frontBack(String str) {
        char[] chars = str.toCharArray();
        String newStr = "";
        char temp = chars[0];
        chars[0] = chars[chars.length-1];
        chars[chars.length-1] = temp;
        for (char c : chars){
            Character.toString(c);
            newStr += c;
        }
        return newStr;
    }
}
