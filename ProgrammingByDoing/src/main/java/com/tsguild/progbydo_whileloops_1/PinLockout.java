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
public class PinLockout {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin = 12345;
        int tries = 0;
        int maxTries = 4;

        System.out.println("WELCOME TO THE DAND BANK");
        System.out.println("***Warning: You have " + maxTries + " tries to enter the correct pin.");
        System.out.println("Otherwise your account will be locked.***");
        System.out.println("ENTER THE PIN: ");
        int entry = sc.nextInt();
        tries++;
        
        while(entry != pin && tries < maxTries){
            System.out.println("\nINCORRECT PIN. TRY AGAIN.");
            System.out.println("ENTER YOUR PIN: ");
            entry = sc.nextInt();
            tries++;
        }
if (entry == pin){
    System.out.println("\nPIN ACCEPTED. YOU NOW HAVE ACCESS TO YOU ACCOUNT");
}else if (tries >= maxTries){
    System.out.println("\nYOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED");
}
    }
}
