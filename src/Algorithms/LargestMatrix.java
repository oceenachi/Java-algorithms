package Algorithms;

import java.util.Arrays;
import java.util.Collections;

public class LargestMatrix {

    public static void main(String[] args) {
//       int[][] myArr = {{1, 1, 1, 1, 1},
//                        {1, 1, 1, 0,0},
//                        {1, 1, 1, 0, 0},
//                        {1, 1, 1, 0, 0},
//                        {1, 1, 1, 1, 1}};
       int[][] myArr = {{1, 1, 0, 1, 0},
                        {0, 1, 1, 1, 0},
                        {1, 1, 1, 1, 0},
                        {0, 1, 1, 1, 1}};

        System.out.println(largestMatrix(myArr));

    }

    public static int largestMatrix(int twoArr[][]) {
        int highestNumber = 0;

        for(int i=1; i<twoArr.length; i++) {
            for(int j=1; j< twoArr[0].length; j++) {
                int check = twoArr[i][j];

                Integer[] checkArr = new Integer[3];
                checkArr[0] = twoArr[i-1][j];
                checkArr[1] = twoArr[i-1][j-1];
                checkArr[2] = twoArr[i][j-1];

                int ourMin = Collections.min(Arrays.asList(checkArr));
                int toBeConsidered = ourMin + check;
                if(toBeConsidered > highestNumber) {
                    highestNumber = toBeConsidered;
                }
                twoArr[i][j] = toBeConsidered;
            }
        }
        return highestNumber;
    }
}
