package week_5.day_4;

import java.util.ArrayList;
import java.util.List;

// Contact Class
class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    // constructor
    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    // Getters
    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    // Polymorphic method to display contact details
    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

// 2. Business Contact Class (Inheritance & Polymorphism)
class BusinessContact extends Contact {
    private String company;
    private String jobTitle;

    public BusinessContact(String name, String phoneNumber, String email, String company, String jobTitle) {
        super(name, phoneNumber, email); // Calling the parent constructor
        this.company = company;
        this.jobTitle = jobTitle;
    }

    // Overriding the display method to include business details
    @Override
    public void displayContact() {
        super.displayContact(); // Prints name, phone, email
        System.out.println("Company: " + company);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Type: Professional/Business");
    }
}

// 3. AddressBook Class (Manages the collection of contacts)
class AddressBook {
    private List<Contact> contactList;

    public AddressBook() {
        this.contactList = new ArrayList<>();
    }

    // Add any type of Contact
    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("System: Added contact for \"" + contact.getName() + "\" successfully.");
    }

    // Search and display contact by name
    public void searchByName(String name) {
        System.out.println("\n--- Searching for: " + name + " ---");
        boolean found = false;
        for (Contact contact : contactList) {
            if (contact.getName().equalsIgnoreCase(name)) {
                contact.displayContact(); // Dynamically calls the correct displayContact() method
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Error: Contact '" + name + "' not found.");
        }
    }

    // Display all stored contacts
    public void displayAllContacts() {
        System.out.println("\n============================= ");
        System.out.println("      MY ADDRESS BOOK        ");
        System.out.println("============================= ");
        for (Contact contact : contactList) {
            contact.displayContact();
            System.out.println("-----------------------------");
        }
    }
}

// 4. Main Driver Class
public class code_112 {
    public static void main(String[] args) {
        // Initialize the AddressBook management system
        AddressBook myBook = new AddressBook();

        // 1. Create a Standard Personal Contact
        Contact friend = new Contact("Jane Doe", "555-1234", "yoyo@email.com");

        // 2. Create a Specialized Business Contact
        BusinessContact client = new BusinessContact(
                "Elon Musk",
                "555-9999",
                "elon@spacex.com",
                "SpaceX",
                "Chief Engineer"
        );

        // --- Perform Operations ---

        // Add contacts to the book
        myBook.addContact(friend);
        myBook.addContact(client);

        // Display the full directory
        myBook.displayAllContacts();

        // Test the search functionality (Demonstrates Runtime Polymorphism)
        myBook.searchByName("Elon Musk");
        myBook.searchByName("John Smith"); // Testing a missing contact
    }
}
