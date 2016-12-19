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
public class SkipSumTest {
    SkipSum instance;
    public SkipSumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SkipSum();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of skipSum method, of class SkipSum.
     */
    @Test
    public void defTestA() {
        System.out.println("skipSum");
        int a = 3;
        int b = 4;
        int expResult = 7;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("skipSum");
        int a = 9;
        int b = 4;
        int expResult = 20;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("skipSum");
        int a = 10;
        int b = 11;
        int expResult = 21;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSkipSumZero() {
        System.out.println("skipSum");
        int a = 0;
        int b = 5;
        int expResult = 5;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSkipSumNegative() {
        System.out.println("skipSum");
        int a = -10;
        int b = 11;
        int expResult = 1;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSkipSumForbiddenSumWithNegative() {
        System.out.println("skipSum");
        int a = -1;
        int b = 15;
        int expResult = 20;
        int result = instance.skipSum(a, b);
        assertEquals(expResult, result);
    }
    
}
