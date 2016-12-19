/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_whileloops_1;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class EnterYourPin {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        int pin = 12345;
        
        System.out.println("WELCOME TO THE DANK BANK");
        System.out.println("ENTER YOUR PIN: ");
        int entry = keyboard.nextInt();
        
        while (entry != pin){
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = keyboard.nextInt();
        }
        System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT.");
        // if and while statements are similar in that they check if something is true or false
        // they're different in that if statements execute once if something is true; while statements keep executing while somethingn is true
        // there's no int before entry inside the while loop because entry has already been declared once
        // removing the scanner input inside the loop caused an infinite loop because there's no way to input so that entry will equal the pin, thus making the statement forever true
    }
}
