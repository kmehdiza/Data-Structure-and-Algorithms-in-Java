package com.leetcode.first20page;

public class DefagingIpAddress {

    public static void main(String[] args) {
        String address = "1.1.1.1";
        System.out.println(defangIPAddress(address));
    }


    public static String defangIPAddress(String address){
        char[] arr = address.toCharArray();
        StringBuilder builder = new StringBuilder();
        for(char letter:arr){
            if(letter == '.'){
                builder.append("[.]");
            }else {
                builder.append(letter);
            }
        }

        return String.valueOf(builder);
    }
}
