package com.java.array;

public class HowToResizeArray {

    public void resizeArray(int[] arr, int capacity){
        int[] newArray = new int[capacity];
        for (int i =0 ; i<arr.length;i++){
            newArray[i] = arr[i];
        }
        arr = newArray; 
    }
}
