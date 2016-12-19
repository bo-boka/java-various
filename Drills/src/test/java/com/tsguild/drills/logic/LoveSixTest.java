/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.logic;

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
public class LoveSixTest {
    LoveSix instance;
    public LoveSixTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new LoveSix();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of loveSix method, of class LoveSix.
     */
    @Test
    public void defTestA() {
        System.out.println("loveSix");
        int a = 6;
        int b = 4;
        boolean expResult = true;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("loveSix");
        int a = 4;
        int b = 5;
        boolean expResult = false;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("loveSix");
        int a = 1;
        int b = 5;
        boolean expResult = true;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoveSixDifference() {
        System.out.println("loveSix");
        int a = 11;
        int b = 5;
        boolean expResult = true;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoveSixB6() {
        System.out.println("loveSix");
        int a = 1;
        int b = 6;
        boolean expResult = true;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLoveSixDifferenceBSubtractA() {
        System.out.println("loveSix");
        int a = 2;
        int b = 8;
        boolean expResult = true;
        boolean result = instance.loveSix(a, b);
        assertEquals(expResult, result);
    }
    
}
