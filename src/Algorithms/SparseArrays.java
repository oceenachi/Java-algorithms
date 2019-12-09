package Algorithms;

import java.util.*;
import java.util.stream.Stream;

public class SparseArrays {
    public static void main(String[] args) {
        String[] arr1 = {"def", "de", "fgh"};
        String[] arr2 = {"de", "lmn", "fgh"};
        matchingStrings(arr1, arr2);

    }

    static void matchingStrings(String[] strings, String[] queries) {
//        int[] result = new int[queries.length];
//         HashMap<String, Integer> collect = new HashMap<>();
//          for (int i = 0; i < strings.length; i++)
//          {
//           Integer count = collect.get(strings[i]);
//           if (count != null) {
//               collect.put(strings[i], count + 1);
//           } else {
//               collect.put(strings[i], 1);
//           }
//          }
//
//          for (int i = 0; i < queries.length; i++)
//          {
//           Integer value = collect.get(queries[i]);
//              if (value != null) {
//                  result[i] = value;
//              } else {
//                  result[i] = 0;
//              }
//          }
//
//
//            return result;


        String[] resultList = Stream.concat(Arrays.stream(queries), Arrays.stream(strings)).toArray(String[] :: new);
        System.out.println(Arrays.asList(resultList));
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<String> cresult = new ArrayList<>();

        Map<String, Integer> numFrequency= new LinkedHashMap<>();
        for(String words : resultList){
            if(Arrays.asList(queries).contains(words)) {
                numFrequency.put(words, numFrequency.getOrDefault(words, -1) + 1);
            }
        }
        for(Map.Entry<String, Integer> input: numFrequency.entrySet()) {
            result.add(input.getValue());
            cresult.add(input.getKey());
        }

        System.out.println(result);
        System.out.println(cresult);
    }
}
