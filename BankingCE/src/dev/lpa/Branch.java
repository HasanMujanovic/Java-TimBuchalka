package dev.lpa;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String nameCustomer, double initalTransaction){
        Customer check = findCustomer(nameCustomer);
        if (check != null){
            return false;
        } else {
            customers.add(new Customer(nameCustomer,initalTransaction));
            return true;
        }
    }

    public boolean addCustomerTransaction(String nameCustomer, double transaction){
        Customer check = findCustomer(nameCustomer);
        if (check != null){
           check.addTransaction(transaction);
           return true;
        } else return false;
    }
    public Customer findCustomer(String nameCustomer){
        for (Customer c : customers){
            if (c.getName().equalsIgnoreCase(nameCustomer)){
                return c;
            }
        }
        return null;

    }
}
