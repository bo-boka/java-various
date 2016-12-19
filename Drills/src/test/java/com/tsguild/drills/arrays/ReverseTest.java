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
public class ReverseTest {
    Reverse instance;
    public ReverseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Reverse();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of reverse method, of class Reverse.
     */
    @Test
    public void defTestA() {
        System.out.println("reverse");
        int[] numbers = {1, 2, 3};
        int[] expResult = {3, 2, 1};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("reverse");
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] expResult = {6, 5, 4, 3, 2, 1};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("reverse");
        int[] numbers = {1, 4, 3, 5, 2};
        int[] expResult = {2, 5, 3, 4, 1};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void reverseTestWithZeros() {
        System.out.println("reverse");
        int[] numbers = {0, 0, 0, 5, 2};
        int[] expResult = {2, 5, 0, 0, 0};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void reverseEmpty() {
        System.out.println("reverse");
        int[] numbers = {};
        int[] expResult = {};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void reverseWithNegatives() {
        System.out.println("reverse");
        int[] numbers = {1, -4, -3, 5, 2};
        int[] expResult = {2, 5, -3, -4, 1};
        int[] result = instance.reverse(numbers);
        assertArrayEquals(expResult, result);
    }
    
}
