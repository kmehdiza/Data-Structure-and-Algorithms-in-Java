package com.java.singlylinkedlist;

import java.util.List;

public class SinglyLinkedList {

    private ListNode head;

    private static class ListNode {
        private int data; // Generic type
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.print("null");
    }

    public int lengthNode() {

        if (head == null) {
            return 0;
        }

        int count = 0;
        ListNode current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public boolean searchElement(ListNode head, int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public ListNode getNthNodeFromEnd(int n) {
        if (head == null) {
            return null;
        }

        if (n <= 0) {
            throw new IllegalArgumentException("Invalid value: n= " + n);
        }

        ListNode mainPoint = head;
        ListNode refPoint = head;

        int count = 0;
        while (count < n) {
            if (refPoint == null) {
                throw new IllegalArgumentException(n + " is greater than the number of nodes in list.");
            }
            refPoint = refPoint.next;
            count++;
        }

        while (refPoint != null) {
            refPoint = refPoint.next;
            mainPoint = mainPoint.next;
        }
        return mainPoint;
    }

    public void removeDuplicates() {
        if (head == null) {
            return;
        }
        ListNode current = head;
        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public ListNode insertInSortedList(int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            return newNode;
        }
        ListNode current = head;
        ListNode temp = null;
        while (current != null && current.data < newNode.data) {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public void removeNode(int key) {
        ListNode current = head;
        ListNode temp = null;

        while (current != null) {
            if (current.data != key) {
                temp = current;
                current = current.next;
            } else {
               temp.next = current.next;
               current = temp.next;
            }
        }
    }

    public void deleteNode(int key){
        ListNode current = head;
        ListNode temp = null;

        if(current !=null && current.data == key){
            head = current.next;
            return;
        }
        while (current!=null && current.data != key){
            temp = current;
            current = current.next;
        }

        if (current==null){
            return;
        }

        temp.next = current.next;
    }

    public boolean containsLoop(){
        ListNode fastNode = head;
        ListNode slowNode = head;
        while (fastNode!=null && fastNode.next!=null){
            fastNode = fastNode.next.next;
            slowNode = slowNode.next;
            if(fastNode==slowNode){
                return true;
            }
        }
        return false;
    }

    public void createALoopInLinkedList(){
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        head = first;
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = five;
        five.next = six;
        six.next = third;
    }

    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertFirst(12);
        singlyLinkedList.insertFirst(11);
        singlyLinkedList.insertFirst(122);
        singlyLinkedList.insertFirst(23);
//        singlyLinkedList.display();
//        singlyLinkedList.removeNode(1000);
//        System.out.println("");
//        singlyLinkedList.display();

        singlyLinkedList.createALoopInLinkedList();
        System.out.println(singlyLinkedList.containsLoop());


    }


}
/*
- time complexity of display method is O(n)
- space complexity is O(1)

- Time complexity of length method is O(n)
- Space complexity of length method is O(1)

- Time Complexity of insertFirst method is O(1)
- Space complexity of insertFirst method is O(1)

- Time complexity of insertLast method is O(n)
- Space complexity of insertLast method is O(1)

- Time complexity of find method is O(n)
- Space complexity of find method is O(1)

- Time complexity of reverse method is O(n)
- Space complexity of reverse method is O(1)

- Time complexity of getMiddleNode method is O(n)
- Space complexity of getMiddleNode method is O(1)

- Time complexity of getNthNodeFromEnd method is O(n)
- Space complexity of getNthNodeFromEnd method is O(1)


* */

