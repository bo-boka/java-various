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

/**
 *
 * @author apprentice
 */
public class SortingArrayOfRecords {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Which file to open: ");
        String file = sc.next();
        Scanner reader = new Scanner(new BufferedReader(new FileReader(file)));
        
        Car[] cars = new Car[5];
        
        cars[0] = new Car();
        cars[1] = new Car();
        cars[2] = new Car();
        cars[3] = new Car();
        cars[4] = new Car();
        
        while (reader.hasNext()){
            for (int i = 0; i < cars.length; i++) {
                cars[i].make = reader.next();
                cars[i].model = reader.next();
                cars[i].year = reader.nextInt();
                cars[i].plateNum = reader.next();
            }
        }
        reader.close();
        
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars.length; j++) {
                if (cars[i].year > cars[j].year){
                    Car temp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = temp;
                }
            }
            
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
