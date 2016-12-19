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
public class RotateLeft2Test {
    RotateLeft2 instance;
    public RotateLeft2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RotateLeft2();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rotateLeft2 method, of class RotateLeft2.
     */
    @Test
    public void defTestA() {
        System.out.println("rotateLeft2");
        String str = "Hello";
        String expResult = "lloHe";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("rotateLeft2");
        String str = "java";
        String expResult = "vaja";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("rotateLeft2");
        String str = "hi";
        String expResult = "hi";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeft2TooSmall() {
        System.out.println("rotateLeft2");
        String str = "H";
        String expResult = "error";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeft2Empty() {
        System.out.println("rotateLeft2");
        String str = "";
        String expResult = "error";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotateLeft2BigWord() {
        System.out.println("rotateLeft2");
        String str = "Hellofragilisticexpialladocious";
        String expResult = "llofragilisticexpialladociousHe";
        String result = instance.rotateLeft2(str);
        assertEquals(expResult, result);
    }
    
}
