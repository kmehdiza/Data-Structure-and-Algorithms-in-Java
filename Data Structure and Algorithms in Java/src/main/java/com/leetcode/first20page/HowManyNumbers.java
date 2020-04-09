package com.leetcode.first20page;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HowManyNumbers {

    public static void main(String[] args) {
        int[] nums = new int[]{8,1,2,2,3};
        int[] result = smallerNumbersThanCurrent(nums);
        for (int num:result){
            System.out.print(num);
        }
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
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
            map.put(temp,count);
        }
        int[] newArr = new int[nums.length];
        for (int i =0; i<cloneArr.length;i++){
            newArr[i] = map.get(cloneArr[i]);
        }

        return newArr;
    }
}
