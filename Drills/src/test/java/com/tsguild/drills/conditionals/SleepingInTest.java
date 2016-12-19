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
public class SleepingInTest {
    
    SleepingIn instance;
    
    public SleepingInTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new SleepingIn();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of canSleepIn method, of class SleepingIn.
     */
    
    @Test
    public void defTestA() {
        System.out.println("canSleepIn");
        boolean isWeekday = false;
        boolean isVacation = false;
        boolean expResult = true;
        boolean result = instance.canSleepIn(isWeekday, isVacation);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("canSleepIn");
        boolean isWeekday = true;
        boolean isVacation = false;
        boolean expResult = false;
        boolean result = instance.canSleepIn(isWeekday, isVacation);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("canSleepIn");
        boolean isWeekday = false;
        boolean isVacation = true;
        boolean expResult = true;
        boolean result = instance.canSleepIn(isWeekday, isVacation);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testBothTrue() {
        System.out.println("canSleepIn");
        boolean isWeekday = true;
        boolean isVacation = true;
        boolean expResult = true;
        boolean result = instance.canSleepIn(isWeekday, isVacation);
        assertEquals(expResult, result);
        
    }
    
}
