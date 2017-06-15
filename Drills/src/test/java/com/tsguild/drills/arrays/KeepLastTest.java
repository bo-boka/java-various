/*
 *  Copyright 2017 SarahBoka
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
 * @author Sarah
 */
public class KeepLastTest {
    
    KeepLast instance;
    
    public KeepLastTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new KeepLast();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of keepLast method, of class KeepLast.
     */
    @Test
    public void testKeepLastNull() {
        System.out.println("keepLast");
        int[] numbers = null;
        int[] expResult = null;
        int[] result = instance.keepLast(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testKeepLast1() {
        System.out.println("keepLast");
        int[] numbers = {3};
        int[] expResult = {0, 3};
        int[] result = instance.keepLast(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testKeepLast2() {
        System.out.println("keepLast");
        int[] numbers = {2, 3};
        int[] expResult = {0, 0, 0, 3};
        int[] result = instance.keepLast(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testKeepLastOdd() {
        System.out.println("keepLast");
        int[] numbers = {1, 4, 5};
        int[] expResult = {0, 0, 0, 0, 0, 5};
        int[] result = instance.keepLast(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testKeepLastAllZeros() {
        System.out.println("keepLast");
        int[] numbers = {0, 0, 0, 0};
        int[] expResult = {0, 0, 0, 0, 0, 0, 0, 0};
        int[] result = instance.keepLast(numbers);
        assertArrayEquals(expResult, result);
    }
    
}
