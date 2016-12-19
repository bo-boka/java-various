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
public class BackAroundTest {
    BackAround instance;
    public BackAroundTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new BackAround();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of backAround method, of class BackAround.
     */
    @Test
    public void defTestA() {
        System.out.println("backAround");
        String str = "cat";
        String expResult = "tcatt";
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("backAround");
        String str = "Hello";
        String expResult = "oHelloo";
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("backAround");
        String str = "a";
        String expResult = "aaa";
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void backAroundTestWithLongString() {
        System.out.println("backAround");
        String str = "dubblydooblydooperdeepydumdum";
        String expResult = "mdubblydooblydooperdeepydumdumm";
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void backAroundTestWithDigits() {
        System.out.println("backAround");
        String str = "d2bblydooblydooperdeepydumdum";
        String expResult = "md2bblydooblydooperdeepydumdumm";
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void backAroundTestNull() {
        System.out.println("backAround");
        String str = "";
        String expResult = null;
        String result = instance.backAround(str);
        assertEquals(expResult, result);
        
    }
    
}
