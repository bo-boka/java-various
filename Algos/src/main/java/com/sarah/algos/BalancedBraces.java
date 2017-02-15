/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author Sarah
 */


public class BalancedBraces {
    //function takes in String and determines if braces are balanced by returning String "YES" or "NO"
    
    public static void main(String[] args) {
        String s = "{}{]";
        System.out.println(braces(s));
    }
    
    static String braces(String s) {
        Stack stack = new Stack();
        Map<Character, Character> braces = new HashMap<>();
        braces.put('{', '}');
        braces.put('[', ']');
        braces.put('(', ')');
        for (int i = 0; i < s.length(); i++) {           
            char ch = s.charAt(i);
            if (s.charAt(i) == '{' || s.charAt(i) == '[' || s.charAt(i) == '(') stack.push(s.charAt(i));
            else if (ch == ')'|| ch == ']' || ch == '}'){
                if(stack.isEmpty()){
                    s = "NO";
                    return s;
                }
                else if(braces.get(stack.pop()) != ch){
                    s = "NO";
                    return s;
                }
            }            
        }
        if (stack.isEmpty()) s = "YES";
        else s = "NO";
        
        return s;  
    }
}
    
