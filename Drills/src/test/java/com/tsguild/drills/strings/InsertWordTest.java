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
public class InsertWordTest {
    InsertWord instance;
    public InsertWordTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new InsertWord();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insertWord method, of class InsertWord.
     */
    @Test
    public void defTestA() {
        System.out.println("insertWord");
        String container = "<<>>";
        String word = "Yay";
        String expResult = "<<Yay>>";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("insertWord");
        String container = "[[]]";
        String word = "word";
        String expResult = "[[word]]";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("insertWord");
        String container = "<<>>";
        String word = "WooHoo";
        String expResult = "<<WooHoo>>";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertWordNoWord() {
        System.out.println("insertWord");
        String container = "<<<<>>>>";
        String word = "";
        String expResult = "<<<<>>>>";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertWordSingleContainer() {
        System.out.println("insertWord");
        String container = "<>";
        String word = "Buttkins";
        String expResult = "<Buttkins>";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testInsertWordWeirdContainer() {
        System.out.println("insertWord");
        String container = "<@<+##+>@>";
        String word = "Hoopla";
        String expResult = "<@<+#Hoopla#+>@>";
        String result = instance.insertWord(container, word);
        assertEquals(expResult, result);
    }
    
}
