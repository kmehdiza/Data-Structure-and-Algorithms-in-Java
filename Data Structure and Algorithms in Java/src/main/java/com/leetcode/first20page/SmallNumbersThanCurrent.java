package com.leetcode.first20page;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SmallNumbersThanCurrent {
    public int[] smallerNumbersThanCurrents(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] cloneArr = nums.clone();
        Arrays.sort(nums);
        int temp = 0;
        for (int i = 0; i < nums.length; i++) {
            temp = nums[i];
            int count = 0;
            int j = 0;
            for (; j < nums.length; j++) {
                if (temp > nums[j]) {
                    count++;
                }
            }
            map.put(temp, count);
        }
        int[] newArr = new int[nums.length];
        for (int i = 0; i < cloneArr.length; i++) {
            newArr[i] = map.get(cloneArr[i]);
        }

        return newArr;
    }

    public int[] smallerNumbersThanCurrentSecondVersion(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] cloneArr = nums.clone();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) map.put(nums[i], i);
        }
        int[] newArr = new int[nums.length];
        for (int i = 0; i < cloneArr.length; i++) {
            newArr[i] = map.get(cloneArr[i]);
        }
        return newArr;
    }
}
