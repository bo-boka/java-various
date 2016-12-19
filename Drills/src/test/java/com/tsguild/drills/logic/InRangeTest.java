/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.logic;

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
public class InRangeTest {
    InRange instance;
    public InRangeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new InRange();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of inRange method, of class InRange.
     */
    @Test
    public void defTestA() {
        System.out.println("inRange");
        int n = 5;
        boolean outsideMode = false;
        boolean expResult = true;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("inRange");
        int n = 11;
        boolean outsideMode = false;
        boolean expResult = false;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("inRange");
        int n = 11;
        boolean outsideMode = true;
        boolean expResult = true;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRangeTooLowOutsideMode() {
        System.out.println("inRange");
        int n = 0;
        boolean outsideMode = true;
        boolean expResult = true;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRangeTooLowOutsideModeOff() {
        System.out.println("inRange");
        int n = -3;
        boolean outsideMode = false;
        boolean expResult = false;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInRangeOutsideMode() {
        System.out.println("inRange");
        int n = 8;
        boolean outsideMode = true;
        boolean expResult = false;
        boolean result = instance.inRange(n, outsideMode);
        assertEquals(expResult, result);
    }
    
}
