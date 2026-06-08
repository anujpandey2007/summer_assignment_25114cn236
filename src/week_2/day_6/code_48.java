package week_2.day_6;

import java.util.Scanner;

public class code_48 {
    public static boolean isPerfectNumber(int number) {
        // Perfect numbers must be greater than 1
        if (number <= 1) {
            return false;
        }
        // 1 is a divisor for every number
        int sum = 1;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                sum += i; // Add the divisor
                // in case of square roots and cubes
                if (i * i != number) {
                    sum += (number / i);
                }
            }
        }

        // sum of proper divisors equals the original number for perfect number
        return sum == number;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number--> ");

        int num = input.nextInt();
        // function return boolean using in condition operator
        if (isPerfectNumber(num)) {
            System.out.printf("Entered number %d is a Perfect Number.%n", num);
        } else {
            System.out.printf("Entered number %d is NOT a Perfect Number.%n", num);
        }

        input.close();
    }

}
