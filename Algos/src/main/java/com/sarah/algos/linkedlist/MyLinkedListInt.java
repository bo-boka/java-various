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
public class MyLinkedListInt {

    LLNodeInt head;
    int count;

    public MyLinkedListInt() {
        head = null;
        count = 0;
    }

    public MyLinkedListInt(LLNodeInt head) {
        this.head = head;
        count = 1;
    }

    public void add(int data) {
        if (head == null) {
            head = new LLNodeInt(data);
            count++;
        } else {
            LLNodeInt current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new LLNodeInt(data));
            count++;
        }
    }

    public int get(int index) {
        LLNodeInt current = head;
        if (index < 1) {
            return -1; //need to write throws exception clause
        } else {
            for (int i = 1; i < index; i++) {
                current = current.getNext();
            }
            return current.getData();
        }
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void remove() {
        if (count == 1){
            head = null;
            count--;
        } else {
            LLNodeInt current = head;
            while (current.getNext().getNext() != null) {
                current = current.getNext();
            }
            current.setNext(null);
            count--;
        }
    }

}
