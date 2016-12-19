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
public class Make10Test {
    
    Make10 instance;
    
    public Make10Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Make10();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makes10 method, of class Make10.
     */
    @Test
    public void defTestA() {
        System.out.println("makes10");
        int a = 9;
        int b = 10;
        boolean expResult = true;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("makes10");
        int a = 9;
        int b = 9;
        boolean expResult = false;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("makes10");
        int a = 1;
        int b = 9;
        boolean expResult = true;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void make10TestAllZeros() {
        System.out.println("makes10");
        int a = 0;
        int b = 0;
        boolean expResult = false;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void make10TestNegatives() {
        System.out.println("makes10");
        int a = -10;
        int b = 9;
        boolean expResult = false;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void make10TestExpression() {
        System.out.println("makes10");
        int a = 1+4;
        int b = 25/5;
        boolean expResult = true;
        boolean result = instance.makes10(a, b);
        assertEquals(expResult, result);
    }
    
}
