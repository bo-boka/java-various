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

class Person{
    String name;
    int age;
    
    public String toString(){
        return this.name + this.age;
    }
}
/**
 *
 * @author apprentice
 */
public class GettingMoreDataFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        
        Person[] peeps = new Person[5];
        
        System.out.print("Which file to open: ");
        String file = sc.next();
        Scanner reader = new Scanner(new BufferedReader(new FileReader(file)));
        
        peeps[0] = new Person();
        peeps[1] = new Person();
        peeps[2] = new Person();
        peeps[3] = new Person();
        peeps[4] = new Person();
        while(reader.hasNext()){
            for (int i = 0; i < peeps.length; i++) {
                peeps[i].name = reader.next();
                peeps[i].age = reader.nextInt();
            }
        }
        for (int i = 0; i < peeps.length; i++) {
            System.out.println(peeps[i]);
        }
        
        reader.close();
    }
}
