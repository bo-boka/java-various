/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sarah
 */
public class RemoveDupesWDataStructure {
    
    public static void main(String[] args){
        
        String s = "abcaadbtttjka";
        
        char[] strArr = s.toCharArray();
        
        Set<Character> setStr = new HashSet<Character>();
        
        for (char elem : strArr) {
            setStr.add(elem);
        }
        
        setStr.forEach(System.out::println);
        
    }
}
