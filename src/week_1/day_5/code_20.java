package week_1.day_5;

import java.util.Scanner;

public class code_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();

        long originalNumber = number;
        long largestPrimeFactor = -1;

        while (number % 2 == 0) {
            largestPrimeFactor = 2;
            number /= 2;
        }
        for (long i = 3; i * i <= number; i += 2) {
            while (number % i == 0) {
                largestPrimeFactor = i;
                number /= i;
            }
        }
        if (number > 2) {
            largestPrimeFactor = number;
        }
        if (originalNumber < 2) {
            System.out.println(originalNumber + " does not have any prime factors.");
        } else {
            System.out.println("The largest prime factor of " + originalNumber + " is: " + largestPrimeFactor);
        }

        input.close();
    }
}
