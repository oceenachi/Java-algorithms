package Algorithms;

import java.util.*;

public class LeftRotation {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(rotLeft(arr, 4)));
    }

    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int index = d % n;

        int[] resultArray = new int[n];

        for (int i = 0; i< n; i++) {
            resultArray[i] = a[(i + index)%n];
        }
        return resultArray;
    }

}
