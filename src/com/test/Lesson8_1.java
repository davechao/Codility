package com.test;

import java.util.HashMap;
import java.util.Map;

public class Lesson8_1 {

    /*
     *  Dominator
     *  Find an index of an array such that its value occurs at more than half of indices in the array.
     */
    public static void main(String[] args) {
        int[] A = {3, 4, 3, 2, 3, -1, 3, 3};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {

        if(A.length == 1) {
            return 0;
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i=0;i<A.length;i++) {
            if(!map.containsKey(A[i])) {
                map.put(A[i], 1);
            } else {
                int count = map.get(A[i]);
                map.put(A[i], count + 1);
                if(count >= A.length / 2) {
                    return i;
                }
            }
        }

        return -1;
    }

}