package com.leetcode.first20page;

public class FindNumbersEvenNumbers {

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        int result = findNumbers(nums);
        System.out.println(result);
    }

    public static int findNumbers(int[] nums){
        int evenNum = 0;
        for (int num:nums){
            char[] numArr = String.valueOf(num).toCharArray();
            if(numArr.length%2==0){
                evenNum++;
            }
        }
        return evenNum;
    }
}
