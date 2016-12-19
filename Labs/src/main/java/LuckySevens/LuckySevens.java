/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LuckySevens;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author apprentice
 */
public class LuckySevens {

    public static void main(String[] args) {

        int betAmount = Lucky7sGuts.checkIntRange(1, 2000000, "How much money would you like to bet?: ");
        
        int highMoney = betAmount;
        
        Lucky7sGuts.playGame(betAmount, highMoney);
        
    }

}
