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
public class StringSplosionTest {
    StringSplosion instance;
    public StringSplosionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new StringSplosion();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of stringSplosion method, of class StringSplosion.
     */
    
    @Test
    public void defTestA() {
        System.out.println("stringSplosion");
        String str = "Code";
        String expResult = "CCoCodCode";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("stringSplosion");
        String str = "abc";
        String expResult = "aababc";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("stringSplosion");
        String str = "ab";
        String expResult = "aab";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringSplosionLongWord() {
        System.out.println("stringSplosion");
        String str = "AbsoluteStringSpluge";
        String expResult = "AAbAbsAbsoAbsolAbsoluAbsolutAbsoluteAbsoluteSAbsoluteStAbsoluteStrAbsoluteStriAbsoluteStrinAbsoluteStringAbsoluteStringSAbsoluteStringSpAbsoluteStringSplAbsoluteStringSpluAbsoluteStringSplugAbsoluteStringSpluge";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringSplosionEmpty() {
        System.out.println("stringSplosion");
        String str = "";
        String expResult = "";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testStringSplosionSentence() {
        System.out.println("stringSplosion");
        String str = "I'm dying.";
        String expResult = "II'I'mI'm I'm dI'm dyI'm dyiI'm dyinI'm dyingI'm dying.";
        String result = instance.stringSplosion(str);
        assertEquals(expResult, result);
    }
    
}
