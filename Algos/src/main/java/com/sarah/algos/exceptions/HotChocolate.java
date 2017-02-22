/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos.exceptions;

import java.util.concurrent.TimeUnit;

/**
 *
 * @author Sarah
 */
public class HotChocolate {
    
    public static final double tooCold = 160; 
    public static final double tooHot = 185; 
    
    public static void drink(double cocoaTemp) throws TooHotException, TooColdException{
        if (cocoaTemp >= tooHot){
            throw new TooHotException();
        } else if (cocoaTemp <= tooCold){
            throw new TooColdException();
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        double cTemp = 145;
        boolean wrongTemp = true;
        
        while (wrongTemp){
            try{
                drink(cTemp);
                System.out.println("perfect");
                wrongTemp = false;
            } catch (TooHotException e1){
                System.out.println("too hot!!!!!!");
                cTemp -= 5;
            } catch (TooColdException e2){
               System.out.println("too cold!!!"); 
               cTemp += 5;
            }
            TimeUnit.SECONDS.sleep(2);
        }
    }
}
