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
public class Square extends Shape{
    
    protected double side;

    public Square(String color) {
        super(color);
    }

    public Square(String color, double side) {
        super(color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    
    @Override
    public double area(){
        return side * side;
    }
    
    @Override
    public double perimeter(){
        return side * 4;
    }
}
