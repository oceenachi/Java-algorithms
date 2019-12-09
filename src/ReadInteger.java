import java.util.Scanner;

public class ReadInteger {
    private static Scanner inputReader = new Scanner(System.in);
    public static void main(String[] args) {
        int [] array = readIntegers(6);
        System.out.println(findMin(array));
    }

    public static int[] readIntegers(int count) {
        int [] readArrays = new int[count];

        System.out.println("Enter your number pls: ");
//        while (inputReader.hasNext()) {
//            if(inputReader.hasNextInt()) {
//                readArrays[i] =
//            }
//        }
        for (int i=0; i < count; i++) {
            readArrays[i] = inputReader.nextInt();
            inputReader.nextLine();
        }
//        System.out.println(readArrays);
        return readArrays;
    }

    public static int findMin(int[] readArrays) {
        int minValue = Integer.MAX_VALUE;
        for(int i=0; i < readArrays.length; i++){
            if(minValue >= readArrays[i]) {
                minValue = readArrays[i];
            }
        }
        return minValue;
    }
}
