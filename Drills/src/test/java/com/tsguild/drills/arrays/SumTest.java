/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

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
public class SumTest {
    Sum instance;
    public SumTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Sum();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sum method, of class Sum.
     */
    @Test
    public void defTestA() {
        System.out.println("sum");
        int[] numbers = {1, 2, 3};
        int expResult = 6;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("sum");
        int[] numbers = {5, 11, 2};
        int expResult = 18;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("sum");
        int[] numbers = {7, 0, 0};
        int expResult = 7;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumEmpty() {
        System.out.println("sum");
        int[] numbers = {};
        int expResult = 0;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumExpressions() {
        System.out.println("sum");
        int[] numbers = {7, (8+8), (2*4)};
        int expResult = 31;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSumNegatives() {
        System.out.println("sum");
        int[] numbers = {7, -2, -3};
        int expResult = 2;
        int result = instance.sum(numbers);
        assertEquals(expResult, result);
    }
    
}
