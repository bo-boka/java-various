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
public class FrontTimesTest {
    FrontTimes instance;
    public FrontTimesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new FrontTimes();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of frontTimes method, of class FrontTimes.
     */
    @Test
    public void defTestA() {
        System.out.println("frontTimes");
        String str = "Chocolate";
        int n = 2;
        String expResult = "ChoCho";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("frontTimes");
        String str = "Chocolate";
        int n = 3;
        String expResult = "ChoChoCho";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("frontTimes");
        String str = "Abc";
        int n = 2;
        String expResult = "AbcAbc";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFrontTimesTwoLetters() {
        System.out.println("frontTimes");
        String str = "No";
        int n = 7;
        String expResult = "NoNoNoNoNoNoNo";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFrontTimesNegative() {
        System.out.println("frontTimes");
        String str = "Abc";
        int n = -2;
        String expResult = "nope";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFrontTimesSentence() {
        System.out.println("frontTimes");
        String str = "Now you know it's over.";
        int n = 3;
        String expResult = "NowNowNow";
        String result = instance.frontTimes(str, n);
        assertEquals(expResult, result);
    }
    
}
