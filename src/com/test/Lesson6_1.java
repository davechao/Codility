package com.test;

import java.util.HashSet;
import java.util.Set;

public class Lesson6_1 {

    /*
     *  Distinct
     *  Compute number of distinct values in an array.
     */
    public static void main(String[] args) {
        int[] A = {2, 1, 1, 2, 3, 1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        Set set = new HashSet();
        for(int i=0;i<A.length;i++) {
            set.add(A[i]);
        }
        return set.size();
    }

}
