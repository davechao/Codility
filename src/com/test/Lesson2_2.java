package com.test;

public class Lesson2_2 {

    /*
     *  OddOccurrencesInArray
     *  Find value that occurs in odd number of elements.
     */
    public static void main(String[] args) {
        int[] A = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int result = 0;
        for (int number : A) {
            result ^= number;
        }
        return result;
    }

}
