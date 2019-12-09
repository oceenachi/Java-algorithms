import java.util.Date;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

    }
    public static void current() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your year of birth");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt) {
            int yrOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("enter your name");
            String name = scanner.nextLine();
            int age = 2019 - yrOfBirth;

            if (age >0 && age <=100) {
                System.out.println("your name is " + name + " and you are " + age + " years old");

            }

        }


        scanner.close();
    }

}
