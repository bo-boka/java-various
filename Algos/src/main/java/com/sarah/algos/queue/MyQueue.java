/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos.queue;

import java.util.LinkedList;

/**
 *
 * @author Sarah
 */
public class MyQueue {
    
    LinkedList queue;
    
    public MyQueue(){
        this.queue = new LinkedList();
    }
    
    public boolean isEmpty(){
        return queue.isEmpty();
    }
    
    public int size(){
        return queue.size();
    }
    
    public void enqueue(int n){
        queue.addLast(n);
    }
    
    public int dequeue(){
        return (int) queue.remove(0);
    }
    
    public int peek(int n){
        return (int) queue.get(n);
    }
}
