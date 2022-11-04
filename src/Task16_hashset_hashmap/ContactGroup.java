package Task16_hashset_hashmap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ContactGroup {
    private Set<Contact> contacts = new HashSet<>();

    public ContactGroup() {}

    public Set<Contact> getContacts() { return this.contacts; }

    public void addContact(Contact c) {
        this.contacts.add(c);
    }

    public void printCGContacts() {
        System.out.println("contacts of group:");
        Iterator<Contact> itr = this.contacts.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
