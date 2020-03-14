package com.java.array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] result = reverseArray(arr);
        for (Integer number: result){
            System.out.print(number);
        }
    }

    public static int[] reverseArray(int[] arr) {
        if(arr==null || arr.length==0){
           throw new IllegalArgumentException("Invalid input");
        }

        int start =0;
        int end = arr.length-1;
       while (start<end){
           int temp = arr[start];
           arr[start] = arr[end];
           arr[end]= temp;
           start++;
           end--;
       }
       return arr;
    }
}

/*
- Time complexity of reverse method is O(n)
- Space complexity of reverse method is O(1)

* */