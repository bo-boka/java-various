/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.conditionals;

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
public class MissingCharTest {
    
    MissingChar instance;
    
    public MissingCharTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new MissingChar();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of missingChar method, of class MissingChar.
     */
    @Test
    public void defTestA() {
        System.out.println("missingChar");
        String str = "kitten";
        int n = 1;
        String expResult = "ktten";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("missingChar");
        String str = "kitten";
        int n = 0;
        String expResult = "itten";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("missingChar");
        String str = "kitten";
        int n = 4;
        String expResult = "kittn";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void missingCharTestStringWithDigits() {
        System.out.println("missingChar");
        String str = "nope1yes";
        int n = 5;
        String expResult = "nope1es";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void missingCharTestNoRepeatDeletions() {
        System.out.println("missingChar");
        String str = "kitten";
        int n = 2;
        String expResult = "kiten";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void missingCharTestSentence() {
        System.out.println("missingChar");
        String str = "kitten went bye";
        int n = 8;
        String expResult = "kitten wnt bye";
        String result = instance.missingChar(str, n);
        assertEquals(expResult, result);
        
    }
    
}
