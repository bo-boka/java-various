/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.progbydo_whileloops_1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class DiceDoubles {

    public static void main(String[] args) {

        Random diceRoller = new Random();

        int rollResult1 = 0;
        int rollResult2 = -1;

        System.out.println("TIME TO ROOOOOOLL THE DICE!");
        System.out.println();
        while (rollResult1 != rollResult2) {
            rollResult1 = diceRoller.nextInt(6) + 1;
            rollResult2 = diceRoller.nextInt(6) + 1;
            System.out.println("Roll #1: " + rollResult1);
            System.out.println("Roll #1: " + rollResult2);
            System.out.println("The total is " + (rollResult1 + rollResult2) + "!");
            System.out.println();
        }
        

    }

}
