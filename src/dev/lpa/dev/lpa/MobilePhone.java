package dev.lpa.dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<>();
    }

    private int findContact(Contact findContact) {

        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(findContact.getName())) {
                return i;
            }
        }
        return -1;
    }

    private int findContact(String name) {
        for (int i = 0; i < myContacts.size(); i++) {
            if (myContacts.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int index =  findContact(oldContact);

        if(index >= 0) {
            myContacts.set(index, newContact);
            return true;
        }
        return false;
        }

        public boolean removeContact(Contact contact) {

        int index = findContact(contact);
        if (index < 0) {
            return false;
        }
        myContacts.remove(index);
        return true;
    }

    public Contact queryContact(String name) {
        int index = findContact(name);
        if (index >= 0) {
            return myContacts.get(index);
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact c = myContacts.get(i);

            System.out.println((i + 1) + ". " + c.getName() + " -> " + c.getPhoneNumber());
        }
    }

    }




