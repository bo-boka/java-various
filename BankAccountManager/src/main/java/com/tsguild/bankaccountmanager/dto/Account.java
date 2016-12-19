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
public interface Account {
    
    void viewBalance();
    
    void deposit(double money);
    
    void withdraw(double money);
    
    void setBalance(double balance);
    
    double getBalance();
    
    void contactManager();
    
    
}
