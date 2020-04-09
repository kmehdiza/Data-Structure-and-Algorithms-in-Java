package com.java.sotingalgorithms;

public class InsertionSort {

    public static void main(String[] args) {
        int[] nums = {5, 1, 9, 2, 10};
        int[] result = insertSort(nums);
        printArr(result);
    }

    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " -> ");
        }
    }

    public static int[] insertSort(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {//unsorted part
            int temp = nums[i];
            int j = i - 1; // sorted part

            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j]; // shifting larger elements to
                j = j - 1;
            }
            nums[j + 1] = temp;
        }
        return nums;
    }
}




/*

Insertion sort:
- Insertion sort is a simple sorting algorithms that works the way we sort playing cards in our hands.
- Insertion sort we divide the given array into two parts - sorted part and unsorted part.
- From unsorted part, we take first element and place at its correct position in sorted array. This is done by shifting
all the elements which are larger than first element by one position.
- It is repeated till unsorted array is not empty




* */