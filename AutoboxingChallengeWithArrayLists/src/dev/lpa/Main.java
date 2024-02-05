package dev.lpa;

import java.util.ArrayList;

record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double intialDeposit){
        this(name.toUpperCase(), new ArrayList<Double>(500));
        transactions.add(intialDeposit);
    }
}

public class Main {
    public static void main(String[] args) {
        Customer bob = new Customer("Bob S", 1000.0);
        System.out.println(bob);

        Bank bank = new Bank("Chase");
        bank.addNewCustomer("Jane A",500.0);
        System.out.println(bank);

        bank.addTransaction("Jane A", -10.25);
        bank.addTransaction("Jane A", -75.25);
        bank.printStatement("jane a");

        bank.addNewCustomer("hasan",25);
        bank.addTransaction("hasan",100);
        bank.printStatement("hasan");

    }
}
