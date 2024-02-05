package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String nameBranch){
        Branch bCheck = findBranch(nameBranch);
        if (bCheck != null){
            return false;

        }else branches.add(new Branch(nameBranch));
        return true;
    }
    public boolean addCustomer(String nameBranch,String nameCustomer,
                               double initialTransaction){
        Branch bCheck = findBranch(nameBranch);
        if (bCheck != null){
            Customer cCheck = bCheck.findCustomer(nameCustomer);
            bCheck.newCustomer(nameCustomer,initialTransaction);
            if (cCheck != null){
                return false;
            }

        }
        return true;
    }
    public boolean addCustomerTransaction(String nameBranch, String nameCustomer,
                                          double transaction){
        Branch bCheck = findBranch(nameBranch);
        if (bCheck != null){
            Customer cCheck = bCheck.findCustomer(nameCustomer);
            if (cCheck != null){
                cCheck.addTransaction(transaction);
            } return true;
        }else  return false;
    }
    public Branch findBranch(String nameBranch){
        for (Branch b : branches){
            if (b.getName() == nameBranch){
                return b;
            }
        }
         return null;
    }
    public void nesto(){
        System.out.printf("radil");
    }
    public boolean listCustomers(String nameBranch, boolean printTransaction){
        Branch bCheck = findBranch(nameBranch);
        if (bCheck != null){
            if (printTransaction){
                int i = 0;
                int nesto = 1;
                for (Branch b : branches){
                    System.out.println("Customer details for branch "+
                            b.getName());
                    for (Customer c: b.getCustomers()){
                        System.out.printf("""
                                Customer: %s[%d]
                                Transactions
                                """,c.getName(),i);
                        i++;
                        nesto = 1;
                        for (Double d: c.getTransactions()){
                            System.out.printf("""
                                    [%d] Amount %.2f
                                    """, nesto,d);

                            nesto++;
                        }
                    }
                }

            } else {
                int i = 0;
                for (Branch b : branches) {
                    for (Customer c : b.getCustomers()) {
                        System.out.printf("""
                                Customer details for branch %s
                                Customer: %s[%d]
                                """, b.getName(), c.getName(), i);

                        i++;
                    }
                }

            }
            return true;

        }

        return false;
    }
}
