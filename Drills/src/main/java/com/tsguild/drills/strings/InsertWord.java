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
public class InsertWord {
//        Given an "out" String length 4, such as "<<>>", and a word, return a new String where the word is in the middle 
//    of the out String, e.g. "<<word>>".
//
//    Hint: SubStrings are your friend here 
//
//    insertWord("<<>>", "Yay") -> "<<Yay>>"
//    insertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
//    insertWord("[[]]", "word") -> "[[word]]"

    public String insertWord(String container, String word) {
        return container.substring(0, container.length()/2) + word + container.substring(container.length()/2);
    }
}
