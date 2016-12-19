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
public class SayHiTest {
    SayHi instance;
    public SayHiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SayHi();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sayHi method, of class SayHi.
     */
    @Test
    public void defTestA() {
        System.out.println("sayHi");
        String name = "Bob";
        String expResult = "Hello Bob!";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("sayHi");
        String name = "Alice";
        String expResult = "Hello Alice!";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("sayHi");
        String name = "X";
        String expResult = "Hello X!";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSayHiFullName() {
        System.out.println("sayHi");
        String name = "Alex Baldwin";
        String expResult = "Hello Alex Baldwin!";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSayHiLettersAndDigits() {
        System.out.println("sayHi");
        String name = "Harr1s0n";
        String expResult = "Hello Harr1s0n!";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testSayHiEmpty() {
        System.out.println("sayHi");
        String name = "";
        String expResult = "Hello !";
        String result = instance.sayHi(name);
        assertEquals(expResult, result);
    }
    
}
