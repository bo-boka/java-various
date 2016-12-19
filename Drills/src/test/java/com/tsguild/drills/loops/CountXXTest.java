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
public class CountXXTest {
    CountXX instance;
    public CountXXTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CountXX();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of countXX method, of class CountXX.
     */
    @Test
    public void testDefA() {
        System.out.println("countXX");
        String str = "abcxx";
        int expResult = 1;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefB() {
        System.out.println("countXX");
        String str = "xxx";
        int expResult = 2;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDefC() {
        System.out.println("countXX");
        String str = "xxxx";
        int expResult = 3;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
    
    @Test
    public void testCountXX() {
        System.out.println("countXX");
        String str = "xxbubxxxbub";
        int expResult = 3;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCountSingleX() {
        System.out.println("countXX");
        String str = "x";
        int expResult = 0;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
     @Test
    public void testCountXXSentence() {
        System.out.println("countXX");
        String str = "I was goinxxg to xxx lexxxxxave";
        int expResult = 7;
        int result = instance.countXX(str);
        assertEquals(expResult, result);
    }
    
}
