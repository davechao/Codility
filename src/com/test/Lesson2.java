package com.test;

public class Lesson2 {

    /*
     *  CyclicRotation
     *  Rotate an array to the right by a given number of steps.
     */
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        int[] result = solution(A, 4);
        for(int data : result) {
            System.out.println(data);
        }
    }


    public static int[] solution(int[] A, int K) {
        int[] result = new int[K];
        int count = K;
        while (count!=0) {
            result = swap(A, K);
            A = result;
            count--;
        }
        return result;
    }

    static int[] swap(int[] A, int K) {
        int[] result = new int[K];
        for(int i=0;i<A.length-1;i++) {
            result[i+1] = A[i];
        }
        result[0] = A[K-1];
        return result;
    }

}
