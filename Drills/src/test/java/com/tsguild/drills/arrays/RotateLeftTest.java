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
public class RotateLeftTest {
    RotateLeft instance;
    public RotateLeftTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RotateLeft();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rotateLeft method, of class RotateLeft.
     */
    @Test
    public void defTestA() {
        System.out.println("rotateLeft");
        int[] numbers = {1, 2, 3};
        int[] expResult = {2, 3, 1};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("rotateLeft");
        int[] numbers = {5, 11, 9};
        int[] expResult = {11, 9, 5};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("rotateLeft");
        int[] numbers = {7, 0, 0};
        int[] expResult = {0, 0, 7};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeftWithNegatives() {
        System.out.println("rotateLeft");
        int[] numbers = {-7, 0, 1};
        int[] expResult = {0, 1, -7};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeftWithLongArray() {
        System.out.println("rotateLeft");
        int[] numbers = {7, 0, 0, 2, 6, 7, 4, 1, 9, 5, 3, 9, 6, 3, 4, 2};
        int[] expResult = {0, 0, 2, 6, 7, 4, 1, 9, 5, 3, 9, 6, 3, 4, 2, 7};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeftWithExpressions() {
        System.out.println("rotateLeft");
        int[] numbers = {7, (3+2), (1-2)};
        int[] expResult = {5, -1, 7};
        int[] result = instance.rotateLeft(numbers);
        assertArrayEquals(expResult, result);
    }
    
}
