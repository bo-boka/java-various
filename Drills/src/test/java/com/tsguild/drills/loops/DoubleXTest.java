/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.loops;

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
public class DoubleXTest {
    DoubleX instance;
    public DoubleXTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new DoubleX();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of doubleX method, of class DoubleX.
     */
    @Test
    public void defTestA() {
        System.out.println("doubleX");
        String str = "axxbb";
        boolean expResult = true;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("doubleX");
        String str = "axaxxax";
        boolean expResult = false;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("doubleX");
        String str = "xxxxx";
        boolean expResult = true;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleX() {
        System.out.println("doubleX");
        String str = "axaxxxx";
        boolean expResult = false;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleXIgnoreCase() {
        System.out.println("doubleX");
        String str = "xXxxx";
        boolean expResult = true;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoubleXSentence() {
        System.out.println("doubleX");
        String str = "Does this xx still x work?";
        boolean expResult = true;
        boolean result = instance.doubleX(str);
        assertEquals(expResult, result);
    }
    
}
