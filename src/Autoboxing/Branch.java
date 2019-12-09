//package Autoboxing;
//
//import java.util.ArrayList;
//
//public class Branch {
//    private String branchName;
//    private ArrayList<Customer> customers;
//
//    public Branch(String name) {
//        this.branchName = branchName;
//        this.customers = new ArrayList<Customer>();
//    }
//
//    public String getBranchName() {
//        return branchName;
//    }
//
//    public ArrayList<Customer> getCustomers() {
//        return customers;
//    }
//
//    public boolean newCustomer(String customerName, double initialAmount) {
//        if(findCustomer(customerName) == null ) {
//            System.out.println("Customer already exists");
//            return false;
//        }
//        customers.add(new Customer(customerName, initialAmount));
//        return true;
//    }
//
//    public boolean addCustomerTransactions(String customerName, double amount) {
//        Customer existingCustomer = findCustomer(customerName);
//        if(existingCustomer != null) {
//            existingCustomer.addTransactions(amount);
//            return true;
//        }
//        return false;
//    }
//
//    private Customer findCustomer(String customerName) {
//        for(int i=0; i<customers.size(); i++) {
//            Customer validCustomer = this.customers.get(i);
//            if(validCustomer.getName().equals(customerName)) {
//                return validCustomer;
//            }
//        }
//        return null;
//    }
//}
//
