/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorizor;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class FactorizorGuts {
    public FactorizorGuts(){}
    
    public int intOut(){
        Scanner sc = new Scanner(System.in);
        System.out.print("What number would you like to factor: ");
        int choice = sc.nextInt();
        return choice;
    }
    
    public int checkIntRange(int min, int max){
        int num = intOut();
        while (num < min || num > max){
            num = intOut();
        }
        return num;
    }
    
   public void factorize(int num){
       System.out.println("The factors of "+ num +" are: ");
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
   }
   
   public void perfectNum(int num){
        int factorSum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                factorSum += i;
            }
        }
        if (factorSum == num){
            System.out.println(num +" is a perfect number.");
        } else {
            System.out.println(num +" is not a perfect number.");
        }
   }
   
   public void countFactors(int num){
       int count = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
       System.out.println(num+" has "+ count +" factors.");              

   }
}
