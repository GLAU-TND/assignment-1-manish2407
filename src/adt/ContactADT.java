package adt;

public interface ContactADT<E> {
    // Adding contacts
    boolean addContact(E item);
    //for viewing Contacts
    void viewContacts();
    //for Searching
    void searchInContacts(String name);
    //for Deleting any contact from Contact List
    boolean deleteFromContacts(int index);
    //for Printing Contacts from Contact List
     //void printContact();
}
