/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

import com.tsguild.drills.arrays.SameFirstLast;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apprentice
 */
public class SameFirstLastTest {
    
    private SameFirstLast testObj;
    
    public SameFirstLastTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        testObj = new SameFirstLast();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void definitionTestA() {
         int[] testArray = {1, 2, 3};
         boolean result = testObj.sameFirstLast(testArray);
         Assert.assertEquals("false as expected.", false, result);
     }
     
     @Test
     public void definitionTestB() {
         int[] testArray = {1, 2, 3, 1};
         boolean result = testObj.sameFirstLast(testArray);
         Assert.assertTrue("true as expected.", result);
     }
     
     @Test
     public void definitionTestC() {
         int[] testArray = {1, 2, 1};
         boolean result = testObj.sameFirstLast(testArray);
         Assert.assertTrue("true as expected.", result);
     }
     
     @Test
     public void testSameFirstLastWithBigArray(){
         int[] testArray = {7, 5, 81, 1001, 11, 669, 33, -1, 9485, 221, 1, -1, -9, 7};
         boolean result = testObj.sameFirstLast(testArray);
         Assert.assertTrue("false as expected", result);
         
     }
     
     @Test
     public void testSameFistLastWithSmallArray(){
         int[] testArray = {1, 1};
         boolean result = testObj.sameFirstLast(testArray);
         Assert.assertTrue("false as expected", result);
         
     }
}
