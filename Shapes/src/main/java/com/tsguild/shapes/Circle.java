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
public class Circle extends Shape{
    
    protected double radius = 0;
    
    public Circle(String color) {
        super(color);
    }
    
    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double area(){
        return (radius * radius)* Math.PI;
    }
    
    @Override
    public double perimeter(){
        return (radius * 2)* Math.PI;
    }
    
}
