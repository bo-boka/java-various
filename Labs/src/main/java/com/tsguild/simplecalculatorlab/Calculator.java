/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.simplecalculatorlab;

/**
 *
 * @author apprentice
 */
public class Calculator {
    int choice = 0;
    
    public Calculator(){}
    
    public void add(float x, float y){
        System.out.println(x+" + "+y+" = "+(x + y));
    }
    public void subtract(float x, float y){
        System.out.println(x+" - "+y+" = "+(x-y));
    }
    public void multiply(float x, float y){
        System.out.println(x+" * "+y+" = "+(x*y));
    }
    public void divide(float x, float y){
        System.out.println(x+" / "+y+" = "+(x/y));
    }
}
