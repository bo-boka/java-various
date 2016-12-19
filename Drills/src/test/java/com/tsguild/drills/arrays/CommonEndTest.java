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
public class CommonEndTest {
    CommonEnd instance;
    public CommonEndTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CommonEnd();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of commonEnd method, of class CommonEnd.
     */
    @Test
    public void defTestA() {
        System.out.println("commonEnd");
        int[] a = {1, 2, 3};
        int[] b = {7, 3};
        boolean expResult = true;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("commonEnd");
        int[] a = {1, 2, 3};
        int[] b = {7, 3, 2};
        boolean expResult = false;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("commonEnd");
        int[] a = {1, 2, 3};
        int[] b = {1, 3};
        boolean expResult = true;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCommonEndOneEmpty() {
        System.out.println("commonEnd");
        int[] a = {1, 2, 3};
        int[] b = {};
        boolean expResult = false;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCommonEndNegatives() {
        System.out.println("commonEnd");
        int[] a = {2, 2, -3};
        int[] b = {1, 3};
        boolean expResult = false;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCommonEndWithEquation() {
        System.out.println("commonEnd");
        int[] a = {1, 2, (4-1)};
        int[] b = {1, 3};
        boolean expResult = true;
        boolean result = instance.commonEnd(a, b);
        assertEquals(expResult, result);
    }
    
}
