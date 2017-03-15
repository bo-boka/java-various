/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.generics;

/*
 * @author Sarah
 */

public class Printer <T>{
    public <E> void printArray(E[] array){
        for (E elem : array){
            System.out.println(elem);
        }
    }
}
