package com.java.array;

public class StringPalindrome {

    public boolean isPalindrome(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("Input is not valid");
        }
        char[] arr = word.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            if(arr[start] != arr[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
