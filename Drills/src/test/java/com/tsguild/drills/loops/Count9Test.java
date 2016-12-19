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
public class Count9Test {
    Count9 instance;
    public Count9Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Count9();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of count9 method, of class Count9.
     */
    @Test
    public void defTestA() {
        System.out.println("count9");
        int[] numbers = {1, 2, 9};
        int expResult = 1;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("count9");
        int[] numbers = {1, 9, 9};
        int expResult = 2;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("count9");
        int[] numbers = {1, 9, 9, 3, 9};
        int expResult = 3;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCount9Long() {
        System.out.println("count9");
        int[] numbers = {1, 9, 9, 3, 9, 0, 0, 8 ,8, 9, 9, 9, 0, 5, 9};
        int expResult = 7;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCount9Zero() {
        System.out.println("count9");
        int[] numbers = {1, 7, 2, 3, 1};
        int expResult = 0;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCount9Empty() {
        System.out.println("count9");
        int[] numbers = {};
        int expResult = 0;
        int result = instance.count9(numbers);
        assertEquals(expResult, result);
    }
    
}
