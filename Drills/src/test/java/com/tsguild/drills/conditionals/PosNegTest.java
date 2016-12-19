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
public class PosNegTest {
    
    PosNeg instance;
    
    public PosNegTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new PosNeg();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of posNeg method, of class PosNeg.
     */
    @Test
    public void defTestA() {
        System.out.println("posNeg");
        int a = 1;
        int b = -1;
        boolean negative = false;
        boolean expResult = true;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("posNeg");
        int a = -1;
        int b = 1;
        boolean negative = false;
        boolean expResult = true;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("posNeg");
        int a = -4;
        int b = -5;
        boolean negative = true;
        boolean expResult = true;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
    @Test
    public void posNegTestNegativeFalseWhileBothNeg() {
        System.out.println("posNeg");
        int a = -4;
        int b = -5;
        boolean negative = false;
        boolean expResult = false;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
    @Test
    public void posNegTestNegativeTrueBFalse() {
        System.out.println("posNeg");
        int a = 4;
        int b = -5;
        boolean negative = true;
        boolean expResult = false;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
    @Test
    public void posNegTestNegativeTrueAFalse() {
        System.out.println("posNeg");
        int a = -4;
        int b = 5;
        boolean negative = true;
        boolean expResult = false;
        boolean result = instance.posNeg(a, b, negative);
        assertEquals(expResult, result);
    }
    
}
