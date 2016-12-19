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
public class Array123Test {
    Array123 instance;
    public Array123Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Array123();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of array123 method, of class Array123.
     */
    @Test
    public void defTestA() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 3, 1};
        boolean expResult = true;
        boolean result = instance.array123(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 4, 1};
        boolean expResult = false;
        boolean result = instance.array123(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("array123");
        int[] numbers = {1, 1, 2, 1, 2, 3};
        boolean expResult = true;
        boolean result = instance.array123(numbers);
        assertEquals(expResult, result);
    }
    
}
