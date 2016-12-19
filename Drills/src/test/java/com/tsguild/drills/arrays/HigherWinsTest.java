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
public class HigherWinsTest {
    HigherWins instance;
    public HigherWinsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new HigherWins();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of higherWins method, of class HigherWins.
     */
    @Test
    public void defTestA() {
        System.out.println("higherWins");
        int[] numbers = {1, 2, 3};
        int[] expResult = {3, 3, 3};
        int[] result = instance.higherWins(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("higherWins");
        int[] numbers = {11, 5, 9};
        int[] expResult = {11, 11, 11};
        int[] result = instance.higherWins(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("higherWins");
        int[] numbers = {2, 11, 3};
        int[] expResult = {3, 3, 3};
        int[] result = instance.higherWins(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testHigherWinsSame() {
        System.out.println("higherWins");
        int[] numbers = {6, 2, 6};
        int[] expResult = {6, 6, 6};
        int[] result = instance.higherWins(numbers);
        assertArrayEquals(expResult, result);
    }
    
    @Test
    public void testHigherWinsSameDiffLength() {
        System.out.println("higherWins");
        int[] numbers = {6, 2, 6, 9, 7, 0};
        int[] expResult = {6, 6, 6, 6, 6, 6};
        int[] result = instance.higherWins(numbers);
        assertArrayEquals(expResult, result);
    }
    
}
