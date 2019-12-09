public class Runner {

    public static void main(String[] args) {
        Student decadev = new Student(new Loan(30000000.0, true), new Laptop("HDD", "HP ENVY"), "java", "Lewis",
                "Ishiaki", 3, 23, 3, "MALE");

        System.out.println(decadev.getAge());
        System.out.println(decadev.payLoan(400000.00));
    }

}
