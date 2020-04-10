package com.leetcode.second20age;

public class GenerateStringWithCharactersHaveOddCounts {

    public static void main(String[] args) {
        generateTheString(3);
    }

    public static String generateTheString(int n) {
        String generate = "";
        if (n % 2 == 1) {
            generate += 'a';
            n--;
        }
        while (n > 1) {
            generate += 'c';
            n--;
        }
        if (n != 0)
            generate += 'b';
        return generate;
    }
}
