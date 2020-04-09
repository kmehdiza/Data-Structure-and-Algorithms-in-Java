package com.leetcode.first20page;

public class ReduceNumberToZero {

    public static void main(String[] args) {
        int num = 42;
        System.out.println(numberOfSteps(num));
    }

    public static int numberOfSteps(int num) {
        int numberOfSteps = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
            }
            numberOfSteps++;
        }
        return numberOfSteps;
    }

}
