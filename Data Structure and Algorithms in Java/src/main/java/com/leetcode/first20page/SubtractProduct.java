package com.leetcode.first20page;

import javax.swing.*;

public class SubtractProduct {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }

    public static int subtractProductAndSum(int n){
        int multiply = 1;
        int sum = 0;
        String number = String.valueOf(n);
        for(int i =0; i<number.length();i++){
            int j = Character.digit(number.charAt(i),10);
            System.out.println(j);
            multiply = multiply * j;
            sum+=j;
        }
        System.out.println(multiply);
        System.out.println(sum);
        return multiply-sum;
    }
}
