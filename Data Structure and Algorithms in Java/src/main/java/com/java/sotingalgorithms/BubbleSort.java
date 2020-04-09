package com.java.sotingalgorithms;

public class BubbleSort {

    public static void main(String[] args) {
        int[] nums = {2,1,4,9,3};
        int[] result = sortAsc(nums);
        for(int res:result){
            System.out.print(res + " -> ");
        }
    }

    public static int[] sortAsc(int[] nums){
        boolean isSwapped;
        for (int i =0; i<nums.length-1;i++){
            isSwapped = false;
            for (int j=0; j<nums.length-1-i;j++){
                if (nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) break;
        }
        return nums;
    }
}




/*

- It is also called as Sinking sort
- While applying this sorting algorithm on unsorted array, the largest elements tends to sink at the end of the array.
- It repeatedly compares pair of adjacent elements and swap them if they are in wrong order.








* */