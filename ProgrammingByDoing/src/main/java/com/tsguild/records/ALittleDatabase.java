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
public class ALittleDatabase {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Student[] studs = new Student[3];
        
        studs[0] = new Student();
        System.out.print("Student 1 name: ");
        studs[0].name = sc.next();
        System.out.print("Student 1 grade: ");
        studs[0].grade = sc.nextInt();
        System.out.print("Student 1 average:");
        studs[0].average = sc.nextDouble();
        
        studs[1] = new Student();
        System.out.print("Student 2 name: ");
        studs[1].name = sc.next();
        System.out.print("Student 2 grade: ");
        studs[1].grade = sc.nextInt();
        System.out.print("Student 2 average:");
        studs[1].average = sc.nextDouble();
        
        studs[2] = new Student();
        System.out.print("Student 3 name: ");
        studs[2].name = sc.next();
        System.out.print("Student 3 grade: ");
        studs[2].grade = sc.nextInt();
        System.out.print("Student 3 average:");
        studs[2].average = sc.nextDouble();
        
        
        System.out.println("The names are: "+studs[0].name+" "+studs[1].name+" "+studs[2].name);
        System.out.println("The grades are: "+studs[0].grade+" "+studs[1].grade+" "+studs[2].grade);
        System.out.println("The averages are "+studs[0].average+" "+studs[1].average+" "+studs[2].average);
    }
}
