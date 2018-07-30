package com.test;

public class Lesson5_1 {

    /*
     *  PassingCars
     *  Count the number of passing cars on the road.
     */
    public static void main(String[] args) {
        int[] A = {0, 1, 0, 1, 1};
        System.out.println(solution(A));
    }

    public static int solution(int[] A) {
        int countZero = 0;
        int countCars = 0;

        for(int i=0;i<A.length;i++) {
            if(A[i]==0) {
                countZero++;
            }

            if(A[i]==1 && countZero>0) {
                countCars+=countZero;
            }

            if(countCars>1000000000) {
                return  -1;
            }
        }

        return countCars;
    }

}
