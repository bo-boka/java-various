/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.bankaccountmanager.dto;

/**
 *
 * @author apprentice
 */
public class Checking implements Account {
    
    private double balance;
//    private boolean isNegative; 
//    private boolean isNegative100; 

    public Checking(double balance) {
        this.balance = balance;
    }
    
    public void viewBalance(){
        System.out.println("Your Checking Account balance is: $"+ getBalance());
    }
    
    public void deposit(double money){
        double balance = getBalance();
        balance += money;
        setBalance(balance);
    }
    
    public void withdraw(double money){
        double balance = getBalance();
        if (money <= balance){ 
            balance -= money;
            setBalance(balance);
        } else if (balance - money > -90) { //$10 margin for fee  //balance > -90 && money < balance + 90
            balance -= money + 10;
            System.out.println("And overdraft fee of $10 was applied to your account.");
            setBalance(balance);
        } else {
            System.out.println("Insufficient Funds.");
        }
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void contactManager(){
        System.out.println("Your deposit was larger than $10,000.");
        System.out.println("Unfortunately your account is on hold while the manager is contacted.");
    }
    
    public void overdraftFee(){
        
    }
}
