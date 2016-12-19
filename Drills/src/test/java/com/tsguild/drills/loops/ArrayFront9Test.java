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
public class ArrayFront9Test {
    ArrayFront9 instance;
    public ArrayFront9Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ArrayFront9();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of arrayFront9 method, of class ArrayFront9.
     */
    @Test
    public void defTestA() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 9, 3, 4};
        boolean expResult = true;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 3, 4, 9};
        boolean expResult = false;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2, 3, 4, 5};
        boolean expResult = false;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArrayFront9LessThan4False() {
        System.out.println("arrayFront9");
        int[] numbers = {1, 2};
        boolean expResult = false;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArrayFront9LessThan4True() {
        System.out.println("arrayFront9");
        int[] numbers = {3, 9, 5};
        boolean expResult = true;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testArrayFront9AllNines() {
        System.out.println("arrayFront9");
        int[] numbers = {9, 9, 9, 9};
        boolean expResult = true;
        boolean result = instance.arrayFront9(numbers);
        assertEquals(expResult, result);
    }
    
}
