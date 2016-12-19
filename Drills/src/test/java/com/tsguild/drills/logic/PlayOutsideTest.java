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
public class PlayOutsideTest {
    PlayOutside instance;
    public PlayOutsideTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new PlayOutside();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of playOutside method, of class PlayOutside.
     */
    @Test
    public void defTestA() {
        System.out.println("playOutside");
        int temp = 70;
        boolean isSummer = false;
        boolean expResult = true;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("playOutside");
        int temp = 95;
        boolean isSummer = false;
        boolean expResult = false;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("playOutside");
        int temp = 95;
        boolean isSummer = true;
        boolean expResult = true;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayOutsideTooLow() {
        System.out.println("playOutside");
        int temp = 30;
        boolean isSummer = false;
        boolean expResult = false;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayOutsideNegative() {
        System.out.println("playOutside");
        int temp = -5;
        boolean isSummer = false;
        boolean expResult = false;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testPlayOutsideZeroSummer() {
        System.out.println("playOutside");
        int temp = 0;
        boolean isSummer = true;
        boolean expResult = false;
        boolean result = instance.playOutside(temp, isSummer);
        assertEquals(expResult, result);
    }
    
}
