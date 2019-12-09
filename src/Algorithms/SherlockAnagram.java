package Algorithms;

public class SherlockAnagram {

    public static void main(String[] args) {
        String s = "ifailuhkqq";
        anagrams(s);

    }

    public static void anagrams(String s) {

        int count = 0;
        int length = 1;
        int strLen = s.length();

        for (int i=0, j=1; j < s.length()-1; ) {
            System.out.println(s.substring(i, j));
            j++;
//            for(int k = j; k+j < s.length(); k++){
//                System.out.println(s.substring(k, j));
//            }

        }





//        for(int i=0; i<strLen; i++) {
//            for(int j=1; j<strLen-1; j++) {
//                int num = strLen-i;
//                System.out.println(s.substring(0, i));
//
//            }
//        }

//        for(int i=0; i<s.length(); i++) {
//            for(int j=0; j<s.length()-1; j++) {
//                if(s.charAt(i) == s.charAt(j)) {
//                    count += 1;
//                }
//                if(length >= s.length()) {
//                    length = 2;
//                }
//                else{
//                    j++;
//                }
//            }
//
//
//        }

    }
}
