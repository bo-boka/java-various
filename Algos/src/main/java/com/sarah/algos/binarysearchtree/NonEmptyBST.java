/*
 *  Copyright 2017 SarahBoka
 */

package com.sarah.algos.binarysearchtree;

/*
 * @author Sarah
 */

class NonEmptyBST<D extends Comparable> implements Tree<D> {

    D data;
    Tree<D> left;
    Tree<D> right;
    
    public NonEmptyBST(D elem){
        this.data = elem;
        left = new EmptyBST<D>();
        right = new EmptyBST<D>();
    }
    
    public NonEmptyBST(D data, Tree<D> left, Tree<D> right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
    
    @Override
    public boolean isEmpty(){
        return false;
    }
    
    @Override
    public int cardinality(){
        return 1 + left.cardinality() + right.cardinality();
    }
    
    @Override
    public int getHeight(){
        if (data == null) {
            return -1;
        } else {
            return 1 + Math.max( left.getHeight(), right.getHeight());
        }
    }
    
    @Override
    public boolean member(D elem){
        if (data == elem){
            return true;
        } else {
            if (data.compareTo(elem) < 0){
                return left.member(elem);
            } else {
            return right.member(elem);
            }
        }
    }
    
    @Override
    public NonEmptyBST<D> add(D elem){
        if (data == elem){
            return this;
        } else {
            if (data.compareTo(elem) < 0){
                return new NonEmptyBST(elem, left.add(elem), right);
            } else {
                return new NonEmptyBST(elem, left, right.add(elem));
            }
        }
    }
}
