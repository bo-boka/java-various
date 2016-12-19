/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.strings;

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
public class MakeTagsTest {
    MakeTags instance;
    public MakeTagsTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new MakeTags();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of makeTags method, of class MakeTags.
     */
    @Test
    public void defTestA() {
        System.out.println("makeTags");
        String tag = "i";
        String content = "Yay";
        String expResult = "<i>Yay</i>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("makeTags");
        String tag = "i";
        String content = "Hello";
        String expResult = "<i>Hello</i>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("makeTags");
        String tag = "cite";
        String content = "Yay";
        String expResult = "<cite>Yay</cite>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeTagsStrong() {
        System.out.println("makeTags");
        String tag = "strong";
        String content = "HALP";
        String expResult = "<strong>HALP</strong>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeTagsSentence() {
        System.out.println("makeTags");
        String tag = "cite";
        String content = "Oh My George";
        String expResult = "<cite>Oh My George</cite>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testMakeTagsWithDigits() {
        System.out.println("makeTags");
        String tag = "div";
        String content = "Yay! Wowz3rz!";
        String expResult = "<div>Yay! Wowz3rz!</div>";
        String result = instance.makeTags(tag, content);
        assertEquals(expResult, result);
    }
    
}
