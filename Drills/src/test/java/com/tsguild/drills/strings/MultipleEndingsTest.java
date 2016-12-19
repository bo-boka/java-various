/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.strings;

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
public class MultipleEndingsTest {
    MultipleEndings instance;
    public MultipleEndingsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new MultipleEndings();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of multipleEndings method, of class MultipleEndings.
     */
    @Test
    public void defTestA() {
        System.out.println("multipleEndings");
        String str = "Hello";
        String expResult = "lololo";
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("multipleEndings");
        String str = "ab";
        String expResult = "ababab";
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("multipleEndings");
        String str = "Hi";
        String expResult = "HiHiHi";
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultipleEndingsTooSmall() {
        System.out.println("multipleEndings");
        String str = "";
        String expResult = null;
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultipleEndingsSentence() {
        System.out.println("multipleEndings");
        String str = "Hi, I'm going to the store!";
        String expResult = "e!e!e!";
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMultipleEndingsOneLetter() {
        System.out.println("multipleEndings");
        String str = "H";
        String expResult = null;
        String result = instance.multipleEndings(str);
        assertEquals(expResult, result);
    }
    
}
