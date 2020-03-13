package com.java.doublylinkedlist;

import java.util.NoSuchElementException;

public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public class ListNode {

        private int data;
        private ListNode previous;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }


    public void displayForward(){
        if(head == null){
            return;
        }

        ListNode temp = head;
        while (temp != null){
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward(){
        if (tail == null){
            return;
        }

        ListNode temp = tail;
        while (temp!=null){
            System.out.print(temp.data + " --> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    public void insertFirst(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            tail = newNode;
        }else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(isEmpty()){
            head = newNode;
        }else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public ListNode deleteFirst(){
        if(isEmpty()){
            throw new NoSuchElementException("");
        }

        ListNode temp = head;
        if(head == tail){
            tail = null;
        }else {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
    }

    public ListNode deleteLast(){
        if(isEmpty()){
            throw new NoSuchElementException("");
        }
        ListNode temp = tail;
        if(head== tail){
            head = null;
        }else {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        length--;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dbl = new DoublyLinkedList();
        dbl.insertFirst(1);
        dbl.insertLast(2);
        dbl.insertFirst(4);
        dbl.insertLast(10);
        dbl.displayBackward();
    }
}


/*

- Time complexity of displayForward and displayBackward is O(n)
- Space complexity of displayForward and displayBackward is O(n)

- Time complexity of insertFirst method is O(1)
- Space complexity of insertFirst method is O(1)

- Time complexity of insertLast method is O(1)
- Space complexity of insertLast method is O(1)

- Time complexity of deleteFist method is O(1)
- Space complexity of deleteFist method is O(1)

- Time complexity of deleteLast method is O(1)
- Space complexity of deleteLast method is O(1)
* */