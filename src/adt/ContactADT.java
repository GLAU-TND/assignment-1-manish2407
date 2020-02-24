package adt;

public interface ContactADT<E> {
    // Adding contacts
    boolean addContact(E item);
    //for viewing Contacts
    void viewContacts();
    //for Searching
    void searchInContacts(String name);
}
