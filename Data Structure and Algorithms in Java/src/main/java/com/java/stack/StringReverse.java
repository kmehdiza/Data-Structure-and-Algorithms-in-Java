package com.java.stack;
import java.util.Stack;

public class StringReverse {

    public String reversStringByUsingStack(String words){
        Stack<Character> stack = new Stack();
        char[] charArr = words.toCharArray();
        for(char letter: charArr){
            stack.push(letter);
        }
        for (int i=0; i<words.length(); i++){
            charArr[i] = stack.pop();
        }
        return new String(charArr);
    }
}

/*

- Time complexity of reverse method is O(n)
- Space complexity of reverse method is O(n)

* */