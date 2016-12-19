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
public class AreaCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int shapeChoice;

        System.out.println("1) Triangle");
        System.out.println("2) Rectangle");
        System.out.println("3) Square");
        System.out.println("4) Circle");
        System.out.println("5) Quit");
        System.out.println("Which shape: ");
        shapeChoice = sc.nextInt();

        switch (shapeChoice) {

            case 1:
                findTriArea();
                break;
            case 2:
                findRecArea();
                break;
            case 3:
                findSqArea();
                break;
            case 4:
                findCircArea();
                break;
            case 5:
                System.out.println("Goodbye");
                break;
        }
    }

    public static void findTriArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base:");
        int base = sc.nextInt();
        System.out.println("Height:");
        int height = sc.nextInt();
        System.out.println(0.5 * base * height);
    }

    public static void findRecArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Length:");
                int length = sc.nextInt();
                System.out.println("Width:");
                int width = sc.nextInt();
        System.out.println(length * width);
    }

    public static void findSqArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Side length:");
                int side = sc.nextInt();
        System.out.println(side * side);
    }

    public static void findCircArea() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius: ");
                int radius = sc.nextInt();
        System.out.println(Math.PI * radius * radius);
    }
}
