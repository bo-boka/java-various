/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.productinventory.dao;

import com.tsguild.productinventory.dto.Hat;
import com.tsguild.productinventory.dto.Pants;
import com.tsguild.productinventory.dto.Product;
import com.tsguild.productinventory.dto.Shirt;
import com.tsguild.productinventory.dto.Shoes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author apprentice
 */
public class InventoryDao {
    
    private HashMap<Integer, Product> stock;
    private final String FILE_NAME;
    private final String DELIMITER = "::";
    
    public InventoryDao(){
        stock = new HashMap<>();
        FILE_NAME = "productinventory.txt";
    }
    
    public void addItem(Product product){
        stock.put(product.getId(), product);
    }
    
    public void deleteItem(int id){
        stock.remove(id);
    }
    
    public Product removeItem(int id){
        Product p = stock.remove(id);
        return p;
    }
    
    public Product getItem(int id){
        Product p = stock.get(id);
        return p;
    } 
    
    public Collection<Product> getTotal(){
        return stock.values();
    }
    
    public void loadFile(){
        try {
            Scanner reader = new Scanner(new BufferedReader(new FileReader(FILE_NAME)));
            
            while (reader.hasNextLine()){
                String productStuff = reader.nextLine();
                
                String[] properties = productStuff.split(DELIMITER);
                
                if(properties[0].equalsIgnoreCase("Shirt")){
                    Shirt aShirt = new Shirt();
                    int pId = Integer.parseInt(properties[1]);
                    int pSize = Integer.parseInt(properties[2]);
                    double pPrice = Double.parseDouble(properties[3]);
                    int pInv = Integer.parseInt(properties[4]);
                    boolean pCollar = Boolean.parseBoolean(properties[5]);
                    boolean pButtonUp = Boolean.parseBoolean(properties[6]);
                    aShirt.setType(properties[0]);
                    aShirt.setId(pId);
                    aShirt.setSize(pSize);
                    aShirt.setPrice(pPrice);
                    aShirt.setInventory(pInv);
                    aShirt.setHasCollar(pCollar);
                    aShirt.setIsButtonUp(pButtonUp);
                    stock.put(pId, aShirt);
                }else if(properties[0].equalsIgnoreCase("Pants")){
                    Pants aPants = new Pants();
                    aPants.setType(properties[0]);
                    int pId = Integer.parseInt(properties[1]);
                    int pSize = Integer.parseInt(properties[2]);
                    double pPrice = Double.parseDouble(properties[3]);
                    int pInv = Integer.parseInt(properties[4]);
                    aPants.setId(pId);
                    aPants.setSize(pSize);
                    aPants.setPrice(pPrice);
                    aPants.setInventory(pInv);
                    stock.put(pId, aPants);
                }else if(properties[0].equalsIgnoreCase("Hat")){
                    Hat aHat = new Hat();
                    int pId = Integer.parseInt(properties[1]);
                    int pSize = Integer.parseInt(properties[2]);
                    double pPrice = Double.parseDouble(properties[3]);
                    int pInv = Integer.parseInt(properties[4]);
                    boolean pBrim = Boolean.parseBoolean(properties[5]);
                    aHat.setType(properties[0]);
                    aHat.setId(pId);
                    aHat.setSize(pSize);
                    aHat.setPrice(pPrice);
                    aHat.setInventory(pInv);
                    aHat.setHasBrim(pBrim);
                    stock.put(pId, aHat);
                }else if(properties[0].equalsIgnoreCase("Shoes")){
                    Shoes aShoes = new Shoes();
                    aShoes.setType(properties[0]);
                    int pId = Integer.parseInt(properties[1]);
                    int pSize = Integer.parseInt(properties[2]);
                    double pPrice = Double.parseDouble(properties[3]);
                    int pInv = Integer.parseInt(properties[4]);
                    aShoes.setWidth(properties[5]);
                    aShoes.setId(pId);
                    aShoes.setSize(pSize);
                    aShoes.setPrice(pPrice);
                    aShoes.setInventory(pInv);
                    stock.put(pId, aShoes);
                } else {
                    continue;
                }
                    
            }
            reader.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InventoryDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void saveFile() throws IOException{
 //String type, int id, int size, double price, int inventory)        
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
        for (Product p : stock.values()){
            if (p.getType().equalsIgnoreCase("Shirt")){
                Shirt shirt = (Shirt)p;
                writer.println(shirt.getType()+ DELIMITER +shirt.getId()+ DELIMITER+ shirt.getSize()+ DELIMITER + shirt.getPrice()
                    + DELIMITER + shirt.getInventory()+ DELIMITER + shirt.isHasCollar()+DELIMITER + shirt.isIsButtonUp());
            }
            else if (p.getType().equalsIgnoreCase("Pants")){
                Pants pants = (Pants)p;
                writer.println(pants.getType()+ DELIMITER +pants.getId()+ DELIMITER
                    + pants.getSize()+ DELIMITER + pants.getPrice()+ DELIMITER + pants.getInventory());
            }
        
            else if (p.getType().equalsIgnoreCase("Hat")){
                Hat hat = (Hat)p;
                writer.println(hat.getType()+ DELIMITER +hat.getId()+ DELIMITER
                    + hat.getSize()+ DELIMITER + hat.getPrice()+ DELIMITER + hat.getInventory() + DELIMITER + hat.isHasBrim());
            }
            else if (p.getType().equalsIgnoreCase("Shoes")){
                Shoes shoes = (Shoes)p;
                writer.println(shoes.getType()+ DELIMITER +shoes.getId()+ DELIMITER
                    + shoes.getSize()+ DELIMITER + shoes.getPrice()+ DELIMITER + shoes.getInventory() + DELIMITER + shoes.getWidth());
            }
        }
        writer.flush();
        writer.close();
    }
}
