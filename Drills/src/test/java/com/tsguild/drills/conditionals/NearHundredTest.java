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
public class NearHundredTest {
    
    NearHundred instance;
    
    public NearHundredTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NearHundred();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of nearHundred method, of class NearHundred.
     */
    @Test
    public void defTestA() {
        System.out.println("nearHundred");
        int n = 103;
        boolean expResult = true;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("nearHundred");
        int n = 90;
        boolean expResult = true;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("nearHundred");
        int n = 89;
        boolean expResult = false;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void nearHundredTestnear200() {
        System.out.println("nearHundred");
        int n = 199;
        boolean expResult = true;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void nearHundredTestWayOff() {
        System.out.println("nearHundred");
        int n = 5;
        boolean expResult = false;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void nearHundredTestNegative() {
        System.out.println("nearHundred");
        int n = -89;
        boolean expResult = false;
        boolean result = instance.nearHundred(n);
        assertEquals(expResult, result);
        
    }
    
}
