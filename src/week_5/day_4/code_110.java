package week_5.day_4;

import java.util.ArrayList;
import java.util.List;

// 1. Customer Class
class Customer {
    private String name;
    private String customerId;

    //constructor
    public Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    //getters

    public String getName() {
        return name;
    }
    public String getCustomerId() {
        return customerId;
    }
}

// 2. Base Account Class (Encapsulation & Abstraction)
class Account {
    // basic parameters
    private String accountNumber;
    private double balance;
    private Customer accountHolder;

    // constructor
    public Account(String accountNumber, Customer accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public Customer getAccountHolder() {
        return accountHolder;
    }

    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + " into Account " + accountNumber);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew $" + amount + " from Account " + accountNumber);
        } else {
            System.out.println("Insufficient funds or invalid amount for withdrawal.");
        }
    }

    // banking method
    public void displayAccountInfo() {
        System.out.println("\n--- Account Information ---");
        System.out.println("Holder: " + accountHolder.getName() + " (ID: " + accountHolder.getCustomerId() + ")");
        System.out.println("Account Number: " + accountNumber);
        System.out.printf("Current Balance: $%.2f\n", balance);
    }
}

//Savings Account Class inherits Account
class SavingsAccount extends Account {
    private double interestRate;

    //constructor of saving account and account
    public SavingsAccount(String accountNumber, Customer accountHolder, double initialBalance, double interestRate) {
        super(accountNumber, accountHolder, initialBalance); // Calling parent constructor
        this.interestRate = interestRate;
    }

    //  feature for Savings Account
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.printf("Interest of $%.2f applied at a rate of %.1f%%\n", interest, (interestRate * 100));
    }

    // Overriding parent method to include interest details (Polymorphism)
    @Override
    public void displayAccountInfo() {
        super.displayAccountInfo();
        System.out.println("Account Type: Savings");
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

// 4. Main Driver Class
public class code_110 {
    public static void main(String[] args) {
        // Create customers
        Customer client1 = new Customer("Alice Smith", "CUST101");
        Customer client2 = new Customer("Bob Jones", "CUST102");

        // Create standard checking account for Alice
        Account checkingAccount = new Account("CHG9876", client1, 5000.00);

        // Create specialized savings account for Bob
        SavingsAccount savingsAccount = new SavingsAccount("SAV1234", client2, 2000.00, 0.04);

        //  Performing Operations

        // Test Alice's Checking Account
        checkingAccount.displayAccountInfo();
        checkingAccount.deposit(150.00);
        checkingAccount.withdraw(100.00);
        checkingAccount.displayAccountInfo();

        System.out.println("\n==================================");

        // Test Bob's Savings Account
        savingsAccount.displayAccountInfo();
        savingsAccount.withdraw(500.00);
        savingsAccount.applyInterest();
        savingsAccount.displayAccountInfo();
    }
}
