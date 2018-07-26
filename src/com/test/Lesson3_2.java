package com.test;

import java.util.Arrays;

public class Lesson3_2 {

    /*
     *  PermMissingElem
     *  Find the missing element in a given permutation.
     */
    public static void main(String[] args) {
        int[] A = {1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int missElem = 1;

        if(A.length == 0) {
            return 1;
        }

        Arrays.sort(A);

        if(A.length == 1 && A[0] == 1) {
            return 2;
        }

        if(A[A.length - 1] == A.length) {
            return A.length + 1;
        }

        for(int i=0;i<A.length;i++) {
            if(i+1 != A[i]) {
                missElem = i+1;
                break;
            }
        }

        return missElem;
    }

}
