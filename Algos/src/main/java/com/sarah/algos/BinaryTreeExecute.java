/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos;



/**
 *
 * @author Sarah
 */
public class BinaryTreeExecute {
    
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        
        bt.build123();
        
        bt.breadthSearch(bt.root);
    }
    
}
