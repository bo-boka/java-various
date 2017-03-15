/*
 *  Copyright 2017 SarahBoka
 */
package com.sarah.algos.binarysearchtree;

/**
 *
 * @author Sarah
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public int getHeight();
    public boolean member(D elem);
    public NonEmptyBST<D> add(D elem);
}
