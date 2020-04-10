package com.leetcode.first20page;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionThreeSortedArrays {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 5, 7, 9};
        int[] arr3 = {1, 3, 4, 5, 8};
        List<Integer> value = arraysIntersection(arr1, arr2, arr3);
        System.out.println(value);
    }


    public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        HashMap<Integer, Integer> map = new HashMap<>();
        addToMap(arr1, map);
        addToMap(arr2, map);
        addToMap(arr3, map);

        List<Integer> list = new ArrayList<>();
        map.entrySet().stream().forEach(e -> {
            if (e.getValue() == 3) {
                list.add(e.getKey());
            }
        });
        return list;
    }

    private static void addToMap(int[] arr, HashMap<Integer, Integer> map) {
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                map.put(arr[i], 1);
            } else {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
        }
    }
}
