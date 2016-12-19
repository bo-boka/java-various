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
public class CountLast2Test {
    CountLast2 instance;
    public CountLast2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CountLast2();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of countLast2 method, of class CountLast2.
     */
    @Test
    public void defTestA() {
        System.out.println("countLast2");
        String str = "hixxhi";
        int expResult = 1;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("countLast2");
        String str = "xaxxaxaxx";
        int expResult = 1;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("countLast2");
        String str = "axxxaaxx";
        int expResult = 2;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountLast2CountZero() {
        System.out.println("countLast2");
        String str = "axxxaall";
        int expResult = 0;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountLast2EmptyString() {
        System.out.println("countLast2");
        String str = "";
        int expResult = 0;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCountLast2ShortString() {
        System.out.println("countLast2");
        String str = "xx";
        int expResult = 0;
        int result = instance.countLast2(str);
        assertEquals(expResult, result);
    }
    
}
