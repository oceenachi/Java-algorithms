public class Student {

    private Loan loan;
    private Laptop laptop;
    private String stack;
    private String firstName;
    private String lastName;
    private int flat;
    private int age;
    private int squad;
    private String gender;

    public Student( Loan loan, Laptop laptop, String stack, String firstName, String lastName, int flat, int age, int squad, String gender) {
        this.loan = loan;
        this.laptop = laptop;
        this.stack = stack;
        this.firstName = firstName;
        this.lastName = lastName;
        this.flat = flat;
        this.age = age;
        this.squad = squad;
        this.gender = gender;
    }

    public double getLoan() {

        return loan.getAmount();
    }

    public boolean getLaptopState() {

        return laptop.isFaulty();
    }

     public String getStack() {

        return stack;
    }

    public void setStack(String stack) {

        this.stack = stack;
    }

    public String getFirstName() {

        return firstName;
    }

    public String getLastName() {

        return lastName;
    }

    public int getFlat() {

        return flat;
    }

    public void setFlat(int flat) {

        this.flat = flat;
    }

    public int getAge() {

        return age;
    }

    public int getSquad() {

        return squad;
    }

    public String getGender() {

        return gender;
    }

    public boolean payInstallments() {

        return loan.isPayInstallment();
    }
    public String getFullName () {

        return this.firstName + " " + this.lastName;
    }

    public double payLoan (Double newAmount) {
        return this.loan.setAmount(newAmount);
    }

}
