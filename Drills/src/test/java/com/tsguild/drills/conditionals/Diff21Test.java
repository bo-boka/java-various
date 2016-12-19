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
public class Diff21Test {
    
    Diff21 instance;
    
    public Diff21Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Diff21();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of diff21 method, of class Diff21.
     */
    @Test
    public void defTestA() {
        System.out.println("diff21");
        int n = 23;
        int expResult = 4;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("diff21");
        int n = 10;
        int expResult =11;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("diff21");
        int n = 21;
        int expResult = 0;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void diff21TestNegativeN() {
        System.out.println("diff21");
        int n = -2;
        int expResult = 23;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void diff21TestZero() {
        System.out.println("diff21");
        int n = 0;
        int expResult = 21;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void diff21TestExpression() {
        System.out.println("diff21");
        int n = 12 - 2;
        int expResult = 11;
        int result = instance.diff21(n);
        assertEquals(expResult, result);
    }
    
}
