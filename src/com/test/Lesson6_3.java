package com.test;

import java.util.Arrays;

public class Lesson6_3 {

    /*
     *  Triangle
     *  Determine whether a triangle can be built from a given set of edges.
     */
    public static void main(String[] args) {
        int[] A = {10, 2, 5, 1, 8, 20};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int isTriangle = 0;

        Arrays.sort(A);

        if(A.length < 3) {
            return 0;
        }

        for(int i=0;i<A.length-2;i++) {
            if(A[i] > A[i+2] - A[i+1]) {
                return 1;
            }
        }

        return isTriangle;
    }

}