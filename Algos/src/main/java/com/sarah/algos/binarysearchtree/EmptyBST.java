/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.binarysearchtree;

/*
 * @author Sarah
 */

public class EmptyBST<D extends Comparable> implements Tree<D>{

    public EmptyBST(){
        
    }
    
    @Override
    public boolean isEmpty(){
        return true;
    }
    
    @Override
    public int cardinality(){
        return 0;
    }
    
    @Override
    public int getHeight(){
        return -1;
    }
    
    @Override
    public boolean member(D elem){
        return false;
    }
    
    @Override
    public NonEmptyBST<D> add(D elem){
        return new NonEmptyBST<>(elem);
    }
}
