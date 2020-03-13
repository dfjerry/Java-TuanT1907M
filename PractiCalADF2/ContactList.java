package PractiCalADF2;

import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact){
        contacts.add(contact);
    }

    public void findContact(String name){
        for (int i = 0; i < contacts.size(); i++) {
            Contact contact = contacts.get(i);
            if (contact.getName().equals(name)) {
                System.out.println(" Contact name: " + contact.getName() + "\n Company: " + contact.getCompany() + "\n Email: " + contact.getEmail() + "\n Phone number: " + contact.getPhoneNumber());
            } else {
                System.out.println("Contact is not found !!!");
            }
        }
    }

    public void displayContact(){
        for( int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i).toString());
        }
    }
}
