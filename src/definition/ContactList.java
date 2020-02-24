package definition;

import adt.ContactADT;

public class ContactList<E> implements ContactADT<E> {
    @Override
    public boolean addContact(E item) {
        return false;
    }

    @Override
    public void viewContacts() {

    }

    @Override
    public void searchInContacts(String name) {

    }

    @Override
    public boolean deleteFromContacts(int index) {
        return false;
    }

    @Override
    public void printContact() {

    }
}
