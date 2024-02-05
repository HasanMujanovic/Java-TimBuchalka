package dev.lpa;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Customer> customerArrayList = new ArrayList<>(5000);


    public Bank(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", customerArrayList=" + customerArrayList +
                '}';
    }

    private Customer getCustomer(String customerName){
        for (var customer: customerArrayList){
            if (customer.name().equalsIgnoreCase(customerName)){
                return customer;
            }
        }
        System.out.printf("Customer (%s) wasnt found %n ",customerName);
        return null;
    }
    public void addNewCustomer(String customerName,double initalDeposit){
        if (getCustomer(customerName) == null){
            Customer customer = new Customer(customerName,initalDeposit);
            customerArrayList.add(customer);
            System.out.println("New customer added: " + customer);
        }
    }
    public void addTransaction(String name, double transactionAmount){
        Customer customer = getCustomer(name);
        if (customer != null){
            customer.transactions().add(transactionAmount);

        }
    }

    public void printStatement(String customerName){
        Customer customer = getCustomer(customerName);
        if (customer == null){
            return;
        }

        System.out.println("-".repeat(30));
        System.out.println("Customer name: " + customer.name());
        System.out.println("Transactions: ");
        for (double d:customer.transactions()){
            System.out.printf("$%10.2f (%s)%n",d,d<0 ? "debit":"credit");
        }
    }
}
