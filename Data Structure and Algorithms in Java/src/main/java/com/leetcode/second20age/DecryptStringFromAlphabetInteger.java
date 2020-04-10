package com.leetcode.second20age;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class DecryptStringFromAlphabetInteger {

    public static void main(String[] args) {
        String s = "10#11#12";
        String result = freqAlphabets(s);
        System.out.println(result);
    }

    public static String freqAlphabets(String s) {
        char[] ai = "abcdefghi".toCharArray();
        char[] jz = "jklmnopqrstuvwxyz".toCharArray();

        Map<String, Character> map = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        int count = 1;
        int countJz = 10;

        for (int i = 0; i < ai.length; i++) {
            map.put(String.valueOf(count++), ai[i]);
        }
        for (int i = 0; i < jz.length; i++) {
            map.put((countJz++) + "#", jz[i]);
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '#') {
                builder.append(map.get(s.substring(i - 2, i + 1)));
                i -= 2;
            } else {
                builder.append(map.get(String.valueOf(s.charAt(i))));
            }
        }
        return String.valueOf(builder);
    }
}
