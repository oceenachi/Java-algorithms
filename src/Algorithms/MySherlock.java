package Algorithms;

import java.util.*;

public class MySherlock {
    public static void main(String[] args) {
        String s = "abcdefghhgfedecba";
        System.out.println(isValid(s));

    }

    static String isValid (String s) {
        if (s.isEmpty()) return "NO";
        if(s.length() <= 3) return "YES";
        Integer maxInt;
        int count = 0;


        HashMap<Character, Integer> charMap = new HashMap<>();
        for(char c: s.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }

        Collection<Integer> integerCollection =  charMap.values();

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        Object[] array = integerCollection.toArray();
        for(Object i : array ) {
            int x = (int) i;
            integerHashMap.put(x, integerHashMap.getOrDefault(x, 0) + 1);
        }
        int maxOccurrance = Integer.MIN_VALUE;
        int lastAvg = maxOccurrance;
        int notMaxOccurance = Integer.MAX_VALUE;
        int notMaxValue = notMaxOccurance;


        if(integerHashMap.size() == 1) return "YES";
        else if(integerHashMap.size() > 2) return "NO";
        System.out.println(integerHashMap);
        for (Map.Entry<Integer, Integer> entry: integerHashMap.entrySet()) {
            if(entry.getValue() > lastAvg) {
                maxOccurrance = entry.getKey();
                lastAvg = entry.getValue();
            }

            if( entry.getValue() < notMaxValue){
                notMaxOccurance = entry.getKey();
                notMaxValue = entry.getValue();
            }
        }

        System.out.println(maxOccurrance);
        System.out.println(lastAvg);
        System.out.println(notMaxOccurance);
        System.out.println(notMaxValue);

        if(notMaxValue != 1) return "NO";

        if(notMaxOccurance < maxOccurrance) {
            if(notMaxOccurance -1 != 0) {
                return "NO";
            }
        }
        else {

            if(notMaxOccurance - maxOccurrance != 1) return "NO";
        }


        return "YES";
    }

}
