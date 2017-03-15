/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sarah.algos.binarytree;


import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Sarah
 */
public class BinaryTree {
  
  // Root node pointer. Will be null for an empty tree. 
  public Node root; 
 
  /* 
   --Node-- 
   The binary tree is built using this nested node class. 
   Each node stores one data element, and has left and right 
   sub-tree pointer which may be null. 
   The node is a "dumb" nested class -- we just use it for 
   storage; it does not have any methods. 
  */ 
  private static class Node { 
    Node left; 
    Node right; 
    int data;

    Node(int newData) { 
      left = null; 
      right = null; 
      this.data = newData; 
    } 
  }

  /** 
   Creates an empty binary tree -- a null root pointer. 
  */ 
  public void BinaryTree() { 
    root = null; 
  } 
  
  public void BinaryTree(Node root) { 
    this.root = root; 
  }
 

  /** 
   Returns true if the given target is in the binary tree. 
   Uses a recursive helper. 
  */ 
  public boolean lookup(int data) { 
    return(lookup(root, data)); 
  } 
 

  /** 
   Recursive lookup  -- given a node, recur 
   down searching for the given data. 
  */ 
  private boolean lookup(Node node, int data) { 
    if (node==null) { 
      return(false); 
    }

    if (data==node.data) { 
      return(true); 
    } 
    else if (data<node.data) { 
      return(lookup(node.left, data)); 
    } 
    else { 
      return(lookup(node.right, data)); 
    } 
  } 
 

  /** 
   Inserts the given data into the binary tree. 
   Uses a recursive helper. 
  */ 
  public void insert(int data) { 
    root = insert(root, data); 
  } 
 

  /** 
   Recursive insert -- given a node pointer, recur down and 
   insert the given data into the tree. Returns the new 
   node pointer (the standard way to communicate 
   a changed pointer back to the caller). 
  */ 
  private Node insert(Node node, int data) { 
    if (node==null) { 
      node = new Node(data); 
    } 
    else { 
      if (data <= node.data) { 
        node.left = insert(node.left, data); 
      } 
      else { 
        node.right = insert(node.right, data); 
      } 
    }

    return(node); // in any case, return the new pointer to the caller 
  } 
  
  public void build123(){

//        root = new Node(2);
//
//        Node Child1 = new Node(1);
//        Node Child2 = new Node(3);
//        
//        root.left = Child1;
//        root.right = Child1;
    
        
        root = new Node(8);
        root.left = new Node(4);
        root.right = new Node(12);

        root = insert(root, 1);
        root = insert(root, 2);
        root = insert(root, 6);
        root = insert(root, 7);
    }

        
    public int size(){
        return (size(root));
    }

    public int size(Node node){
        if (node == null) return 0;
        else {
            return (size(node.right) + 1 + size(node.left));
        }
    }
    
    public void visit(Node node){
        System.out.println(node.data + " ");
    }
    
    public void preOrder(Node root){
        if (root == null) return;
        visit(root);
        preOrder(root.left);
        preOrder(root.right);
    }
    
    Queue<Node> queue = new LinkedList<BinaryTree.Node>() ;
    public void breadthSearch(Node root) {
        if (root == null)
            return;
        queue.clear();
        queue.add(root);
        while(!queue.isEmpty()){
            Node node = queue.remove();
            System.out.print(node.data + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }

    }
    
}
