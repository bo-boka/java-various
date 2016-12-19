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
public class Shirt extends Product {

    private boolean hasCollar;
    private boolean isButtonUp;

    public Shirt() {
        super();
    }

    public Shirt(String type, int id, int size, double price, int inventory, boolean hasCollar, boolean isButtonUp) {
        super(type, id, size, price, inventory);
        this.hasCollar = hasCollar;
        this.isButtonUp = isButtonUp;
    }

    public boolean isHasCollar() {
        return hasCollar;
    }

    public void setHasCollar(boolean hasCollar) {
        this.hasCollar = hasCollar;
    }

    public boolean isIsButtonUp() {
        return isButtonUp;
    }

    public void setIsButtonUp(boolean isButtonUp) {
        this.isButtonUp = isButtonUp;
    }
    
    
    
}
