package com.java.searchalgorithms;

public class LinearSearch {

    public static int search(int[] arr, int n, int x) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        int result = search(arr, arr.length, 10);
        System.out.println(result);
    }
}


/*

Time complexity of search method is - O(n)
Space complexity of search method is - O(1)


* */