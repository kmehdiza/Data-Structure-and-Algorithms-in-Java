package com.leetcode.first20page;

import java.util.HashMap;

public class ToLowerCase {

    public static void main(String[] args) {
        String result = toLowerCase("Helleo");
        System.out.println(result);
    }

    public static String toLowerCase(String str) {
        char[] upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < upper.length; i++) {
            map.put(upper[i], lower[i]);
        }
        StringBuilder builder = new StringBuilder();
        for (char letter : str.toCharArray()) {
            if(map.containsKey(letter)){
                builder.append(map.get(letter));
            }else {
                builder.append(letter);
            }
        }
        return String.valueOf(builder);
    }
}
