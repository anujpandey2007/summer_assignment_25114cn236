package week_5.day_5;

import java.util.Scanner;

//  basic string operation
class StringProcessor {
    protected String text;

    // constructor
    public StringProcessor(String text) {
        this.text = text;
    }

    public String getText() { return text; }

    // Reverses the string
    public String reverse() {
        return new StringBuilder(text).reverse().toString();
    }

    // Converts the string to uppercase
    public String toUpperCase() {
        return text.toUpperCase();
    }
}

// string operation
class AdvancedStringProcessor extends StringProcessor {

    public AdvancedStringProcessor(String text) {
        super(text); // Invoke parent constructor
    }

    // Palindrome check (Case-insensitive)
    public boolean isPalindrome() {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // Vowel counting logic
    public int countVowels() {
        int count = 0;
        String lowerText = text.toLowerCase();
        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

// class which will control actions
class StringUI {
    private Scanner scanner;

    public StringUI() {
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("===== WELCOME TO THE STRING SYSTEM =====");
        System.out.print("Please enter your target string to begin: ");
        String userInput = scanner.nextLine();

        // Wrap the raw string into our OOP engine
        AdvancedStringProcessor processor = new AdvancedStringProcessor(userInput);

        int choice;
        do {
            System.out.println("\n--- CURRENT STRING: \"" + processor.getText() + "\" ---");
            System.out.println("1. Reverse String");
            System.out.println("2. Convert to Uppercase");
            System.out.println("3. Count Vowels");
            System.out.println("4. Check if Palindrome");
            System.out.println("5. Exit");
            System.out.print("Enter choice (1-5): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline leftover
            processChoice(choice, processor);

        } while (choice != 5);

        scanner.close();
    }

    private void processChoice(int choice, AdvancedStringProcessor processor) {
        switch (choice) {
            case 1:
                System.out.println("Reversed Result: " + processor.reverse());
                break;
            case 2:
                System.out.println("Uppercase Result: " + processor.toUpperCase());
                break;
            case 3:
                System.out.println("Number of Vowels: " + processor.countVowels());
                break;
            case 4:
                if (processor.isPalindrome()) {
                    System.out.println("Result: Yes! It is a palindrome.");
                } else {
                    System.out.println("Result: No, it is not a palindrome.");
                }
                break;
            case 5:
                System.out.println("Exiting String System. Goodbye!");
                break;
            default:
                System.out.println("Invalid entry! Choose an option between 1 and 5.");
        }
    }
}

public class code_115 {
    public static void main(String[] args) {
        // Instantiate the UI object and start the program
        StringUI app = new StringUI();
        app.start();
    }
}
