package Algorithms;

public class PatternPrinter {

    public static void main(String[] args) {
        printPattern();

    }

    public static void printPattern() {
        String arr = "1234";
        for(int i=0; i < 4; i++) {
            System.out.println(arr.charAt(i) + arr.substring(i+1, arr.length()) + arr.substring(0, i));
            }

        }
    }
