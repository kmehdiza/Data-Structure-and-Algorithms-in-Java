package com.leetcode.second20age;

import java.util.*;

public class UniqueMorseCodeWords {

    public static void main(String[] args) {
        String[] words = {"gin","zen", "gig", "msg"};
        int result = uniqueMorseRepresentations(words);
        System.out.println(result);
    }

    public static int uniqueMorseRepresentations(String[] words){
        String[] encoding =
                {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        char[] lower = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character,String> map = new HashMap<>();
        for (int i =0; i<26;i++){
            map.put(lower[i],encoding[i]);
        }
        String result = "";
        List<String> list = new ArrayList<>();
        for (String word:words){
            char[] letter = word.toCharArray();
            for (char let:letter){
                result += map.get(let);
            }
            list.add(result);
            result = "";
        }
        HashSet<String> set = new HashSet<>(list);
        return set.size();
    }
}
