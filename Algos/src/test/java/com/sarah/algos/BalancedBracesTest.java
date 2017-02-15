/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah
 */
public class BalancedBracesTest {
    
    public BalancedBracesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    
    @Test
    public void testBracesTestA() {
        System.out.println("braces");
        String expResult = "NO";
        String result = BalancedBraces.braces("}][)");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestB() {
        System.out.println("braces");
        String expResult = "YES";
        String result = BalancedBraces.braces("[](){}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestC() {
        System.out.println("braces");
        String expResult = "YES";
        String result = BalancedBraces.braces("{[()]}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestSubtleFail() {
        System.out.println("braces");
        String expResult = "NO";
        String result = BalancedBraces.braces("{[()]}}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestOutOfOrderFail() {
        System.out.println("braces");
        String expResult = "NO";
        String result = BalancedBraces.braces("{([){]}}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestLessObviousPass() {
        System.out.println("braces");
        String expResult = "YES";
        String result = BalancedBraces.braces("{({[()][]([])})[]}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestAllOneTypeFail() {
        System.out.println("braces");
        String expResult = "NO";
        String result = BalancedBraces.braces("{{}{{{}}}{}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestAllOneTypePass() {
        System.out.println("braces");
        String expResult = "YES";
        String result = BalancedBraces.braces("{{}{{{}}}{}}");
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBracesTestSameTypeStartingBackwardsFail() {
        System.out.println("braces");
        String expResult = "NO";
        String result = BalancedBraces.braces("}{{}{{{}}}{}}{");
        assertEquals(expResult, result);
        
    }
    
}
