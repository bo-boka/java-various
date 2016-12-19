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
public class SpecialElevenTest {
    SpecialEleven instance;
    public SpecialElevenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SpecialEleven();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of specialEleven method, of class SpecialEleven.
     */
    @Test
    public void defTestA() {
        System.out.println("specialEleven");
        int n = 22;
        boolean expResult = true;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("specialEleven");
        int n = 23;
        boolean expResult = true;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("specialEleven");
        int n = 24;
        boolean expResult = false;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSpecialElevenZero() {
        System.out.println("specialEleven");
        int n = 0;
        boolean expResult = false;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSpecialElevenNegative() {
        System.out.println("specialEleven");
        int n = -22;
        boolean expResult = false;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSpecialElevenHigh() {
        System.out.println("specialEleven");
        int n = 1679678;
        boolean expResult = true;
        boolean result = instance.specialEleven(n);
        assertEquals(expResult, result);
    }
}
