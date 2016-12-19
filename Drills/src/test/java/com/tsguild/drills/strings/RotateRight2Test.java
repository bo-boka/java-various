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
public class RotateRight2Test {
    RotateRight2 instance;
    public RotateRight2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new RotateRight2();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of rotateReft2 method, of class RotateRight2.
     */
    @Test
    public void defTestA() {
        System.out.println("rotateReft2");
        String str = "Hello";
        String expResult = "loHel";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("rotateReft2");
        String str = "java";
        String expResult = "vaja";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("rotateReft2");
        String str = "hi";
        String expResult = "hi";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRotateReft2TooSmall() {
        System.out.println("rotateReft2");
        String str = "H";
        String expResult = "error";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    @Test
    public void testRotateReft2Empty() {
        System.out.println("rotateReft2");
        String str = "";
        String expResult = "error";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    @Test
    public void testRotateReft2Large() {
        System.out.println("rotateReft2");
        String str = "Hello, I'm not from around here";
        String expResult = "reHello, I'm not from around he";
        String result = instance.rotateReft2(str);
        assertEquals(expResult, result);
    }
    
}
