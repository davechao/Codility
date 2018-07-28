package com.test;

import java.util.HashSet;
import java.util.Set;

public class Lesson4_2 {

    /*
     *  FrogRiverOne
     *  Find the earliest time when a frog can jump to the other side of a river.
     */
    public static void main(String[] args) {
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        System.out.println(solution(5, A));
    }

    public static int solution(int X, int[] A) {
        int result = -1;

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<A.length;i++) {
            if(A[i] <= X) {
                set.add(A[i]);
            }

            if (set.size() == X) {
                return i;
            }
        }

        return result;
    }

}
