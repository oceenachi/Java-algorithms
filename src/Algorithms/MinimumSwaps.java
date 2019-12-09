//package Algorithms;
//
//import java.util.Arrays;
//import java.util.List;
//
//
//public class MinimumSwaps {
//    public static void main(String[] args) {
//        int [] myarr = { 7,1, 3, 2, 4,5,6};
//        System.out.println(minSwaps(myarr));
//    }
//    public static int minSwaps(int[] arr) {
//
//        int count = 0;
//        int temp;
//        for(int i =0; i<arr.length;i++) {
//            for (int j = i + 1; j < arr.length;) {
//                        //System.out.println(arr[j+1]);
//
//                if (arr[i] < arr[j]) {
//
//                    break;
//                }
//                if (arr[i] > arr[j]) {
//                    if (arr[j] < arr[j + 1]) {
//                        temp = arr[i];
//                        arr[i] = arr[j];
//                        arr[j] = temp;
//                        count++;
//                        i = 0;
//                        break;
//                    }
//                    if (arr[j] > arr[j + 1]) {
//                        j++;
//                    }
//                }
//
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        return count;
//    }
//}
