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
public class CaughtSpeedingTest {
    CaughtSpeeding instance;
    public CaughtSpeedingTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new CaughtSpeeding();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of caughtSpeeding method, of class CaughtSpeeding.
     */
    @Test
    public void defTestA() {
        System.out.println("caughtSpeeding");
        int speed = 60;
        boolean isBirthday = false;
        int expResult = 0;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("caughtSpeeding");
        int speed = 65;
        boolean isBirthday = false;
        int expResult = 1;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("caughtSpeeding");
        int speed = 65;
        boolean isBirthday = true;
        int expResult = 0;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCaughtSpeedingSmallTic() {
        System.out.println("caughtSpeeding");
        int speed = 65;
        boolean isBirthday = true;
        int expResult = 0;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCaughtSpeedingLargeTicButBirthday() {
        System.out.println("caughtSpeeding");
        int speed = 83;
        boolean isBirthday = true;
        int expResult = 1;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void testCaughtSpeedingBelowZero() {
        System.out.println("caughtSpeeding");
        int speed = -4;
        boolean isBirthday = true;
        int expResult = -1;
        int result = instance.caughtSpeeding(speed, isBirthday);
        assertEquals(expResult, result);
        
    }
    
}
