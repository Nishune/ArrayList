package dev.lpa.dev.lpa;

public class MobileMain {

    public static void main(String[] args) {


        MobilePhone phone = new MobilePhone("0730405060");

        Contact bob = Contact.createContact("Bob", "31416926");
        Contact alice = Contact.createContact("Alice", "16180339");
        Contact tom = Contact.createContact("Tom", "11235813");
        Contact jane = Contact.createContact("Jane", "23571113");

        phone.addNewContact(bob);
        phone.addNewContact(alice);
        phone.addNewContact(jane);
        phone.addNewContact(tom);

        phone.printContacts();
        System.out.println("-".repeat(20));
        phone.removeContact(tom);
        phone.printContacts();
        phone.addNewContact(tom);
        System.out.println("-".repeat(20));
        phone.printContacts();
        System.out.println("-".repeat(20));


        System.out.println(phone.queryContact("Alice"));




    }
}
