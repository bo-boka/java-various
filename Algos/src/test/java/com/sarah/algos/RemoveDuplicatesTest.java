/*
 *  Copyright 2017 SarahBoka
 */
package com.sarah.algos;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sarah
 */
public class RemoveDuplicatesTest {
    
    public RemoveDuplicatesTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of removeDupesWSet method, of class RemoveDuplicates.
     */
    @Test
    public void testRemoveDupesWSet() {
        System.out.println("removeDupesWSet");
        String s = "abca";
        String expResult = "abc";
        String result = RemoveDuplicates.removeDupesWSet(s);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of removeDupesNoBuffer method, of class RemoveDuplicates.
     */
    @Test
    public void testRemoveDupesNoBufferTestA() {
        System.out.println("removeDupesNoBuffer");
        String s = "aba";
        String expResult = "ab";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferTestB() {
        System.out.println("removeDupesNoBuffer");
        String s = "abcdd";
        String expResult = "abcd";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferTestC() {
        System.out.println("removeDupesNoBuffer");
        String s = "abaaaa";
        String expResult = "ab";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferManySame() {
        System.out.println("removeDupesNoBuffer");
        String s = "abcaadaaaefaaafafaghijkalmnaa";
        String expResult = "abcnmdlkjefihg";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferAllSame() {
        System.out.println("removeDupesNoBuffer");
        String s = "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
        String expResult = "b";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferStartEndSame3() {
        System.out.println("removeDupesNoBuffer");
        String s = "bbbhellohowareyoudoingimfinehappytoseeyouagainbbb";
        String expResult = "bnihelyopawmrsftudg";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferNoDuplicates() {
        System.out.println("removeDupesNoBuffer");
        String s = "ahdiwk";
        String expResult = "ahdiwk";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferContinuousDuplicates() {
        System.out.println("removeDupesNoBuffer");
        String s = "aaaabbbccccddeee";
        String expResult = "aedcb";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testRemoveDupesNoBufferNullString() {
        System.out.println("removeDupesNoBuffer");
        String s = "";
        String expResult = "";
        String result = RemoveDuplicates.removeDupesNoBuffer(s);
        assertEquals(expResult, result);
    }
    
}
