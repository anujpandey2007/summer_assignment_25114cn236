package week_5.day_5;

import java.util.Scanner;

// Base Operation Class
class Operation {
    // Methods to handle standard arithmetic
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is undefined.");
            return Double.NaN; // Returns Not-a-Number
        }
        return a / b;
    }
}

//Advanced Operation Class
class AdvancedOperation extends Operation {
    // Inherits add, subtract, multiply, divide automatically

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double num) {
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number.");
            return Double.NaN;
        }
        return Math.sqrt(num);
    }
}

// 3. Calculator UI Class (Manages user interactions and inputs)
class CalculatorUI {
    private Scanner scanner;
    private AdvancedOperation calcProcessor;

    //constructor
    public CalculatorUI() {
        this.scanner = new Scanner(System.in);
        this.calcProcessor = new AdvancedOperation(); // Composition
    }

    public void start() {
        int choice;
        do {
            System.out.println("\n===== OOP MENU CALCULATOR =====");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Power (x^y)");
            System.out.println("6. Square Root (√x)");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            choice = scanner.nextInt();
            if (choice >= 1 && choice <= 6) {
                processChoice(choice);
            } else if (choice != 7) {
                System.out.println("Invalid choice! Please select between 1 and 7.");
            }
        } while (choice != 7);

        System.out.println("Thank you for using OOP Calculator. Goodbye!");
        scanner.close();
    }

    private void processChoice(int choice) {
        double num1 = 0, num2 = 0;


        if (choice == 6) {
            System.out.print("Enter the number: ");
            num1 = scanner.nextDouble();
        } else {
            System.out.print("Enter first number: ");
            num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            num2 = scanner.nextDouble();
        }

        System.out.print("Result: ");
        switch (choice) {
            case 1: System.out.println(calcProcessor.add(num1, num2)); break;
            case 2: System.out.println(calcProcessor.subtract(num1, num2)); break;
            case 3: System.out.println(calcProcessor.multiply(num1, num2)); break;
            case 4: System.out.println(calcProcessor.divide(num1, num2)); break;
            case 5: System.out.println(calcProcessor.power(num1, num2)); break;
            case 6: System.out.println(calcProcessor.squareRoot(num1)); break;
        }
    }
}

public class code_113 {
    public static void main(String[] args) {
        // Instantiate the UI object and start the system loop
        CalculatorUI app = new CalculatorUI();
        app.start();
    }
}
