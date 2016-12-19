/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.shapes;

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
public class ShapeTest {
    
    public ShapeTest() {
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

    @Test
    public void testRecArea() {
        System.out.println("area");
        Shape instance = new Rectangle("blue", 3, 4);
        double expResult = 12.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testRecPerimeter() {
        System.out.println("perimeter");
        Shape instance = new Rectangle("blue", 3, 4);
        double expResult = 14.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTriArea() {
        System.out.println("area");
        Shape instance = new Triangle("green", 2, 3, 4);
        double expResult = 2.9047375096555625;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testTriPerimeter() {
        System.out.println("perimeter");
        Shape instance = new Triangle("green", 2, 3, 4);
        double expResult = 9.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCircArea() {
        System.out.println("area");
        Shape instance = new Circle("pink", 3);
        double expResult = 28.274333882308138;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCircPerimeter() {
        System.out.println("perimeter");
        Shape instance = new Circle("pink", 3);
        double expResult = 18.84955592153876;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testSqArea() {
        System.out.println("area");
        Shape instance = new Square("red", 6);
        double expResult = 36.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testSqPerimeter() {
        System.out.println("perimeter");
        Shape instance = new Square("red", 6);
        double expResult = 24.0;
        double result = instance.perimeter();
        assertEquals(expResult, result, 0.0);
    }
    
}
