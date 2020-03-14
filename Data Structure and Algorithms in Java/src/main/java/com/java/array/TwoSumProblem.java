package com.java.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 11, 5, 10, 7, 8};
        int[] result = findSum(arr, 9);
        for (Integer num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] findSum(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return null;
        }
        int[] newArr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            int index = target - arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] == index) {
                    newArr[0] = i;
                    newArr[1] = j;
                    return newArr;
                }
            }
        }
        return null;
    }

    public int[] findSumByUsingHashMap(int[] arr, int target) {
        int[] newArr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            } else {
                newArr[0] = i;
                newArr[1] = map.get(target - arr[i]);
            }
        }
        return newArr;
    }
}

/*
- Time complexity of twoSumByUsingHashMap method is O(n)
- Space complexity of twoSumByUsingHashMap method is O(n)

* */