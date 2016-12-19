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
public class GreatPartyTest {
    GreatParty instance;
    public GreatPartyTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new GreatParty();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of greatParty method, of class GreatParty.
     */
    @Test
    public void defTestA() {
        System.out.println("greatParty");
        int cigars = 30;
        boolean isWeekend = false;
        boolean expResult = false;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("greatParty");
        int cigars = 50;
        boolean isWeekend = false;
        boolean expResult = true;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("greatParty");
        int cigars = 70;
        boolean isWeekend = true;
        boolean expResult = true;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreatPartyZero() {
        System.out.println("greatParty");
        int cigars = 0;
        boolean isWeekend = false;
        boolean expResult = false;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreatPartyNegative() {
        System.out.println("greatParty");
        int cigars = -7;
        boolean isWeekend = true;
        boolean expResult = false;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGreatPartyManyCigars() {
        System.out.println("greatParty");
        int cigars = 700000;
        boolean isWeekend = true;
        boolean expResult = true;
        boolean result = instance.greatParty(cigars, isWeekend);
        assertEquals(expResult, result);
    }
    
}
