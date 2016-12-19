/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.strings;

/**
 *
 * @author apprentice
 */
public class TrimOne {
//        Given a String, return a version without the first and last char, so "Hello" yields "ell". 
//    The String length will be at least 2. 
//
//    trimOne("Hello") -> "ell"
//    trimOne("java") -> "av"
//    trimOne("coding") -> "odin"

    public String trimOne(String str) {
        if (str.length() < 2 || str.isEmpty()) {
            return "error";
        } else {
            return str.substring(1, str.length()-1);
        }
    }
}
