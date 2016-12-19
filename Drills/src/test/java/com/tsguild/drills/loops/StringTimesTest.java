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
public class StringTimesTest {
    StringTimes instance;
    public StringTimesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new StringTimes();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of stringTimes method, of class StringTimes.
     */
    @Test
    public void defTestA() {
        System.out.println("stringTimes");
        String str = "Hi";
        int n = 2;
        String expResult = "HiHi";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("stringTimes");
        String str = "Hi";
        int n = 3;
        String expResult = "HiHiHi";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("stringTimes");
        String str = "Hi";
        int n = 1;
        String expResult = "Hi";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }

    @Test
    public void testStringTimes() {
        System.out.println("stringTimes");
        String str = "BoopBeep";
        int n = 5;
        String expResult = "BoopBeepBoopBeepBoopBeepBoopBeepBoopBeep";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringTimesNegative() {
        System.out.println("stringTimes");
        String str = "Hi";
        int n = -1;
        String expResult = "nope";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringTimesSentence() {
        System.out.println("stringTimes");
        String str = "Hi my name is Buffy";
        int n = 3;
        String expResult = "Hi my name is BuffyHi my name is BuffyHi my name is Buffy";
        String result = instance.stringTimes(str, n);
        assertEquals(expResult, result);
    }
    
}
