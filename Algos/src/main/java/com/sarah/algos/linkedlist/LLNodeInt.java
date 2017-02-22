/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos.linkedlist;

/**
 *
 * @author Sarah
 */
public class LLNodeInt {
    
    LLNodeInt next;
    int data;
    
    public LLNodeInt(int data){
        this.data = data;
        next = null;
    }
    
    public LLNodeInt(int data, LLNodeInt next){
        this.data = data;
        this.next = next;
    }
    
    public int getData(){
        return data;
    }
    
    public LLNodeInt getNext(){
        return next;
    }
    
    public void setData(int newData){
        this.data = newData;
    }
    
    public void setNext(LLNodeInt next){
        this.next = next;
    }
    
}
