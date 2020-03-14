package com.java.array;

public class MinArray {

    public int findMinArray(int[] arr){
        if(arr == null || arr.length==0){
            throw new IllegalArgumentException("Invalid input");
        }
        int min = arr[0];
        for (int i =1; i<arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
