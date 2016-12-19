/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsguild.drills.logic;

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
public class AlarmClockTest {
    AlarmClock instance;
    public AlarmClockTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new AlarmClock();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of alarmClock method, of class AlarmClock.
     */
    @Test
    public void defTestA() {
        System.out.println("alarmClock");
        int day = 1;
        boolean vacation = false;
        String expResult = "7:00";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestB() {
        System.out.println("alarmClock");
        int day = 5;
        boolean vacation = false;
        String expResult = "7:00";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void defTestC() {
        System.out.println("alarmClock");
        int day = 0;
        boolean vacation = false;
        String expResult = "10:00";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAlarmClockOnVacationWeekend() {
        System.out.println("alarmClock");
        int day = 0;
        boolean vacation = true;
        String expResult = "off";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAlarmClockOnVacationWeekday() {
        System.out.println("alarmClock");
        int day = 3;
        boolean vacation = true;
        String expResult = "10:00";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testAlarmClockInvalid() {
        System.out.println("alarmClock");
        int day = -1;
        boolean vacation = false;
        String expResult = "invalid";
        String result = instance.alarmClock(day, vacation);
        assertEquals(expResult, result);
    }
    
}
