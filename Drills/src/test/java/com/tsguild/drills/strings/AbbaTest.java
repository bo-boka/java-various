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
public class AbbaTest {
    Abba instance;
    public AbbaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Abba();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of abba method, of class Abba.
     */
    @Test
    public void defTestA() {
        System.out.println("abba");
        String a = "Hi";
        String b = "Bye";
        String expResult = "HiByeByeHi";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("abba");
        String a = "Yo";
        String b = "Alice";
        String expResult = "YoAliceAliceYo";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("abba");
        String a = "What";
        String b = "Up";
        String expResult = "WhatUpUpWhat";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAbbaSentences() {
        System.out.println("abba");
        String a = "What up!";
        String b = "How goes it?";
        String expResult = "What up!How goes it?How goes it?What up!";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAbbaSingleLetters() {
        System.out.println("abba");
        String a = "A";
        String b = "B";
        String expResult = "ABBA";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAbbaDigitsInside() {
        System.out.println("abba");
        String a = "W1at";
        String b = "U9";
        String expResult = "W1atU9U9W1at";
        String result = instance.abba(a, b);
        assertEquals(expResult, result);
    }
    
}
