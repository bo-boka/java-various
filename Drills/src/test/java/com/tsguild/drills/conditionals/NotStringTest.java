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
public class NotStringTest {
    
    NotString instance;
    
    public NotStringTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new NotString();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of notString method, of class NotString.
     */
    @Test
    public void defTestA() {
        System.out.println("notString");
        String s = "candy";
        String expResult = "not candy";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("notString");
        String s = "x";
        String expResult = "not x";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("notString");
        String s = "not bad";
        String expResult = "not bad";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void notStringTestStringWithDigits() {
        System.out.println("notString");
        String s = "093849";
        String expResult = "not 093849";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void notStringTestEmptyString() {
        System.out.println("notString");
        String s = "";
        String expResult = "not ";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void notStringTestOnlyNot() {
        System.out.println("notString");
        String s = "not ";
        String expResult = "not ";
        String result = instance.notString(s);
        assertEquals(expResult, result);
        
    }
    
}
