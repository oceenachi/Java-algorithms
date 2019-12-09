package Algorithms;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] intarr = {1, 5, 7, 6, 3, 5, 6, 2, 8, 9, 18, 19, 20, 25};
//        int[] intarr = {1,2,3,4,5};

        System.out.println(findTarget(intarr, 3));

    }

    public static int findTarget(int[] arr, int target) {
//        int index = 0;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0;
        int stop = arr.length-1;
        int mid = (start + stop)/2;

        while(start <= stop ) {
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                start = mid + 1;
            }
            else if(arr[mid] > target) {
                stop = mid -1;
            }
            mid = (start + stop)/2;
        }
        if(start > stop) {
            return -1;
        }

        System.out.println(Arrays.toString(arr));

        return mid;
    }
}
