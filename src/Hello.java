////public class Hello {
////
////    public static void main(String[] args) {
//////        String tester = "AAABBBAAABBBAAABBBAABBAABBAABBAABBAABBAABB";
//////        String tester ="AABAAB";
////        String tester = "AAAA";
////        System.out.println(alternate(tester));
////    }
////
////    public static int alternate (String s) {
////        int patternLength = s.length();
////        char arr[] = s.toCharArray();
////        if (patternLength == 1) {
////            return 0;
////        }
////        StringBuilder stringBuilder = new StringBuilder();
////        stringBuilder.append(arr[0]);
////        int deleted = 1;
////        for(int i = 1; i < patternLength; i++) {
////            if(stringBuilder.charAt(0) != arr[i] ) {
////                System.out.println(stringBuilder);
////                stringBuilder.insert(0, arr[i]);
////                System.out.println(stringBuilder);
////                deleted += 1;
////            }
////
////            continue;
////        }
////        return patternLength - deleted;
////    }
////}
////
//
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.HashSet;
//import java.util.Set;
//
//public class Hello {
//    public static void main(String[] args) {
//        String s = "AABBCCD";
//        set(s);
//
//    }
//    static void set (String s) {
//        char[] chars = s.toCharArray();
//        Collection <Character> col = new char[]
//        Set<Character> set = new HashSet<>();
//        set.addAll(chars);
//        System.out.println(set);
//    }
//}
