package address;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    // List to store contacts
    static ArrayList<ContactAddress> contacts = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    // Entry point of the program
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n==== ADDRESS BOOK ====");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Validate integer input
            while (!input.hasNextInt()) {
                System.out.print("Invalid input! Enter a number between 1-5: ");
                input.next();
            }
            choice = input.nextInt();
            input.nextLine(); // consume leftover newline

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> System.out.println("Exiting Address Book...");
                default -> System.out.println("Invalid choice! Please enter 1-5.");
            }

        } while (choice != 5);
    }

    // Add a new contact
    public static void addContact() {
        System.out.print("Enter name: ");
        String name = input.nextLine().trim();
        System.out.print("Enter address: ");
        String address = input.nextLine().trim();
        System.out.print("Enter phone number: ");
        String phone = input.nextLine().trim();
        System.out.print("Enter email: ");
        String email = input.nextLine().trim();

        ContactAddress c = new ContactAddress(name, address, phone, email);
        contacts.add(c);
        System.out.println("Contact added successfully!");
    }

    // View all contacts
    public static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found!");
            return;
        }

        System.out.println("\n--- All Contacts ---");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Contact " + (i + 1) + ":");
            System.out.println(contacts.get(i));
            System.out.println("--------------------");
        }
    }

    // Search for a contact by name
    public static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = input.nextLine().trim();
        boolean found = false;

        for (ContactAddress c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact details:");
                System.out.println(c);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }

    // Delete a contact by name
    public static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = input.nextLine().trim();
        boolean found = false;

        // Use iterator to safely remove while looping
        Iterator<ContactAddress> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            ContactAddress c = iterator.next();
            if (c.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                System.out.println("Contact deleted successfully!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Contact not found!");
        }
    }
}

// Class to represent each contact
class ContactAddress {
    private String name;
    private String address;
    private String phone;
    private String email;

    public ContactAddress(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public String getAddress() { return address; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }

    // Display contact nicely
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address
                + "\nPhone: " + phone + "\nEmail: " + email;
    }
}

