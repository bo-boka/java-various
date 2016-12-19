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
public class TrimOneTest {
    TrimOne instance;
    public TrimOneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new TrimOne();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of trimOne method, of class TrimOne.
     */
    @Test
    public void defTestA() {
        System.out.println("trimOne");
        String str = "Hello";
        String expResult = "ell";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("trimOne");
        String str = "java";
        String expResult = "av";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("trimOne");
        String str = "coding";
        String expResult = "odin";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrimOneTooSmall() {
        System.out.println("trimOne");
        String str = "H";
        String expResult = "error";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrimOneEmpty() {
        System.out.println("trimOne");
        String str = "";
        String expResult = "error";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testTrimOneSentence() {
        System.out.println("trimOne");
        String str = "Hello I come in peace.";
        String expResult = "ello I come in peace";
        String result = instance.trimOne(str);
        assertEquals(expResult, result);
    }
    
}
