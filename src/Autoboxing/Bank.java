//package Autoboxing;
//
//import java.util.ArrayList;
//
//public class Bank {
//    private String name;
//    private ArrayList<Branch> branches;
//
//    public Bank (String name) {
//        this.name = name;
//        this.branches = new ArrayList<Branch>();
//    }
//
//    public boolean addBranch(String branchName) {
//        if(findBranch(branchName) == null) {
//            this.branches.add(new Branch(branchName));
//            return true;
//        }
//        return false;
//    }
//
//    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
//        Branch branch = findBranch(branchName);
//        if(branchName != null) {
//            return branch.newCustomer(customerName, initialAmount);
//        }
//        else{
//            return false;
//        }
//    }
//
//    private Branch findBranch(String branchName) {
//        for(int i=0; i< this.branches.size(); i++) {
//            Branch foundBranch = this.branches.get(i);
//            if(foundBranch.getBranchName().equals(branchName)) {
//                return foundBranch;
//            }
//        }
//        return null;
//    }
//
//    public boolean addCustomerTransaction(String branchName, String customerName, double amount) {
//      Branch branch = findBranch(branchName);
//      if(branch != null) {
//          return branch.addCustomerTransactions(customerName, amount);
//      }
//      return false;
//    }
//
//    public boolean listCustomers(String branchName, boolean showTransactions) {
//        Branch branch = findBranch(branchName);
//        if(branch !=  null) {
//            System.out.println("customers for branch " + branch.getBranchName());
//            ArrayList<Customer> branchCustomers = branch.getCustomers();
//            for(int i=0; i < branchCustomers.size(); i++) {
//                Customer branchCustomer = branchCustomers.get(i);
//                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i +1) + "]");
//                if(showTransactions) {
//                    System.out.println("Transactions");
//                    ArrayList<Double> transactions = branchCustomer.getTransactions();
//                    for(int j=0; j< transactions.size(); j++) {
//                        System.out.println("[" + (j + 1) + "] Amount" + transactions.get(j));
//
//                    }
//                }
//                else{
//                    return false;
//                }
//
//            }
//        }
//        return false;
//
//    }
//
//
//
//
//}
