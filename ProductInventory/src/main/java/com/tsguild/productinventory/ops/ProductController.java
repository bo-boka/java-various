/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.productinventory.ops;

import com.tsguild.productinventory.dao.InventoryDao;
import com.tsguild.productinventory.dto.Hat;
import com.tsguild.productinventory.dto.Pants;
import com.tsguild.productinventory.dto.Product;
import com.tsguild.productinventory.dto.Shirt;
import com.tsguild.productinventory.dto.Shoes;
import com.tsguild.productinventory.ui.ConsoleIO;
import java.io.IOException;
import java.util.Collection;

/**
 *
 * @author apprentice
 */
public class ProductController {
    ConsoleIO console;
    InventoryDao dao;
    boolean keepGoing = true;
    
    public void run(){ 
        
        console = new ConsoleIO();
        dao = new InventoryDao();
        
        console.print("**Welcome to Product Inventory**");
        
        dao.loadFile();
        while (keepGoing) {
            menu();
            int userChoice = console.readInt("Please choose a number: ");
            switch (userChoice) {
                case 1:
                    addNewItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    updateInventory();
                    break;
                case 4:
                    getProductValue();
                    break;
                case 5:
                    getTotalValue(); //needs work
                    break;
                case 6:
                    try {
                        dao.saveFile();
                        keepGoing = false;
                    } catch (IOException ex) {
                        console.print("Unable to save to file.");
                        String ans = console.readString("Are you sure you want to quit? (y/n)");
                        if (ans.equalsIgnoreCase("y"))
                            keepGoing = false;
                    }
                    break;
                default:
                    break;
            }
            String go = console.readString("Would you like to continue? (y/n): ");
            if (go.equalsIgnoreCase("y")){
                keepGoing = true;
            } else if (go.equalsIgnoreCase("n")){
                try {
                        dao.saveFile();
                        keepGoing = false;
                    } catch (IOException ex) {
                        console.print("Unable to save to file.");
                    }
                keepGoing = false;
            }
        }
    }

    private void menu() {
        console.print("1. Add Item to stock");
        console.print("2. Remove Item from stock");
        console.print("3. Update inventory");
        console.print("4. Total value of product");
        console.print("5. Total Inventory Value");
        console.print("6. Save & Exit");
    }

    private void addNewItem() {
        //String type, int id, int size, double price, int inventory)
        String type = console.readString("Type: ");
        int id = console.readInt("ID#: ");
        int size = console.readInt("Size: ");
        double price = console.readDouble("Price: $");
        int inventory = console.readInt("# items in stock: ");
        
        if (type.equalsIgnoreCase("Shirt")){
            String collar = console.readString("Shirt Collar? (y/n): ");
            boolean hasCollar;
            if (collar.equalsIgnoreCase("y")){
                hasCollar = true;
            } else {
                hasCollar = false;
            }
            String buttonUp = console.readString("Button up? (y/n): ");
            boolean isButtonUp;
            if (buttonUp.equalsIgnoreCase("y")){
                isButtonUp = true;
            } else {
                isButtonUp = false;
            }
            Shirt shirt = new Shirt(type, id, size, price, inventory, hasCollar, isButtonUp);
            dao.addItem(shirt);
        }
        else if (type.equalsIgnoreCase("Pants")){
            Pants pants = new Pants(type, id, size, price, inventory);
            dao.addItem(pants);
        }
        else if (type.equalsIgnoreCase("Hat")){
            String brim = console.readString("Has brim? (y/n): ");
            boolean hasBrim;
            if (brim.equalsIgnoreCase("y")){
                hasBrim = true;
            } else {
                hasBrim = false;
            }
            Hat hat = new Hat(type, id, size, price, inventory, hasBrim);
            dao.addItem(hat);
        }
        else if (type.equalsIgnoreCase("Shoes")){
            String width = console.readString("Shoe width: ");
            Shoes shoes = new Shoes(type, id, size, price, inventory, width);
            dao.addItem(shoes);
        }
    }
    
    public void deleteItem(){
        int id = console.readInt("Enter id# of product to remove: ");
        dao.deleteItem(id);
    }

    private void updateInventory() {
        int id = console.readInt("Enter id# of product inventory to update: ");
        Product p = dao.removeItem(id);
        console.print("Current inventory is: "+ p.getInventory());
        int newInv = console.readInt("Enter new inventory: ");
        p.setInventory(newInv);
        dao.addItem(p);
    }

    private void getProductValue() {
        int id = console.readInt("Enter id# of product for value: ");
        Product p = dao.getItem(id);
        double price = p.getPrice();
        double inv = (double) p.getInventory();
        console.print("Current value is: $"+ (price * inv));
    }

    private void getTotalValue() {
        Collection<Product> itemSet = dao.getTotal();
        double total = 0;
        for (Product p : itemSet){
            total += (p.getPrice() * (double)p.getInventory());
        }
        System.out.println(total);
    }
    
}
