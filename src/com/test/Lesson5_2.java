package com.test;

public class Lesson5_2 {

    /*
     *  CountDiv
     *  Compute number of integers divisible by k in range [a..b].
     */
    public static void main(String[] args) {
        System.out.println(solution(6, 11, 2));
    }

    public static int solution(int A, int B, int K) {
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }

}
