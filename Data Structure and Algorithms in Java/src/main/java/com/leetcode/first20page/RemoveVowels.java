package com.leetcode.first20page;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveVowels {

    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeVowels(s));
    }


    public static String removeVowels(String s) {
        Set<Character> set = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        StringBuilder builder = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                builder.append(arr[i]);
            }
        }
        return String.valueOf(builder);
    }
}
