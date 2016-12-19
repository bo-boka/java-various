/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

import com.tsguild.drills.arrays.MakePi;
import junit.framework.Assert;
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
public class MakePiTest {
    
    private MakePi testObj;
    
    public MakePiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testObj = new MakePi();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void definitionTestA() {
         int testN = 3;
         int[] expected = {3, 1, 4};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
     
     @Test
     public void definitionTestB() {
         int testN = 1;
         int[] expected = {3};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
     
     @Test
     public void definitionTestC() {
         int testN = 7;
         int[] expected = {3, 1, 4, 1, 5, 9, 2};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
     
     @Test
     public void testMakePiWithNMax(){
         int testN = 12;
         int[] expected = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
     
     @Test
     public void testMakePiWithNMin() {
         int testN = 0;
         int[] expected = {};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
     
     @Test
     public void testMakePiTooHigh() {
         int testN = 17;
         int[] expected = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 9, 0, 0, 0, 0, 0};
         int[] result = testObj.makePi(testN);
         assertArrayEquals(expected, result);
     }
}
