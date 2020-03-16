package com.leetcode.first20page;

import java.util.HashMap;
import java.util.Map;

public class SingleRowKeyboard {

    public static void main(String[] args) {
        String keyboard = "abcdefghijklmnopqrstuvwxyz";
        String word = "cba";
        int result = calculateTime(keyboard, word);
        System.out.println(result);
    }


    public static int calculateTime(String board, String word) {
        char[] charArr = board.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < charArr.length; i++) {
            map.put(charArr[i], i);
        }
        int output= 0; int prev = 0;
        for (char letter : word.toCharArray()) {
                int temp = map.get(letter);
                output+= Math.abs(prev-temp);
                prev = temp;
        }
        return output;
    }
}
