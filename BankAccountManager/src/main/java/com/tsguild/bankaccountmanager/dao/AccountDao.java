/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.bankaccountmanager.dao;

import com.tsguild.bankaccountmanager.dto.Account;
import com.tsguild.bankaccountmanager.dto.Checking;
import com.tsguild.bankaccountmanager.dto.Savings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AccountDao {
    
    HashMap<Integer, Account[]> clients;
    
    public AccountDao(){
        clients = new HashMap<>();
        Account[] account1 = {new Checking(33.68), new Savings(100.98)};
        Account[] account2 = {new Checking(570.98), new Savings(8459.98)};
        Account[] account3 = {new Checking(377.68), new Savings(7659.98)};
        Account[] account4 = {new Checking(1400.80), new Savings(234244.98)};
        clients.put(1234, account1);
        clients.put(1235, account2);
        clients.put(1236, account3);
        clients.put(1237, account4);

    }
    
    public void addAccount(int pin, Account[] account){
        clients.put(pin, account);
    }
    
    public Account[] removeAccount(int pin){
        return clients.remove(pin);
    }
}
