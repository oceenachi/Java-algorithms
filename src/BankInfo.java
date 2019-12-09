public class BankInfo {
    public static void main(String[] args) {
//        Hello newCustomer = new Hello("21345", "cust@g.com", "kikili", 900.998D, "6767676767" );
//        Hello newCustomer = new Hello();
//        System.out.println(newCustomer.getBalance());
//        newCustomer.deposit(688.66);
//        newCustomer.withdraw(6799.66);
//        newCustomer.setBalance(777.888);
//        System.out.println(newCustomer.getBalance());
    }

    private String accountNumber;
    private String email;
    private String customerName;
    private double balance;
    private String phoneNumber;

    public void bankInfo (String accountNumber, String email, String customerName, double balance, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.email = email;
        this.customerName = customerName;
        this.balance = balance;
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double withdraw (double amount) {
        if (amount <= balance) {
            this.balance = balance - amount;
            System.out.println("you currently have " + balance + " dollars in your account");
        }
        else {
            System.out.println("you don't have enough money for this transaction. your money is " + balance);

        }

        return balance;
    }

    public double deposit (double amount) {
        this.balance = balance + amount;
        System.out.println("you currently have " + balance + " dollars in your account");
        return balance;
    }
}

