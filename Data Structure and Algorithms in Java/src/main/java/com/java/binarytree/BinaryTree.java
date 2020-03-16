package com.java.binarytree;


import java.util.Stack;

public class BinaryTree {

    private TreeNode root;

    public class TreeNode{
        private TreeNode right;
        private TreeNode left;
        private int data;

        public TreeNode(int data){
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root --> first
        first.left = second;
        first.right = third; // second <-- first --> third 
        second.left = four;
        second.right = fifth;
    }

    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void iterativePreOrder(){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            System.out.println(temp.data);
            if (temp.right!=null){
                stack.push(temp.right);
            }
            if (temp.left!=null){
                stack.push(temp.left);
            }
        }
    }

    public void inOrder(TreeNode root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);
    }

    public void iterativeInOrder(){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode temp = root;
        while (!stack.isEmpty() || temp!=null){
            if(temp!=null){
                stack.push(temp);
                temp = temp.left;
            }else {
                temp = stack.pop();
                System.out.print(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.createBinaryTree();
        bt.preOrder(bt.root);
    }
}





/*
PreOrder Binary Tree
- Its a non-linear data structure used for storing data
- It is made up of nodes and edges without having any circle
- Each node in a tree can point to n number of nodes in a tree
- It is a way of representing hierarchical structure with a parent node called as root and many levels of additional nodes.

- Time complexity of preOrder method is O(n)
- Space complexity of preOrder method is O(n)

- Time complexity of iterativePreOrder method is O(n)
- Space complexity of iterativePreOrder method is O(n)

In Order Binary Tree traversal
- Traverse the left subtree in ln order fashion.
- Visit the root node.
- Traverse the right subtree in ln order fashion.

- Time complexity of inOrder method is O(n)
- Space complexity of inOrder method is O(n)


- Time complexity of iterativeInOrder method is O(n)
- Space complexity of iterativeInOrder method is O(n)
* */