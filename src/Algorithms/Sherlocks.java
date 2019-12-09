//import java.util.*;
//
//public class Sherlocks {
//    public static void main(String[] args) {
////        String s = "AABBC";
//      String s = "aabbccddeefghi";
//
//        System.out.println(isValid(s));
//    }
//    static String isValid (String s) {
//        if (s.isEmpty()) return "NO";
//        if (s.length() <= 3) return "YES";
//        int leftCount = 0;
//        int rightCount = 0;
//
//        HashMap<Character, Integer> object = new HashMap <>();
//        for (char c: s.toCharArray()) {
//            object.put(c, object.getOrDefault(c, 0) + 1);
//        }
//        Collection <Integer> newValues = object.values();
//        System.out.println(newValues);
//
//        Integer[] newArray = newValues.toArray(new Integer [newValues.size()]);
//        System.out.println(newArray);
//
//        Set<Integer> set = new HashSet<>();
//        set.addAll(Arrays.asList(newArray));
//        System.out.println(set);
//
//        if(set.size() > 2) {
//            return "NO";
//        }
//        else if (set.size() == 1) {
//            return "YES";
//        }
//
//        List<Integer> mainList = new ArrayList<>();
//        mainList.addAll(set);
//
////        int value1 = mainList.get(0);
////        int value2 = mainList.get(1);
//        Integer value = Math.abs(mainList.get(0) - mainList.get(1));
//
//        if(value > 1) {
//            return "NO";
//        }
//        for (int i=0; i < newValues.size();i++) {
//            if (newArray[i] == newArray[i + 1]) {
//                leftCount += 1;
//            }
//            else {
//                rightCount += 1;
//            }
//            if(leftCount > ) {
//            return "NO";
//        }
//        }
//
//        return "YES";
//    }
//}
