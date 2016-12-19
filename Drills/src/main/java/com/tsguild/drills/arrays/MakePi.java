/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

import java.util.Arrays;

/**
 *
 * @author apprentice
 */
public class MakePi {
//    Return an int array length n containing the first n digits of pi.
//
//makePi(3) -> {3, 1, 4}

    public int[] makePi(int n) {
        int[] pi = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9};
        return Arrays.copyOfRange(pi, 0, n);
    }
}
