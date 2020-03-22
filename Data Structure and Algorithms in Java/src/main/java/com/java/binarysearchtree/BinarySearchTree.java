package com.java.binarysearchtree;

public class BinarySearchTree {

    private TreeNode root;

    private class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void insert(int value) {
        root = recursiveInsert(root, value);
    }

    public TreeNode recursiveInsert(TreeNode root, int value) {
        if (root == null) {
            root = new TreeNode(value);
            return root;
        }
        if (value < root.data) {
            root.left = recursiveInsert(root.left, value);
        } else {
            root.right = recursiveInsert(root.right, value);
        }
        return root;
    }

    public void inOrder() {
        printInOrder(root);
    }

    public void printInOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        printInOrder(root.left);
        System.out.print(root.data + " -- > ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(1);

        bst.inOrder();
    }
}




/*
What is Binary Search Tree?
- It is a type of Binary Tree in which data is organized in an ordered manner which helps in faster search
and insertion of data. It satisfies following properties.
- The left subtree of a node contains only nodes with values lesser than the nodes value.
- The right subtree of a node contains only nodes with values greater than the nodes value.
- The left and right subtree each must also be a binary search tree.





* */