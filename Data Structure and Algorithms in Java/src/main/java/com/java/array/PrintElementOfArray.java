package com.java.array;

public class PrintElementOfArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,1212};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for (int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
