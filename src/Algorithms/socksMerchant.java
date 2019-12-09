package Algorithms;

import java.util.HashMap;
import java.util.Map;

public class socksMerchant {
    public static void main(String[] args) {

        int[] numbers = {3};
        findPairs(9, numbers);

    }

    public static int findPairs(int n, int[] newArray) {
        int count = 0;
        HashMap<Integer, Integer> allSocks = new HashMap<>();
        for(int num: newArray) {
            allSocks.put(num, allSocks.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: allSocks.entrySet()) {
            count+= entry.getValue()/2;

        }
        System.out.println(count);
        return count;
    }

}
