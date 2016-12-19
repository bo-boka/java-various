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
public class Savings implements Account {
    private double balance;

    public Savings(double balance) {
        this.balance = balance;
    }
    
    public void viewBalance(){
        System.out.println("Your Savings Account balance is: $"+ getBalance());
    }
    
    public void deposit(double money){
        double balance = getBalance();
        balance += money;
        setBalance(balance);
    }
    
    public void withdraw(double money){
        double balance = getBalance();
        if (money + 3 > balance){
            balance -= money + 3;
            setBalance(balance);
            System.out.println("A Savings withdraw penalty fee of $3.00 was charged to your account.");
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
    
//    public void chargeWithdrawFee(Account account){ //won't let me have extra method in Savings that isn't in interface??
//        account.setBalance(account.getBalance()-3);
//        System.out.println("A Savings withdraw penalty fee of $3.00 was charged to your account.");
//    }
   
}
