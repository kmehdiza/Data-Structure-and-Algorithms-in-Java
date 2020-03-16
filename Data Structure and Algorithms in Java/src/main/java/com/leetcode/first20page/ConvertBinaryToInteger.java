package com.leetcode.first20page;

public class ConvertBinaryToInteger {

    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
        }
    }
    public static int getDecimalValue(ListNode head){
        int number = 0;
        while (head!=null){
            number = (number*2) + head.data;
            head = head.next;
        }
        return number;
    }

}
