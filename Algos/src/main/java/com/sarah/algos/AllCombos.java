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
    
    public static void sum_rec(ArrayList<Integer> sides, int target){
        ArrayList<Integer> combo;
        ArrayList<ArrayList> perms = new ArrayList<>();
        for (int j = 1; j <= target; j++) {
            combo = new ArrayList<>();
            for (int i = 0; i < (target/j); i++) {                
                combo.add(j);           
            }
            if (target%j != 0) combo.add(target%j); 
            System.out.println(combo.toString());
            
        }        
        
    }
    
    public static void main(String[] args) {
        Integer[] sides = {1, 2, 3, 4, 5, 6};
        sum_rec(new ArrayList(Arrays.asList(sides)), 10);
    }
}
