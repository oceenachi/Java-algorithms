package Algorithms;

import java.util.Arrays;

public class Regex {

    public static final String egTest= "This is my small example " + "string which i am going to "
            + " use for pattern matching.";


    public static void main(String[] args) {
        System.out.println(egTest.matches("\\w.*"));

        String[] splitString = (egTest.split("\\s+"));
        System.out.println(Arrays.toString(splitString));
        System.out.println(splitString.length);

        System.out.println(egTest.replaceAll("\\s+", "\t"));
    }
}
