package com.test;

import java.util.Stack;

public class Lesson7_1 {

    /*
     *  Nesting
     *  Determine whether a given string of parentheses (single type) is properly nested.
     */
    public static void main(String[] args) {
        String S = "(()(())())";
        System.out.println(solution(S));
    }

    public static int solution(String S) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            switch (c) {
                case '(':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.empty()) {
                        return 0;
                    }
                    stack.pop();
                    break;
            }
        }

        return stack.empty() ? 1 : 0;
    }

}