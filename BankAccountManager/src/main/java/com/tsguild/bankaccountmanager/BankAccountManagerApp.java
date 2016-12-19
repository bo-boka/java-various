/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.bankaccountmanager;

import com.tsguild.bankaccountmanager.ops.AccountController;

/**
 *
 * @author apprentice
 */
public class BankAccountManagerApp {
    
    public static void main(String[] args) {
        AccountController controller = new AccountController();
        controller.run();
    }
    
    
}
