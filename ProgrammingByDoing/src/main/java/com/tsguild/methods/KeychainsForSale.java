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
public class KeychainsForSale {
    public static void main(String[] args) {
        
        System.out.println("Ye Olde Keychain Shoppe");
        menu();
    }
    
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int choice;
        do {
            System.out.println("\n1) Add Keychains to Order");
            System.out.println("2) Remove Keychains from Order");
            System.out.println("3) View Current Order");
            System.out.println("4) Checkout");
            System.out.println("\nPlease enter your choice: ");
            choice = sc.nextInt();
            int price = 10;
            switch (choice){
                case 1:
                    num += add_keychains();
                    break;
                case 2:
                    num -= remove_keychains();
                    break;
                case 3:
                    view_order(num, price);
                    break;
                case 4:
                    checkout(num, price);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (choice != 4);
    }
    
    public static int add_keychains(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nADD KEYCHAINS");
        System.out.println("\nHow many keychains?");
        int num = sc.nextInt();
        return num;
    }
    
    public static int remove_keychains(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nREMOVE KEYCHAINS");
        System.out.println("\nHow many keychains would you like to remove?");
        int num = sc.nextInt();
        return num;
    }
    
    public static void view_order(int x, int y){
        System.out.println("\nVIEW ORDER");
        System.out.println("\nNumber of keychains: " + x);
        System.out.println("Price per keychain: $" + y);
        System.out.println("Total: $" + (x*y));
    }
    
    public static void checkout(int x, int y){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nCHECKOUT");
        System.out.println("\nName: ");
        String name = sc.next();
        System.out.println("\nNumber of keychains: " + x);
        System.out.println("Price per keychain: $" + y);
        System.out.println("Total: $" + (x*y));
        System.out.println("\n Thank you, " + name + " for your order!");
    }
    
}
