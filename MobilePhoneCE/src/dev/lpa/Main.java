package dev.lpa;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("062 1223426");
        Contact contact = new Contact("Hasan","0312313");
        mobilePhone.addNewContact(new Contact("Hasan","0534213"));
        mobilePhone.addNewContact(new Contact("Amin","33332213"));
        mobilePhone.addNewContact(new Contact("Amar","09999213"));
        mobilePhone.addNewContact(new Contact("Amir","123413"));

        mobilePhone.printContacts();
    }
}
