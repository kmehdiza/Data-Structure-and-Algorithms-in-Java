package com.leetcode.first20page;

import java.util.HashMap;

public class SingleRowKeyboard {

    public static void main(String[] args) {
        String keyboard = "pqrstuvwxyzabcdefghijklmno";
        String word = "leetcode";
        System.out.println(calculateTime(keyboard, word));
    }

    public static int calculateTime(String keyboard, String word) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] keyArr = keyboard.toCharArray();
        char[] wordArr = word.toCharArray();


        for (int i = 0; i < keyArr.length; i++) {
            if (!map.containsKey(keyArr[i])) {
                map.put(keyArr[i], i);
            }
        }

        int count = 0;
        int prev = 0;
        for (int i = 0; i < wordArr.length; i++) {
            int current = map.get(wordArr[i]);
            count +=Math.abs(current-prev);
            prev = current;
        }
        return count;
    }

}
