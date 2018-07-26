package com.test;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lesson4_3 {

    /*
     *  MissingInteger
     *  Find the smallest positive integer that does not occur in a given sequence.
     */
    public static void main(String[] args) {
        int[] A = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int miss;

        Arrays.sort(A);

        Set set = new LinkedHashSet();
        for(int i=0;i<A.length;i++) {
            set.add(A[i]);
        }

        miss = set.size() + 1;

        for(int i=0;i<set.size();i++) {
            if(!set.contains(i+1)) {
                miss = i + 1;
                break;
            }
        }
        return miss;
    }

}
