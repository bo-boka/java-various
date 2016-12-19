package com.tsguild.drills.arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tsguild.drills.arrays.FirstLast6;
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
public class FirstLast6Test {
    
    private FirstLast6 test6s;
    
    public FirstLast6Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        test6s = new FirstLast6();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
     @Test
     public void definitionTestA() {
         int[] testArray = {1, 2, 6};
         boolean result = test6s.firstLast6(testArray);
         Assert.assertEquals("true as expected", true, result);
     }
     
     @Test
     public void definitionTestB() {
         int[] testArray = {6, 1, 2, 3};
         boolean result = test6s.firstLast6(testArray);
         Assert.assertTrue("true as expected", result);
     }
     
     @Test
     public void definitionTestC() {
         int[] testArray = {13, 6, 1, 2, 3};
         boolean result = test6s.firstLast6(testArray);
         Assert.assertFalse("false as expected.", result);
     }
     
     @Test
     public void negativesTest() {
         int[] testArray = {1, 2, -6};
         boolean result = test6s.firstLast6(testArray);
         Assert.assertFalse("expect false", result);
     }
}
