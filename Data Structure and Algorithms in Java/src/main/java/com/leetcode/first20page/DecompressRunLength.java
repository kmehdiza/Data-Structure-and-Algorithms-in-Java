package com.leetcode.first20page;

public class DecompressRunLength {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] arr1 = new int[]{1,1,2,3};
        int[] result = decompressRunLengthList(arr1);
        for (Integer num:result){
            System.out.print(num + " ");
        }
    }

    public static int[] decompressRunLengthList(int[] nums) {

        int freq = 0;
        int value = 0;
        int index = 0;

        int cnt = 0;
        for(int i=0; i<nums.length; i+=2) {
            cnt += nums[i];
        }

        int[] res = new int[cnt];

        for (int i = 0; i < nums.length; i++) {
            freq = nums[i];
            System.out.println("freq = " +freq);
            value = nums[i + 1];
            System.out.println("value = " +value);
            int count = 0;
            while (count < freq) {
                res[index++] = value;
                count++;
            }
            i = i+1;
        }
        return res;
    }
}
