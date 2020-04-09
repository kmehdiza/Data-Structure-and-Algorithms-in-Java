package com.leetcode.first20page;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {

    public static void main(String[] args) {
        int[] B = {50, 12, 32, 46, 28};
        int[] A = {12, 28, 46, 32, 50};
        int[] result = anagramMappings(A, B);
        for (int res:result){
            System.out.print(res + " -> ");
        }
    }

    public static int[] anagramMappings(int[] A, int[] B) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < B.length; i++) {
            map.put(B[i], i);
        }

        int[] result = new int[A.length];
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            result[index++] = map.get(A[i]);
        }
        return result;
    }
}
