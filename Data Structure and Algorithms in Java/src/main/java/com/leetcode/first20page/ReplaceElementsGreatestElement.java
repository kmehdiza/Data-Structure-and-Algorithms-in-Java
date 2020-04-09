package com.leetcode.first20page;

import java.util.Arrays;

public class ReplaceElementsGreatestElement {

    public static void main(String[] args) {
        int[] arr = {17,18,5,4,6,1};
        replaceElements(arr);
    }

    public static int[] replaceElements(int[] arr){
        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for (int i = arr.length-2;i>=0;i--){
            int temp = arr[i];
            arr[i] = max;
            if(temp>max){
                max = temp;
            }
        }
        return arr;
    }
}
