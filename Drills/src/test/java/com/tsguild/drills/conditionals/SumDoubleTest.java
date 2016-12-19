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
public class SumDoubleTest {
    
    SumDouble instance;
    
    public SumDoubleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SumDouble();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sumDouble method, of class SumDouble.
     */
    @Test
    public void defTestA() {
        System.out.println("sumDouble");
        int a = 1;
        int b = 2;
        int expResult = 3;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("sumDouble");
        int a = 3;
        int b = 2;
        int expResult = 5;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("sumDouble");
        int a = 2;
        int b = 2;
        int expResult = 8;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void sumDoublesTestWithNegativesSameInt() {
        System.out.println("sumDouble");
        int a = -2;
        int b = -2;
        int expResult = -8;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void sumDoublesTestWithNegativesDiffInt() {
        System.out.println("sumDouble");
        int a = -2;
        int b = -4;
        int expResult = -6;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void sumDoublesTestWithAZero() {
        System.out.println("sumDouble");
        int a = 0;
        int b = 4;
        int expResult = 4;
        int result = instance.sumDouble(a, b);
        assertEquals(expResult, result);
        
    }
    
}
