package week_5.day_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Account {
    private String accountNumber;
    private String pin;
    private double balance;
//constructor
    public Account(String accountNumber, String pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.balance = initialBalance;
    }
    // this method will check pin is correct or not
    public boolean validatePin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    // this method is to print balance
    public double getBalance() {
        return this.balance;
    }


    // method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }


    // method to withdraw
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds.");
        } else {
            this.balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }
}

public class code_103 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // valid customers
        Map<String, Account> database = new HashMap<>();
        database.put("12345", new Account("12345", "1111", 1000.0));
        database.put("67890", new Account("67890", "2222", 500.0));

        // Authentication
        System.out.print("Enter account number: ");
        String accountNum = input.nextLine();
        //object to use account class
        Account account = database.get(accountNum);
        if (account == null) {
            System.out.println("Account not found.");
            return;
        }


        // pin safety
        int attempts = 3;
        boolean authenticated = false;
        while (attempts > 0) {
            System.out.print("Enter PIN: ");
            String pin = input.nextLine();
            if (account.validatePin(pin)) {
                authenticated = true;
                break;
            } else {
                attempts--;
                System.out.println("Incorrect PIN. Attempts left: " + attempts);
            }
        }

        if (!authenticated) {
            System.out.println("Access denied.");
            return;
        }

        // Atm's interface
        while (true) {
            System.out.println("\nOptions: 1. Balance | 2. Deposit | 3. Withdraw | 4. Exit");
            System.out.print("Select option: ");
            String choice = input.nextLine();

            if (choice.equals("1")) {
                System.out.println("Current Balance: $" + account.getBalance());
            } else if (choice.equals("2")) {
                System.out.print("Enter amount: ");
                try {
                    double amount = Double.parseDouble(input.nextLine());
                    account.deposit(amount);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format.");
                }
            } else if (choice.equals("3")) {
                System.out.print("Enter amount: ");
                try {
                    double amount = Double.parseDouble(input.nextLine());
                    account.withdraw(amount);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid number format.");
                }
            } else {
                System.out.println("Invalid option.");
            }
        }
    }
}