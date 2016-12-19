/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.productinventory.dto;

/**
 *
 * @author apprentice
 */
public class Shoes extends Product {
    
    private String width;
    
    public Shoes(){
        super();
    }

    public Shoes(String type, int id, int size, double price, int inventory, String width) {
        super(type, id, size, price, inventory);
        this.width = width;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }
    
}
