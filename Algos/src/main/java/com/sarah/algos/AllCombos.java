/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Sarah
 */
public class AllCombos {
    
    public static void sum_rec(int sides, int target){
        ArrayList<Integer> combo;
        if (target < sides) sides = target-1;
        for (int j = 1; j <= sides; j++) {
            combo = new ArrayList<>();           
            for (int i = 0; i < (target/j); i++) { 
                combo.add(sum_rec(6, j));           
            }
            if (target%j != 0) combo.add(target%j); 
            System.out.println(combo.toString());
//            for (int c : combo){
//                sum_rec(6, c);
//            }
        }        
        
    }
    
    public static void main(String[] args) {
//        Integer[] sides = {1, 2, 3, 4, 5, 6};
//        sum_rec(new ArrayList(Arrays.asList(sides)), 10);
        sum_rec(6, 4);
    }
}
