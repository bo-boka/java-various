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
public class LongMiddleTest {
    LongMiddle instance;
    public LongMiddleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new LongMiddle();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of longInMiddle method, of class LongMiddle.
     */
    @Test
    public void defTestA() {
        System.out.println("longInMiddle");
        String a = "Hello";
        String b = "hi";
        String expResult = "hiHellohi";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    @Test
    public void defTestB() {
        System.out.println("longInMiddle");
        String a = "hi";
        String b = "Hello";
        String expResult = "hiHellohi";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("longInMiddle");
        String a = "aaa";
        String b = "b";
        String expResult = "baaab";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongInMiddleOneEmpty() {
        System.out.println("longInMiddle");
        String a = "Hello";
        String b = "";
        String expResult = "Hello";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongInMiddleBothEmpty() {
        System.out.println("longInMiddle");
        String a = "";
        String b = "";
        String expResult = "";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testLongInMiddleSameLength() {
        System.out.println("longInMiddle");
        String a = "Hello";
        String b = "hillo";
        String expResult = "error";
        String result = instance.longInMiddle(a, b);
        assertEquals(expResult, result);
    }
    
}
