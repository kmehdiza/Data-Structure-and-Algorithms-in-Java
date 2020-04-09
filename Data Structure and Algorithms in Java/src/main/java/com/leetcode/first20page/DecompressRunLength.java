package com.leetcode.first20page;

import javax.swing.tree.TreeNode;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class DecompressRunLength {
    public static void main(String[] args) {
        int[] nums = new int[]{55,11,70,26,62,64};
        int[] result =  decompressRLElist(nums);
        for(int num:result){
            System.out.print(num);
        }
    }

    public static int[] decompressRLElist(int[] nums){
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        int freq = 0;
        int val = 0;
        int countLength = 0;

        for(int i =0; i<nums.length;i+=2){
            countLength +=nums[i];
        }

        int[] newArr = new int[countLength];

        for (int i =0; i<nums.length-1;i++){
            map.put(nums[i],nums[i+1]);
            i++;
        }
        int count = 0;
        int index = 0;
       for(Map.Entry<Integer,Integer> entry:map.entrySet()){
           freq = entry.getKey();
           System.out.println(freq);
           val = entry.getValue();
           System.out.println(val);
           while (freq!=count){
               newArr[index++] = val;
               count++;
           }
           count = 0;
       }
       return newArr;
    }
}
