import java.util.Scanner;

public class ReadInputChallenge {
    public static void main(String[] args) {
        reader();

    }
    public static int reader () {
        int sum = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);

        while (!(count > 10) ){
            System.out.println("enter #" + count + ": ");
            int num = scanner.nextInt();
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                sum += num;
            }
            count ++;
        }

        scanner.close();;
        return sum;
    }
}
