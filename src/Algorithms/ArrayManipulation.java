package Algorithms;

import java.util.Arrays;

public class ArrayManipulation {

    public static void main(String[] args) {
        int[][] queries = new int[][] {{1, 2, 100}, {2, 5, 100}, {3, 4, 100}};
        arrayManipulation(0, queries);

    }

    static long arrayManipulation(int n, int[][] queries) {

        int[] baseArray = new int[n];
        long maxValue = 0;
        long sum = 0;
        Arrays.fill(baseArray, 0);
        if(n == 0 || queries.length == 0) {
            return 0;
        }

        for(int i = 0; i < queries.length ; i++) {
            int start = queries[i][0]-1;
            int stop = queries[i][1];
            int add = queries[i][2];
            baseArray[start] += add;
            if(stop >= n) {
            }
            else{
                baseArray[stop] -= add;
            }

        }
        for(int i =0; i < n; i++) {
            sum += baseArray[i];
            if (sum >= maxValue) {
                maxValue = sum;
            }
        }
        System.out.println(maxValue);

        return maxValue;
    }
}
