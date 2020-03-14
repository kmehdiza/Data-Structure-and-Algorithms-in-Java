package com.java.stack;


import java.util.EmptyStackException;

public class Stack {
    //instance variable
    private ListNode top;
    private int length;

    private class ListNode{

        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }

    public Stack(){
        top = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
       return length == 0;
    }

    public void push(int data){
        ListNode newNode = new ListNode(data);
        newNode.next = top;
        top = newNode;
        length++;
    }

    public int pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public int peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }

        return top.data;

    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1221);
        stack.push(10);
        stack.push(12);
        stack.push(13);

        System.out.print(stack.peek());

    }

}




/*

- It is a linear data structure used for storing the data
- Its an ordered list in which insertion and deletion are done at one end, called as top
- The last element inserted is the first one to be deleted. Hence, it is called as Last In First Out (LIFO) list.

- Time complexity of Stack methods is O(1)
- Space complexity of Stack methods is O(1)

* */