package com.leetcode.second20age;

public class CountSubstringsOnlyOneDistinct {

    public static void main(String[] args) {
        String s = "aaaaaaaaaa";
        countLetters(s);
    }

    public static int countLetters(String S){
        int result = 0, repeatCount = 0;
        char prevChar = S.charAt(0);
        for (int i =0; i<S.length();i++){
            char newChar = S.charAt(i);
            if (prevChar==newChar){
                repeatCount++;
            }else {
                repeatCount=1;
            }
            result +=repeatCount;
            prevChar = newChar;
        }
        return result;
    }
}
