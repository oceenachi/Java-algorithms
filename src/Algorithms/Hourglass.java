package Algorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Hourglass {

    public static void main(String[] args) {
        int [][] array = {{1, 1, 1, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {1, 1, 1, 0, 0, 0}, {0, 0, 2, 4, 4, 0}, {0, 0, 0, 2, 0, 0}, {0, 0, 1, 2, 4, 0}};
        System.out.println(hourglassSum(array));
    }
    static int hourglassSum(int[][] arr) {
        int counter = 0;
        int hourglass = 0;
        int[] checkArr = new int[16];

        for (int i =0; i < 4; i++) {
            for(int j=0; j < 4; j++) {
                hourglass = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                checkArr[counter] = hourglass;
                counter += 1;
            }

        }
       int result = Arrays.stream(checkArr).max().getAsInt();

        return result;
    }

}
