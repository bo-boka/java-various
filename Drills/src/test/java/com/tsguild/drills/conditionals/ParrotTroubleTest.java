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
public class ParrotTroubleTest {
    
    ParrotTrouble instance;
    
    public ParrotTroubleTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new ParrotTrouble();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parrotTrouble method, of class ParrotTrouble.
     */
    @Test
    public void defTestA() {
        System.out.println("parrotTrouble");
        boolean isTalking = true;
        int hour = 6;
        boolean expResult = true;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("parrotTrouble");
        boolean isTalking = true;
        int hour = 7;
        boolean expResult = false;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("parrotTrouble");
        boolean isTalking = false;
        int hour = 6;
        boolean expResult = false;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void parrotTroubleTestHourOutOfRangeRange() {
        System.out.println("parrotTrouble");
        boolean isTalking = true;
        int hour = 25;
        boolean expResult = false;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void parrotTroubleTestHourOutOfRangeLow() {
        System.out.println("parrotTrouble");
        boolean isTalking = true;
        int hour = -6;
        boolean expResult = false;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void parrotTroubleTestNotInTrouble() {
        System.out.println("parrotTrouble");
        boolean isTalking = true;
        int hour = 14;
        boolean expResult = false;
        boolean result = instance.parrotTrouble(isTalking, hour);
        assertEquals(expResult, result);
        
    }
    
}
