package com.leetcode.second20age;

public class ArmstrongNumber {
    public static void main(String[] args) {
        isArmstrong(153);
    }

    public static boolean isArmstrong(int N) {
        int len = Integer.toString(N).length();
        int sum = 0, rest = 0, temp = N;
        while (temp>0){
            rest = temp%10;
            temp/=10;
            sum+=Math.pow(rest,len);
        }
        if (sum==N){
            return true;
        }else{
            return false;
        }
    }
}
