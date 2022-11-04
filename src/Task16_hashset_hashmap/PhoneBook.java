package Task16_hashset_hashmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private String name;
    private Map<String, ContactGroup> contactGroupMap = new HashMap<>();
    private Set<Contact> contactList = new HashSet<>();

    // constructor
    public PhoneBook(String name) { this.name = name; }

    // getters
    public String getName() { return this.name; }
    public Map<String, ContactGroup> getContactGroupMap() { return this.contactGroupMap; }
    public Set<Contact> getContactList() { return this.contactList; }

    // add Contact Group
    public void addContactGroupToPB(String name) {
        ContactGroup cg = new ContactGroup();
        this.contactGroupMap.put(name, cg);
    }
    public void addContactToCG(String name, Contact c) {
        ContactGroup cgPicked = this.contactGroupMap.get(name);
        if (cgPicked == null) {
            System.out.println("No ContactGroup with name " + name + " found");
        } else {
            cgPicked.addContact(c);
            System.out.println("contact " + c + " added to ContactGroup " + name);
        }
    }

    public void addContactToPhoneBook(Contact c) {
        this.contactList.add(c);
    }


    // поиск контакта в группе контактов (полное совпадение полей)
    public void searchContactInGroup(String cgName, Contact c) {
        ContactGroup cgPicked = this.contactGroupMap.get(cgName);
        if (cgPicked == null) {
            System.out.println("No ContactGroup with name " + cgName + " found");
        } else {
            for (Contact cItem : cgPicked.getContacts()) {
                if (cItem.getSurname().equals(c.getSurname())
                        && cItem.getName().equals(c.getName())
                        && cItem.getAge() == c.getAge()
                        && cItem.getPhone().equals(c.getPhone())
                ) {
                    System.out.println("contact " + c + " found in group " + cgName);
                }
            }
        }
    }

    // поиск контакта по телефону
    public void searchContactByPhone(String phone) {
        for (Contact c : this.contactList) {
            if (c.getPhone().equals(phone)) {
                System.out.println("user " + c + " with phone " + phone + " found");
            }
        }
        /*this.contactList.forEach((k, v) -> {
            for (Contact cItem : v.getContacts()) {
                if (cItem.getPhone().equals(phone)) {
                    System.out.println("user " + cItem + " with phone " + phone + " found in group " + k);
                }
            }
        });*/
    }


    // print PB info
    public void printInfo() {
        System.out.println("Phonebook: " + this.name);
        System.out.println("map keys:" + this.contactGroupMap.keySet());
        for (String s : this.contactGroupMap.keySet()) {
            System.out.println("==> contact group: [" + s + "]");
            this.contactGroupMap.get(s).printCGContacts();
        }
    }
}
