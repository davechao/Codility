package com.test;

import java.util.Arrays;

public class Lesson6_2 {

    /*
     *  MaxProductOfThree
     *  Maximize A[P] * A[Q] * A[R] for any triplet (P, Q, R).
     */
    public static void main(String[] args) {
        int[] A = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Arrays.sort(A);

        int max1 = A[0] * A[1] * A[A.length-1];
        int max2 = A[A.length-1] * A[A.length-2] * A[A.length-3];

        return Math.max(max1, max2);
    }

}