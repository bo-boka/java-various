/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.methods;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class BabyCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double a, b, c;
        String op;

        do {
            System.out.print("> ");
            a = keyboard.nextDouble();
            op = keyboard.next();
            b = keyboard.nextDouble();

            if (a == 0) {
                System.out.println("Bye, now.");
            } else {
                if (op.equals("+")) {
                add(a, b);
                } else if (op.equals("-")) {
                    subtract(a, b);
                } else if (op.equals("*")) {
                    multiply(a, b);
                } else if (op.equals("/")) {
                    divide(a, b);
                } else if (op.equals("^")) {
                    power(a, b);
                } else {
                    System.out.println("Undefined operator: '" + op + "'.");
                }
            }
        } while (a != 0);
    }

    public static void add(double a, double b) {
        System.out.println(a + b);
    }

    public static void subtract(double a, double b) {
        System.out.println(a - b);
    }

    public static void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public static void divide(double a, double b) {
        System.out.println(a / b);
    }
    
    public static void power(double a, double b) {
        double total = a;
        for (int i = 1; i < b; i++) {
            total = total * a;
        }
        System.out.println(total);
    }
}
