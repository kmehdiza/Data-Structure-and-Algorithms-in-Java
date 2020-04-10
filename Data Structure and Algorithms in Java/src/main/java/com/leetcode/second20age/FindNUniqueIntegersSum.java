package com.leetcode.second20age;

public class FindNUniqueIntegersSum {

    public static void main(String[] args) {
        int[] result = sumZero(5);
        for (int rs:result){
            System.out.print(rs + " -> ");
        }
    }

    public static int[] sumZero(int n) {
        int[] nums = new int[n];
        int count = 0;
        int current = 1;
        if (n % 2 != 0) {
            nums[0] = 0;
            count++;
        }
        while (count<n){
            nums[count++] = current;
            nums[count++] = -current;
            current++;
        }
        return nums;
    }
}
