package com.java.searchalgorithms;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 2, 10, 15, 20};
        int result = search(arr, 15);
        System.out.println(result);
    }


    public static int search(int[] nums, int k) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == k) {
                return mid;
            }
            if (nums[mid] > k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}

/*
Time complexity of binarySearch method is O(log n)
Space complexity of binarySearch method is O(1)


* */