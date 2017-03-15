/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Sarah
 */
public class Scratch {
    
//    @Before
    public void setUp() {
//        ApplicationContext factory = new ClassPathXmlApplicationContext("test-applicationContext.xml");
//        tApplicationContextestDao = factory.getBean("debateJdbcDao", DebateDao.class);
//        JdbcTemplate cleaner = factory.getBean("jdbcTemplateBean", JdbcTemplate.class);
//        cleaner.execute("DELETE FROM debates WHERE 1=1");
//        cleaner.execute("DELETE FROM rebuttals WHERE 1=1");
//        cleaner.execute("DELETE FROM users WHERE 1=1");
//        cleaner.execute("DELETE FROM categories WHERE 1=1");
    
    }
    
    HashMap<Integer, Debate> debMap = new HashMap<>();
    
   
    
    
    public Scratch(){
        debMap.put(1, d1);
        debMap.put(2, d2);
        debMap.put(3, d3);
        debMap.put(4, d4);
        debMap.put(5, d5);
        debMap.put(6, d6);
        debMap.put(7, d7);
        
    }
    
    public List<Debate> getAll(){
        List<Debate> debArr = new ArrayList<>();
        for (Integer d : debMap.keySet()) {
            debArr.add(debMap.get(d));
        }
        return debArr;
    }
public static void main(String[] args) {
    
        Scratch sc = new Scratch();
        
        List<Debate> debs = new ArrayList<>();
        
        debs = sc.getAll();
        
        for (Debate d : debs){
            System.out.println(d.getResolution());
        }
    
    }
}
