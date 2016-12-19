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
public class Hat extends Product {
    
    private boolean hasBrim;
    
    public Hat(){
        super();
    }

    public Hat(String type, int id, int size, double price, int inventory, boolean hasBrim) {
        super(type, id, size, price, inventory);
        this.hasBrim = hasBrim;
    }

    public boolean isHasBrim() {
        return hasBrim;
    }

    public void setHasBrim(boolean hasBrim) {
        this.hasBrim = hasBrim;
    }
    
}
