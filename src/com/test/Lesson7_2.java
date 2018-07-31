package com.test;

import java.util.Stack;

public class Lesson7_2 {

    /*
     *  Brackets
     *  Determine whether a given string of parentheses (multiple types) is properly nested.
     */
    public static void main(String[] args) {
        String S = "{[()()]}";
        System.out.println(solution(S));
    }

    public static int solution(String S) {

        Stack<Character> stack = new Stack<Character>();

        for(int i=0;i<S.length();i++) {
            char c = S.charAt(i);
            switch (c) {
                case '}':
                    if(!stack.empty() && stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return 0;
                    }
                    break;
                case ']':
                    if(!stack.empty() && stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return 0;
                    }
                    break;
                case ')':
                    if(!stack.empty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return 0;
                    }
                    break;
                default:
                    stack.push(c);
            }
        }

        return stack.empty() ? 1 : 0;
    }

}