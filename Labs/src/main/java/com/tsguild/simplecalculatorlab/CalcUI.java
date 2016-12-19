/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.simplecalculatorlab;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class CalcUI {
    public static void main(String[] args) {
        
        Calculator myCal = new Calculator();
        Scanner sc = new Scanner(System.in);
        
        while (myCal.choice != 5){
            
            System.out.println("\n1 - Add");
            System.out.println("2 - Subtract");
            System.out.println("3 - Multiply");
            System.out.println("4 - Divide");
            System.out.println("5 - Exit");
            System.out.print("Please choose an operator: ");
            myCal.choice = sc.nextInt();

            switch (myCal.choice){
                case 1:
                    System.out.println("\n1st operand: ");
                    float a1 = sc.nextFloat();
                    System.out.println("2nd operand: ");
                    float a2 = sc.nextFloat();
                    myCal.add(a1, a2);
                    break;
                case 2:
                    System.out.println("\n1st operand: ");
                    float s1 = sc.nextFloat();
                    System.out.println("2nd operand: ");
                    float s2 = sc.nextFloat();
                    myCal.subtract(s1, s2);
                    break;
                case 3:
                    System.out.println("\n1st operand: ");
                    float m1 = sc.nextFloat();
                    System.out.println("2nd operand: ");
                    float m2 = sc.nextFloat();
                    myCal.multiply(m1, m2);
                    break;
                case 4:
                    System.out.println("\n1st operand: ");
                    float d1 = sc.nextFloat();
                    System.out.println("2nd operand: ");
                    float d2 = sc.nextFloat();
                    myCal.divide(d1, d2);
                    break;
                case 5:
                    System.out.println("\nThank you!");
                    break;

            }
        }
    }
}
