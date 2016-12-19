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
public class Pants extends Product {
    
    public Pants(){
        super();
    }

    public Pants(String type, int id, int size, double price, int inventory) {
        super(type, id, size, price, inventory);
    }
   
}
