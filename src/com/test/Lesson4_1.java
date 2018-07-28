package com.test;

import java.util.HashSet;
import java.util.Set;

public class Lesson4_1 {

    /*
     *  PermCheck
     *  Check whether array A is a permutation.
     */
    public static void main(String[] args) {
        int[] A = {4, 1, 3, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int isPerm = 1;
        int max = 0;

        if(A.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<Integer>();
        for(int element : A) {
            set.add(element);
            max = Math.max(max, element);
        }

        if(set.size() != A.length) {
            return 0;
        }

        for(int i=0;i<max;i++) {
            if(!set.contains(i+1)) {
                isPerm = 0;
                break;
            }
        }

        return isPerm;
    }

}
