package com.leetcode.first20page;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallerNumberThanCurrent {

    public static void main(String[] args) {
        int[] nums = new int[]{8, 1, 2, 2, 3};
        int[] result = smallerNumbersThanCurrent(nums);
        for(Integer number: result){
            System.out.print(number + " ");
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] copy = nums.clone();
        Arrays.sort(copy);

        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(copy[i], i);
        }

        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            copy[i] = map.get(nums[i]);
        }
        return copy;
    }


}
