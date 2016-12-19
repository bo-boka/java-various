/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.records;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Car{
    String make;
    String model;
    int year;
    String plateNum;
    
    public String toString(){
        return (this.make +" "+this.model+" "+ this.year+" " +this.plateNum);
    }
}
/**
 *
 * @author apprentice
 */
public class SortingDataInFile {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        
        Car[] cars = new Car[5];
        
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car();
        cars[4] = new Car();
        
        for (int i = 0; i < cars.length; i++) {
        
            System.out.println("Car "+(i+1));
            System.out.print("\n\tMake: ");
            cars[i].make = sc.next();
            System.out.print("\n\tModel: ");
            cars[i].model = sc.next();
            System.out.print("\n\tYear: ");
            cars[i].year = sc.nextInt();
            System.out.print("\n\tLicense: ");
            cars[i].plateNum = sc.next();
        }
        
        
        System.out.print("Name of file to create: ");
        String file = sc.next();
        
        PrintWriter writer = new PrintWriter(new FileWriter(file));
        
        for (int i = 0; i < cars.length; i++) {
         
            writer.print("\n"+cars[i] + " ");
            
        }
        
        writer.flush();
        writer.close();
    }
}
