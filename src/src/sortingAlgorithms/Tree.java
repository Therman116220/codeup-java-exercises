package sortingAlgorithms;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
// Tree's are non-linear data structures
// A collection of nodes
// Often used to represent data in a hierarchical structure.
//ROOT,PARENT,CHILD,LEAF


//Binary Trees have 2 nodes (Left node,Right node)
/*Begin with root node*/
// Balanced vs. Unbalanced Binary Tree
//INORDER(usual pick), PREORDER, POSTORDER


public class Tree {

    /*2*/
  //  Create-
    //  class
    //  variables: L & R
    //  constructor(int data)
    //  Binary Tree

private TreeNode root;

private class TreeNode {

    private TreeNode left;
    private TreeNode right;
    private int data;

    public TreeNode( int data) {
        this.data = data;
    }
}
//populating node data node by node
    public void binaryTree() {
    TreeNode first = new TreeNode(1);
    TreeNode second = new TreeNode(2);
    TreeNode third = new TreeNode(3);
    TreeNode four = new TreeNode(4);
    TreeNode five = new TreeNode(5);
    TreeNode six = new TreeNode(6);
    TreeNode seven = new TreeNode(7);

    // re-assign our node value(1) to root
    root = first;
    first.left = second;
    first.right = third;

    second.left = third;
    second.right = four;

}



    public static void main(String[] args) {

    }








    /*1*/
/*
    private int value;
    private List<Tree> child;


*/
/*Constructor*//*

    public Tree(int value) {
        this.value = value;
        this.child = new ArrayList<>();
    }
*/
/*Generated Getters adding a return of this.*//*


    public int getValue() {
        return this.value;
    }

    public List<Tree> getChild() {
        return this.child;
    }

public  Tree addChild(int value) {
        Tree newChild = new Tree(value);
        child.add(newChild);
        return newChild;
}

*/

                                                        /*Example*/


    /* int node;
    public Tree(int node) {
        this.node = node;
    }
    //Implementation: pointer to L & R nodes

   //Insert method is used to insert data into tree based on where belongs in the sort
    public void insert(int x) {
        if ( x <= node) {
            if (left == null) {
            left = new Tree(x);
        } else {
                left.insert(x);
            }
            else{
            if (right == null) {
                right = new Tree(x);

            }
            }
        }
    }*/
    /*------------------------------------------------------------------------------------------------*/
}
