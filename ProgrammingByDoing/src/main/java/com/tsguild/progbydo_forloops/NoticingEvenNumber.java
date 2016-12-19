/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_forloops;

/**
 *
 * @author apprentice
 */
public class NoticingEvenNumber {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            String x = "";
            if (i % 2 == 0){
                x += "<";
            }
            System.out.println(i + x);
        }
        
    }
}
