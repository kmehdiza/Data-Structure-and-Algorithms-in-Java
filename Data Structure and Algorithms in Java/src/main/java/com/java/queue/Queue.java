package com.java.queue;

import java.util.NoSuchElementException;

public class Queue {

    private ListNode front;
    private ListNode rear;
    private int length;

    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }


    private class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode newNode = new ListNode(data);
        if (isEmpty()){
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
        length++;
    }

    public int dequeue(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        int result = front.data;
        front = front.next;
        if (front==null){
            rear= null;
        }
        length--;
        return result;
    }
    public void print(){
        if(isEmpty()){
            return;
        }
        ListNode current = front;
        while (current!=null){
            System.out.print(current.data+ " -->");
            current = current.next;
        }
        System.out.println("null");
    }

    public int first(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        return front.data;
    }
    public int last(){
        if (isEmpty()){
            throw new NoSuchElementException("Queue is already empty");
        }
        return rear.data;
    }
}




/*

- It is a linear data structure used for storing the data.
- Its an ordered list in which insertion are done at one end, called as rear and deletion are done at other end called
as front
- The first element inserted is the first one to be deleted.
- Hence, it is called as First In First Out(FIFO) list.

- Time complexity of enqueue method is O(1)
- Space complexity of enqueue method is O(1)

- Time complexity of dequeue method is O(1)
- Space complexity of dequeue method is O(1)
* */