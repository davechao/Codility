package com.test;

public class Lesson3_3 {

    /*
     *  TapeEquilibrium
     *  Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
     */
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int min = Integer.MAX_VALUE;
        int sumLeft = 0;
        int sumRight = 0;

        if(A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }

        for(int i=0;i<A.length;i++) {
            sumRight += A[i];
        }

        for(int p=1;p<A.length-1;p++) {
            int current = A[p-1];
            sumLeft += current;
            sumRight -= current;
            int diff = Math.abs(sumLeft-sumRight);
            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }

}
