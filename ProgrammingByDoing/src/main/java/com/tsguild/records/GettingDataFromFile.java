/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.records;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

class Dog{
    String breed;
    int age;
    double weight;
}
/**
 *
 * @author apprentice
 */
public class GettingDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        Dog one = new Dog();
        Dog two = new Dog();
        
        System.out.print("Which file to open: ");
        String file = sc.next();
        Scanner reader = new Scanner(new BufferedReader(new FileReader(file)));
        
        while(reader.hasNext()){
            one.breed = reader.next();
            one.age = reader.nextInt();
            one.weight = reader.nextDouble();
            two.breed = reader.next();
            two.age = reader.nextInt();
            two.weight = reader.nextDouble();
        }
        
        System.out.println("First dog: "+ one.breed +" "+one.age+" "+one.weight);
        System.out.println("Second dog: "+two.breed +" "+two.age+" "+two.weight);
        
    }
}
