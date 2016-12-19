/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.consoleio;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CalculatorUI {
    public static void main(String[] args) {
        
        SimpleCalculator myCal = new SimpleCalculator();
        int choice = 0;
        String menu = "Please choose a number: ";
        String op1 = "\nPlease enter the first operand: ";
        String op2 = "Please enter the second operand: ";
        
        System.out.println("\n\t***Welcome To The Dopest Calculator***");
        while (choice != 5){
            
            System.out.println("\n1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");
            choice = IOUserPrompt.checkIntRange(1, 5, menu);

            switch (choice){
                case 1:
                    double a1 = IOUserPrompt.doubleOut(op1);
                    double a2 = IOUserPrompt.doubleOut(op2);
                    System.out.println(myCal.add(a1, a2));
                    break;
                case 2:
                    double s1 = IOUserPrompt.doubleOut(op1);
                    double s2 = IOUserPrompt.doubleOut(op2);
                    System.out.println(myCal.subtract(s1, s2));
                    break;
                case 3:
                    double m1 = IOUserPrompt.doubleOut(op1);
                    double m2 = IOUserPrompt.doubleOut(op2);
                    System.out.println(myCal.multiply(m1, m2));
                    break;
                case 4:
                    double d1 = IOUserPrompt.doubleOut(op1);
                    double d2 = IOUserPrompt.doubleOut(op2);
                    System.out.println(myCal.divide(d1, d2));
                    break;
                case 5:
                    System.out.println("\nThanks! See you next time!");
                    break;

            }
        }
    }
}
