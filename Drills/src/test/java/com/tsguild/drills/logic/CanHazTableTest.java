/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.logic;

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
public class CanHazTableTest {
    CanHazTable instance;
    public CanHazTableTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CanHazTable();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of canHazTable method, of class CanHazTable.
     */
    @Test
    public void defTestA() {
        System.out.println("canHazTable");
        int yourStyle = 5;
        int dateStyle = 10;
        int expResult = 2;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("canHazTable");
        int yourStyle = 5;
        int dateStyle = 2;
        int expResult = 0;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("canHazTable");
        int yourStyle = 5;
        int dateStyle = 5;
        int expResult = 1;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanHazTableBothZero() {
        System.out.println("canHazTable");
        int yourStyle = 0;
        int dateStyle = 0;
        int expResult = 0;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanHazTableTooHigh() {
        System.out.println("canHazTable");
        int yourStyle = 15;
        int dateStyle = 5;
        int expResult = -1;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testCanHazTableStylishNegative() {
        System.out.println("canHazTable");
        int yourStyle = -8;
        int dateStyle = 9;
        int expResult = -1;
        int result = instance.canHazTable(yourStyle, dateStyle);
        assertEquals(expResult, result);
    }
    
    
}
