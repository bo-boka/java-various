/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.arraylists;

import java.util.ArrayList;

/**
 *
 * @author apprentice
 */
public class BasicArrayLists {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> myAL = new ArrayList<Integer>();
        for (int i = 1; i <= 10; i++) {
            myAL.add(i);
        }
        System.out.println(myAL);
        myAL.add(11);
        myAL.add(12);
        System.out.println(myAL);
        
    }
}
