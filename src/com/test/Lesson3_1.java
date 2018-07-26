package com.test;

public class Lesson3_1 {

    /*
     *  FrogJmp
     *  Count minimal number of jumps from position X to Y.
     */
    public static void main(String[] args) {
        System.out.println(solution(10, 85,30));
    }

    public static int solution(int X, int Y, int D) {
        int distance = Math.abs(X-Y);
        
        if(distance % D == 0) {
            return distance / D;
        } else {
            return distance / D + 1;
        }
    }

}
