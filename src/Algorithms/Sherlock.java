package Algorithms;

import java.util.*;

public class Sherlock {
    public static void main(String[] args) {
        String s = "AABBC";

        System.out.println(isValid(s));

    }

    static String isValid(String s) {
        if (s.isEmpty()) return "NO";
        if (s.length() <= 3) return "YES";
        int count = 0;
//        int crazyCount = 0;

        HashMap<Character, Integer> object = new HashMap<>();
        for ( char c : s.toCharArray ()){
            object.put (c, object.getOrDefault(c,0) + 1);

        }
        Collection <Integer> newValues = object.values();
        Integer minimumVal = Collections.min(newValues);

        for(Integer num: newValues) {
            if (num == minimumVal) {

            }
            else {
                if(num == minimumVal + 1 && count == 0) {
                    count += 1;
                }

                else {
                    return "NO";
                }
            }
        }
        return "YES";
    }
}

