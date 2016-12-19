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
    
    
public class Product {
    
    protected String type;
    protected int id;
    protected int size;
    protected double price;
    protected int inventory;
    
    public Product(){}

    public Product(String type, int id, int size, double price, int inventory) {
        this.type = type;
        this.id = id;
        this.size = size;
        this.price = price;
        this.inventory = inventory;
    }
    
    protected void sold(int inventory){
        inventory -= 1;
    }
    
    protected void returned(int inventory){
        inventory += 1;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

}
