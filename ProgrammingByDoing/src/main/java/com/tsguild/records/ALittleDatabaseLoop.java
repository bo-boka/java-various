/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.records;

import java.util.Scanner;

/**
 *
 * @author apprentice
 */
public class ALittleDatabaseLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student[] studs = new Student[3];

        for (int i = 0; i < studs.length; i++) {
            studs[i] = new Student();
            System.out.print("Student "+(i+1)+" name: ");
            studs[i].name = sc.next();
            System.out.print("Student "+(i+1)+" grade: ");
            studs[i].grade = sc.nextInt();
            System.out.print("Student "+(i+1)+" average:");
            studs[i].average = sc.nextDouble();
        }
        
        System.out.println("\nThe names are: ");
        for (int i = 0; i < studs.length; i++) {
            System.out.print(studs[i].name+" ");
        }
        
        System.out.println("\nThe names are: ");
        for (int i = 0; i < studs.length; i++) {
            System.out.print(studs[i].grade+" ");
        }
        
        System.out.println("\nThe names are: ");
        for (int i = 0; i < studs.length; i++) {
            System.out.print(studs[i].average+" ");
        }
        
    }
}
