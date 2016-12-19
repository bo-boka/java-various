/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.bankaccountmanager.ui;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ConsoleIO {
    private Scanner sc = new Scanner(System.in);
    
    public void print(String msg) {
        System.out.println(msg);
    }

    public String readString(String prompt) {
        System.out.println(prompt);
        return sc.next(); //changed to single scanner at class level and used next() rather than nextLine()
    }
    
    public String validateType(String prompt){
        String input;
        do{
            input = readString(prompt);
        } while (!(input.equalsIgnoreCase("Checking") || input.equalsIgnoreCase("Savings")));
        return input;
    }
    
    public String validateAction(String prompt){
        String input;
        do{
            input = readString(prompt);
        } while (!(input.equalsIgnoreCase("Deposit") || input.equalsIgnoreCase("Withdraw")));
        return input;
    }
    
    public boolean validateKeepGoing(String prompt){
        String input;
        boolean keepGoing = true;
        do{
            input = readString(prompt);
        } while (!(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("n")));
        if (input.equalsIgnoreCase("y")){
                keepGoing = true;
            } else if (input.equalsIgnoreCase("n")){
                keepGoing = false;
            }
        return keepGoing;
    }
    
    public int readInt(String prompt) {
        boolean badInput;
        int result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextInt();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);
        return result;
    }

    public int readInt(String prompt, int min, int max) {
        int result;
        do {
            result = readInt(prompt);
        } while (result < min || result > max);

        return result;
    }

    public long readLong(String prompt) {
        boolean badInput;
        long result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextLong();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public long readLong(String prompt, long min, long max) {
        long result;
        do {
            result = readLong(prompt);
        } while (result < min || result > max);

        return result;
    }

    public float readFloat(String prompt) {
        boolean badInput;
        float result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextFloat();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public float readFloat(String prompt, float min, float max) {
        float result;
        do {
            result = readFloat(prompt);
        } while (result < min || result > max);

        return result;
    }

    public double readDouble(String prompt) {
        boolean badInput;
        double result = 0;
        do {
            try {
                System.out.println(prompt);
                result = sc.nextDouble();
                badInput = false;
            } catch (InputMismatchException ime) {
                badInput = true;
                sc.nextLine();
            }
        } while (badInput);

        return result;
    }

    public double readDouble(String prompt, double min, double max) {
        double result;
        do {
            result = readDouble(prompt);
        } while (result < min || result > max);

        return result;
    }
    
}
