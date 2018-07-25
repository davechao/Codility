package com.test;

public class Lesson2 {

    /*
     *  CyclicRotation
     *  Rotate an array to the right by a given number of steps.
     */
    public static void main(String[] args) {
        int[] A = {3, 8, 9, 7, 6};
        int[] result = solution(A, 3);
        for(int data : result) {
            System.out.print(data + " ");
        }
    }


    public static int[] solution(int[] A, int K) {

        int[] result = new int[A.length];


        if(A.length == 0) {
            return result;
        }

        while (K!=0) {
            result = swap(A, A.length);
            A = result;
            K--;
        }
        return result;
    }

    static int[] swap(int[] A, int length) {
        int[] result = new int[length];
        for(int i=0;i<A.length-1;i++) {
            result[i+1] = A[i];
        }
        result[0] = A[length-1];
        return result;
    }

}
