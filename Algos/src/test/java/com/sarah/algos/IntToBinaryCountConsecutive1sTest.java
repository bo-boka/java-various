/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
public class IntToBinaryCountConsecutive1sTest {
    
    public IntToBinaryCountConsecutive1sTest() {
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
     * Test of binary1s method, of class IntToBinaryCountConsecutive1s.
     */
    @Test
    public void testBinary1s() {
        System.out.println("binary1s 101");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(5);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s2() {
        System.out.println("binary1s 11");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(3);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s3() {
        System.out.println("binary1s 111");
        int expResult = 3;
        int result = IntToBinaryCountConsecutive1s.binary1s(7);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s4() {
        System.out.println("binary1s 1000");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(8);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s5() {
        System.out.println("binary1s 1100");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(12);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s6() {
        System.out.println("binary1s 1111");
        int expResult = 4;
        int result = IntToBinaryCountConsecutive1s.binary1s(15);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s7() {
        System.out.println("binary1s 1");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(1);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s8() {
        System.out.println("binary1s 10");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(2);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s9() {
        System.out.println("binary1s 100011");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(35);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s10() {
        System.out.println("binary1s 1010");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(10);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s11() {
        System.out.println("binary1s 101001");
        int expResult = 1;
        int result = IntToBinaryCountConsecutive1s.binary1s(41);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s12() {
        System.out.println("binary1s 110000");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(48);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s13() {
        System.out.println("binary1s 111111");
        int expResult = 6;
        int result = IntToBinaryCountConsecutive1s.binary1s(63);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s14() {
        System.out.println("binary1s 1100011");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(99);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s15() {
        System.out.println("binary1s 1011101");
        int expResult = 3;
        int result = IntToBinaryCountConsecutive1s.binary1s(93);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s16() {
        System.out.println("binary1s 1011100");
        int expResult = 3;
        int result = IntToBinaryCountConsecutive1s.binary1s(92);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s17() {
        System.out.println("binary1s 110110");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(54);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s18() {
        System.out.println("binary1s 1011010");
        int expResult = 2;
        int result = IntToBinaryCountConsecutive1s.binary1s(90);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s19() {
        System.out.println("binary1s 101111001011");
        int expResult = 4;
        int result = IntToBinaryCountConsecutive1s.binary1s(3019);
        assertEquals(expResult, result);       
    }
    
    @Test
    public void testBinary1s20() {
        System.out.println("binary1s 1111010100011100001");
        int expResult = 4;
        int result = IntToBinaryCountConsecutive1s.binary1s(501985);
        assertEquals(expResult, result);       
    }
}
