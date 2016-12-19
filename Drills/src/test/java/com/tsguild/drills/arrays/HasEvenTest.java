/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.arrays;

import com.tsguild.drills.arrays.HasEven;
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
public class HasEvenTest {
    
    private HasEven testObj;
    
    public HasEvenTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
        testObj = new HasEven();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void definitionTestA() {
     
         int[] testArray = {4, 3};
         boolean result = testObj.hasEven(testArray);
         Assert.assertEquals("Input ?not? true as expected.", true, result);
     }
     
     @Test
     public void definitionTestB(){
         int[] testArray = {2, 5};
         boolean result = testObj.hasEven(testArray);
         Assert.assertTrue("true as expected", result);
     }
     
     @Test
     public void definitionTestC(){
         int[] testArray = {7, 5};
         boolean result = testObj.hasEven(testArray);
         Assert.assertFalse("false as expected", result);
     }
     
     @Test
     public void testHasEvenWithBigArray(){
         int[] testArray = {7, 5, 81, 1001, 11, 669, 33, -1, 9485, 221, 1, -1, -9, 2222222};
         boolean result = testObj.hasEven(testArray);
         Assert.assertTrue("false as expected", result);
         
     }
     
     @Test
     public void testHasEvenWithSmalArray(){
         int[] testArray = {-7};
         boolean result = testObj.hasEven(testArray);
         Assert.assertTrue("true as expected", result);
         
     }
}
