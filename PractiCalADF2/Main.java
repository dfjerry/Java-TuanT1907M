package PractiCalADF2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ContactList contact = new ContactList();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        String name, company, email, phoneNumber;
        do {
            System.out.println("1. Add new contact.");
            System.out.println("2. Find a contact by name.");
            System.out.println("3. Display contact");
            System.out.println("4. Exit");
            System.out.println("======================");
            System.out.println("Choice your option: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter name: ");
                    name = sc.next();
                    System.out.println("Enter company: ");
                    company = sc.next();
                    System.out.println("Enter email: ");
                    email = sc.next();
                    System.out.println("Enter phone number: ");
                    phoneNumber = sc.next();
                    contact.addContact(new Contact(name, company, email, phoneNumber));
                    break;
                case 2:
                    System.out.println("Enter name: ");
                    contact.findContact(sc.next());
                    break;
                case 3:
                    contact.displayContact();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Choice wrong, pick again!!!");
                    break;
            }
        }while (choice != 4);
    }
}
