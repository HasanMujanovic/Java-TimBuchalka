package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }
//    public boolean addNewContact(Contact contact){
//        if (myContacts.contains(contact)){
//            return false;
//        }
//            myContacts.add(contact);
//            return true;
// moje resenje---- ne radi, see why
//    }
public boolean addNewContact(Contact contact){
    if (findContact(contact.getName()) >= 0){
        return false;
    }
    myContacts.add(contact);
    return true;

}
    public boolean updateContact(Contact contact1, Contact contact2){
        if (myContacts.contains(contact1)){
            myContacts.set(myContacts.indexOf(contact1),contact2);
            return true;
        } else return false;
    }
    public boolean removeContact(Contact contact){
        if (myContacts.contains(contact)){
            myContacts.remove(contact);
            return true;
        } else return false;
    }
    private int findContact(Contact contact){
        return myContacts.indexOf(contact);
    }
    private int findContact(String string){
        for (int i =0;i<myContacts.size();i++){
            Contact konk = myContacts.get(i);
            if (konk.getName().equals(string)){
                return i;
            }
        }
        return myContacts.indexOf(string);
    }
    public Contact queryContact(String string){
        int index = findContact(string);
        return myContacts.get(index);
    }
    public void printContacts(){
        for (int i = 0; i < myContacts.size();i++){
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}
