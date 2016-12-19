package com.tsguild.shapes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author apprentice
 */
public class Rectangle extends Shape{
    
    protected double length = 0;
    protected double width = 0;

    public Rectangle(String color) {
        super(color);
    }
    
    public Rectangle (String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
        
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    @Override
    public double area(){
        return length * width;
    }
    
    @Override
    public double perimeter(){
        return 2*length + 2*width;
    }
}
