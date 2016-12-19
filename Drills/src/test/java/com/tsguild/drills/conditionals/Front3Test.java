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
public class Front3Test {
    Front3 instance;
    public Front3Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Front3();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of front3 method, of class Front3.
     */
    @Test
    public void defTestA() {
        System.out.println("front3");
        String str = "Microsoft";
        String expResult = "MicMicMic";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    @Test
    public void defTestB() {
        System.out.println("front3");
        String str = "Chocolate";
        String expResult = "ChoChoCho";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void defTestC() {
        System.out.println("front3");
        String str = "at";
        String expResult = "atatat";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void front3TestSingle() {
        System.out.println("front3");
        String str = "a";
        String expResult = "aaa";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void front3TestLongString() {
        System.out.println("front3");
        String str = "supercalafradgilisticexpialidocious";
        String expResult = "supsupsup";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    
    @Test
    public void front3TestSentence() {
        System.out.println("front3");
        String str = "At the market, we found tom.";
        String expResult = "At At At ";
        String result = instance.front3(str);
        assertEquals(expResult, result);
        
    }
    
}
