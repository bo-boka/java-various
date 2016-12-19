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
public class XsAndYs {

    public static void main(String[] args) {
        System.out.println("x \t y");
        System.out.println("---------------");
        for (float x = -10; x < 10; x += 0.5) {
            System.out.print(x);
            System.out.println("\t" + (x * x));
        }
    }
}
