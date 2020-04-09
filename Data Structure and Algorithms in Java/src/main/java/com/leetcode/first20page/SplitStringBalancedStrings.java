package com.leetcode.first20page;

public class SplitStringBalancedStrings {

    public static void main(String[] args) {
        String s = "RLRRLLRLRL";
        int result = balancedStringSplit(s);
        System.out.println(result);

    }

    public static int balancedStringSplit(String s) {

        char[] arr = s.toCharArray();
        int flag = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'R') {
                flag++;
            } else {
                flag--;
            }
            if (flag == 0) {
                count++;
            }
        }
        return count;
    }
}
