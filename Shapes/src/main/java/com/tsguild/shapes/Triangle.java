/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.shapes;

import static java.lang.Math.sqrt;

/**
 *
 * @author apprentice
 */
public class Triangle extends Shape{
    
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(String color) {
        super(color);
    }

    public Triangle(String color, double side1, double side2, double side3) {
        super(color);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    
    @Override
    public double area(){
        double semi = (side1 + side2 + side3)/2;
        double temp = semi*(semi-side1)*(semi-side2)*(semi-side3);
        double area = sqrt(temp);
        return area;
    }
    
    @Override
    public double perimeter(){
        return side1 + side2 + side3;
    }
}
