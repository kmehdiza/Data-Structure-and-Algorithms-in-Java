package com.java.circularsinglylinkedlist;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data){
            this.data = data;
        }
    }

    public CircularSinglyLinkedList(){
        last = null;
        length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void createCircularLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = four;
        four.next = first;
        last = four;
    }

    public void display(){
        if(last == null){
            return;
        }
        ListNode first = last.next;
        while (first!=last){
            System.out.print(first.data + " --> ");
            first = first.next;
        }
        System.out.print(first.data);
    }

    public void insertFirst(int data){
        ListNode newNode = new ListNode(data);
        if(last == null){
            last = newNode;
        }else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++; 

    }

    public static void main(String[] args) {

        CircularSinglyLinkedList csl = new CircularSinglyLinkedList();
        csl.insertFirst(10);
        csl.insertFirst(2);
        csl.insertFirst(3);
        csl.insertFirst(4);
        csl.display();

    }

}



/*
- It is similar to Singly Linked List, with a difference that in Circular Linked List the last node points to first node and not null
- Instead of Head, we keep track of last node in Circular Singly List

- Time Complexity of display method is O(n)
- Space complexity of display method is O(1)



* */