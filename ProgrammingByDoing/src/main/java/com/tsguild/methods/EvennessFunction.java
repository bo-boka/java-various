/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

/**
 *
 * @author apprentice
 */
public class EvennessFunction {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            String x = "";
            if (isEven(i)){
                x += "<";
            }if (isDivisibleBy3(i)){
                x += "=";
            }
            System.out.println(i + x);
        }
    }
    
    public static boolean isEven(int n){
        if (n % 2 == 0) return true;
        else return false;
    }
    
    public static boolean isDivisibleBy3(int n){
        if (n % 3 == 0) return true;
        else return false;
        
    }
}
