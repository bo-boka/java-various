/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.productinventory;

import com.tsguild.productinventory.ops.ProductController;

/**
 *
 * @author apprentice
 */
public class ProductInventoryApp {
    
    public static void main(String[] args) {
        
        ProductController controller = new ProductController();
        controller.run();
    }
}
