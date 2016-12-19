/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.shapes;

/**
 *
 * @author apprentice
 */
public class Shape {
    
    protected String color;
    
    public Shape(){}

    public Shape(String color) {
        this.color = color;
    }
    
    public double area(){
        double area = 0;
        return area;
    }
    
    public double perimeter(){
        double perimeter = 0;
        return perimeter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
