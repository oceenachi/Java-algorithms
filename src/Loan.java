public class Loan {

    private double amount;
    private boolean payInstallment;

    public Loan( double loan, boolean payInstallment) {
        this.amount = amount;
        this.payInstallment = payInstallment;
    }

    public double getAmount() {
        return amount;
    }

    public double setAmount(double newAmount) {
        if (amount <= newAmount || newAmount <= 0) {
            System.out.println("Invalid transaction amount");
        }

            return this.amount = amount - newAmount;

    }

    public boolean isPayInstallment (){
        return this.payInstallment;
    }
}
