/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arraylists;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class Testy {
    public static void main(String[] args) {
        
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9};
        int[] copy = Arrays.copyOfRange(pi, 0, 20);
        for (int i : copy){
            System.out.println(i);
        }
    }
    
}
