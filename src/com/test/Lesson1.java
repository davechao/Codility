package com.test;

public class Lesson1 {

    /*
     *  BinaryGap
     *  Find longest sequence of zeros in binary representation of an integer.
     */
    public static void main(String[] args) {
        System.out.println(solution(1041));
    }

    public static int solution(int N) {
        int result = 0;
        int gapCount = 0;
        int gapEdgeCount = 0;

        String binaryString = Integer.toBinaryString(N);
        for(int i=0;i<binaryString.length();i++) {
            char element = binaryString.charAt(i);
            if(element == '1') {
                gapEdgeCount++;
                if(gapEdgeCount == 2) {
                    gapEdgeCount = 1;
                    result = gapCount > result ? gapCount : result;
                    gapCount = 0;
                }
            } else {
                gapCount++;
            }
        }
        return result;
    }

}
