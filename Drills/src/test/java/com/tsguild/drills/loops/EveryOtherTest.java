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
public class EveryOtherTest {
    EveryOther instance;
    public EveryOtherTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new EveryOther();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of everyOther method, of class EveryOther.
     */
    @Test
    public void defTestA() {
        System.out.println("everyOther");
        String str = "Hello";
        String expResult = "Hlo";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("everyOther");
        String str = "Hi";
        String expResult = "H";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("everyOther");
        String str = "Heeololeo";
        String expResult = "Hello";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEveryOtherSentence() {
        System.out.println("everyOther");
        String str = "Does this work in a sentence?";
        String expResult = "De hswr nasnec?";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEveryOtherLong() {
        System.out.println("everyOther");
        String str = "Heeololeo  ialnndl pGwooocdubpyoe";
        String expResult = "Hello and Goodbye";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testEveryOther() {
        System.out.println("everyOther");
        String str = "cornejenppy";
        String expResult = "creepy";
        String result = instance.everyOther(str);
        assertEquals(expResult, result);
    }
    
}
