/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

/**
 *
 * @author Sarah
 */
public class RemoveDupesNoCopy {
    
    public static void main(String[] args) {
        
    
        
        String s = "abcaadbtttjka";
        
        char[] strArr = s.toCharArray();
        
        for (int i = 0; i < strArr.length; i++){
            int j;
            for (j = i+1; j < (strArr.length); j++){
                if (strArr[i] == strArr[j]){
                    strArr[j] = '0';
                }
            }
        }
        
        
        for (char c : strArr){
            System.out.println(c);
        }
        
    }
    
}
