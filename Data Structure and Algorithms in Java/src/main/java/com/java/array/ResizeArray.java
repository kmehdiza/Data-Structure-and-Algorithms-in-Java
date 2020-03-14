package com.java.array;

public class ResizeArray {

    public int[] resizeArray(int[] arr, int capacity){
        int[] newArray = new int[capacity];
        for (int i =0 ; i<arr.length;i++){
            newArray[i] = arr[i];
        }
        arr = newArray;
        return arr;
    }
}
