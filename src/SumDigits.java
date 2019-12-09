public class SumDigits {
    public static void main(String[] args) {
        sumDigits(125);

    }

    public static int sumDigits(int value) {
        int sum = 0;
        if(value >= 10) {
            while(value > 0) {
                sum += value % 10;
                value = value / 10;

            }
            System.out.println("sum equals " + sum);
            return sum;
        }

        System.out.println("Invalid value");
        return -1;

    }
}
