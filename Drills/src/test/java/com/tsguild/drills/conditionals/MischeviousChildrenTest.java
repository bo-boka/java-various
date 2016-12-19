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
public class MischeviousChildrenTest {
    
    MischeviousChildren instance;
    
    public MischeviousChildrenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new MischeviousChildren();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of areWeInTrouble method, of class MischeviousChildren.
     */
    @Test
    public void defTestA() {
        System.out.println("areWeInTrouble");
        boolean aSmile = false;
        boolean bSmile = false;
        boolean expResult = false;
        boolean result = instance.areWeInTrouble(aSmile, bSmile);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestB() {
        System.out.println("areWeInTrouble");
        boolean aSmile = false;
        boolean bSmile = true;
        boolean expResult = false;
        boolean result = instance.areWeInTrouble(aSmile, bSmile);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("areWeInTrouble");
        boolean aSmile = true;
        boolean bSmile = true;
        boolean expResult = true;
        boolean result = instance.areWeInTrouble(aSmile, bSmile);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void mishiefSwitchedTF() {
        System.out.println("areWeInTrouble");
        boolean aSmile = true;
        boolean bSmile = false;
        boolean expResult = false;
        boolean result = instance.areWeInTrouble(aSmile, bSmile);
        assertEquals(expResult, result);
        
    }
    
}
