public class SwitchDay {
    public static void main(String[] args) {
        switchDay(7);

    }

    public static void switchDay(int num) {
        switch (num) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("invalid number");
        }

    }
}

