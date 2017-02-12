/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Sarah
 */
public class ExactSumCombo {
    
    public static void main(String[] args) {
        
        Random rnd = new Random();
        List combo = new ArrayList();
        int r;
        int spaces = 10;
        int sides = 6;
        int z = 0;
        while (z != spaces) { 
            r = rnd.nextInt(sides) + 1;
            if ((z+r) <= spaces) {
                z += r;
                combo.add(r);
            }            
        }
        for (int i = 0; i < combo.size(); i++) {
            System.out.println(combo.get(i));
        }
        //put each combo into an arraylist within an arraylist. 
        //6 .... 6, 5+1, 4+2, 4+1+1, 3+3, 3+2+1, 3+1+1+1, 2+2+1+1, 2+2+2, 1+1+1+1+2, 1+1+1+1+1+1
    }
}
