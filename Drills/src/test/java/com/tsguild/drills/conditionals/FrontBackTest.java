/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.conditionals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class FrontBackTest {
    
    
    FrontBack instance;
    public FrontBackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new FrontBack();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of frontBack method, of class FrontBack.
     */
    @Test
    public void defTestA() {
        System.out.println("frontBack");
        String str = "code";
        String expResult = "eodc";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("frontBack");
        String str = "a";
        String expResult = "a";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("frontBack");
        String str = "ab";
        String expResult = "ba";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void frontBackTestOddNumber() {
        System.out.println("frontBack");
        String str = "remaining";
        String expResult = "gemaininr";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void frontBackTestWithDigits() {
        System.out.println("frontBack");
        String str = "rema1ning";
        String expResult = "gema1ninr";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void frontBackTestWithUpperCase() {
        System.out.println("frontBack");
        String str = "Remaining";
        String expResult = "gemaininR";
        String result = instance.frontBack(str);
        assertEquals(expResult, result);
        
    }
    
}
