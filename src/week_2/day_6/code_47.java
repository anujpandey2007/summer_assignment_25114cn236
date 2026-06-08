package week_2.day_6;

import java.util.Scanner;

public class code_47 {
    public static void Fibonacci(long n) {
        if (n <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        long first = 0, second = 1;
        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            // Compute the next term
            long next = first + second;
            first = second;
            second = next;
        }
        System.out.println();
    }
    public static long getFibonacciNumber(int n) {
        // Handle base cases
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        long first = 0;
        long second = 1;
        long nthNumber = 0;

        // Loop starts from 2 because the 2positions 0 and 1 are fixed
        for (int i = 2; i <= n; i++) {
            nthNumber = first + second;
            first = second;
            second = nthNumber;
        }

        return nthNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("press 1 ---  to print up to n terms");
        System.out.println("press 2 ---  to print fibonacci of number at n position");
        System.out.println("--> ");
        int choice = input.nextInt();
        if (choice ==1) {
            System.out.print("Enter the number of terms--> ");
            long terms = input.nextLong();

            Fibonacci(terms);
        }
        else if  (choice ==2) {
            System.out.print("enter position -->");
            int n = input.nextInt();
            long result = getFibonacciNumber(n);

            System.out.printf("The Fibonacci number at position %d is: %d%n", n, result);
        }
        else
            System.out.println("INVALID CHOICE");
    }
}
