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
public class FirstHalfTest {
    FirstHalf instance;
    public FirstHalfTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new FirstHalf();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of firstHalf method, of class FirstHalf.
     */
    @Test
    public void defTestA() {
        System.out.println("firstHalf");
        String str = "WooHoo";
        String expResult = "Woo";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("firstHalf");
        String str = "HelloThere";
        String expResult = "Hello";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("firstHalf");
        String str = "abcdef";
        String expResult = "abc";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFirstHalfEmpty() {
        System.out.println("firstHalf");
        String str = "";
        String expResult = "error";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFirstHalfOdd() {
        System.out.println("firstHalf");
        String str = "WooHoo!";
        String expResult = "error";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testFirstHalfSentence() {
        System.out.println("firstHalf");
        String str = "WooHoo, I got into clown college!!";
        String expResult = "WooHoo, I got int";
        String result = instance.firstHalf(str);
        assertEquals(expResult, result);
    }
    
}
