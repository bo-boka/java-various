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
public class GetMiddleTest {
    GetMiddle instance;
    public GetMiddleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new GetMiddle();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getMiddle method, of class GetMiddle.
     */
    @Test
    public void defTestA() {
        System.out.println("getMiddle");
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] expResult = {2, 5};
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("getMiddle");
        int[] a = {7, 7, 7};
        int[] b = {3, 8, 0};
        int[] expResult = {7, 8};
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("getMiddle");
        int[] a = {5, 2, 9};
        int[] b = {1, 4, 5};
        int[] expResult = {2, 4};
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testGetMiddleAllZeros() {
        System.out.println("getMiddle");
        int[] a = {0, 0, 0};
        int[] b = {0, 0, 0};
        int[] expResult = {0, 0};
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testGetMiddleSameMiddle() {
        System.out.println("getMiddle");
        int[] a = {2, 5, 0};
        int[] b = {9, 5, 1};
        int[] expResult = {5, 5};
        int[] result = instance.getMiddle(a, b);
        assertArrayEquals(expResult, result);
    }
    
}
