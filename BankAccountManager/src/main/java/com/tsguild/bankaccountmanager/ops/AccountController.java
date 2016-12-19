/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.bankaccountmanager.ops;

import com.tsguild.bankaccountmanager.dao.AccountDao;
import com.tsguild.bankaccountmanager.dto.Account;
import com.tsguild.bankaccountmanager.dto.Checking;
import com.tsguild.bankaccountmanager.ui.ConsoleIO;
import java.util.List;

/**
 *
 * @author apprentice
 */
public class AccountController {
    
    private ConsoleIO console;
    private AccountDao dao;
    boolean keepGoing = true;
    
    Account[] accountData;
    
    public AccountController(){
        console = new ConsoleIO();
        dao = new AccountDao();
    }
    
    public void run(){
        int pin;
        while (keepGoing){
            do {
                pin = console.readInt("Type in your 4 digit pin: ");
                accountData = dao.removeAccount(pin);
            }while (accountData == null);
            displayAccountInfo();
            String type = console.validateType("Checking or Savings?");
            String action = console.validateAction("Deposit or Withdraw?");
            transact(type, action, accountData);
            dao.addAccount(pin, accountData);
            displayAccountInfo();
            keepGoing = console.validateKeepGoing("Would you like to make another transaction? (y/n)");
        }
    }
    
    private void transact(String type, String action, Account[] accountData){
        if (action.equalsIgnoreCase("Deposit")){
            depositMoney(type, accountData);
        } else if (action.equalsIgnoreCase("Withdraw")){
            withdrawMoney(type, accountData);
        }
    }
    
    private Account[] depositMoney(String type, Account[] accountData){
        double money = console.readDouble("Enter deposit amount: $");
        if (money > 10000){
            accountData[0].contactManager();
            keepGoing = false;
        }
        if (type.equalsIgnoreCase("Checking")){
            accountData[0].deposit(money);
        } else if (type.equalsIgnoreCase("Savings")){
            accountData[1].deposit(money);
        }
        return accountData;
    }
    
    private Account[] withdrawMoney(String type, Account[] accountData){
        double money = console.readDouble("Enter withdraw amount: $");
        if (type.equalsIgnoreCase("Checking")){
            accountData[0].withdraw(money);
        } else if (type.equalsIgnoreCase("Savings")){
            accountData[1].withdraw(money);
        }
        return accountData;
    }
    
    private void displayAccountInfo(){
        accountData[0].viewBalance();
        accountData[1].viewBalance();
    }
    
}
