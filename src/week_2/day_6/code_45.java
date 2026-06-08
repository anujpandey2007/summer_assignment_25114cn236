package week_2.day_6;

import java.util.Scanner;

public class code_45 {
    public static boolean isPalindrome(long number) {
        //negative number will return false as they are not palindrome number
        if (number < 0) {
            return false;
        }

        long originalNumber = number;
        long reversedNumber = 0;

        while (number > 0) {
            long lastDigit = number % 10;                // Extract the last digit
            reversedNumber = (reversedNumber * 10) + lastDigit; // Build the reversed number
            number = number / 10;                       // Remove the last digit from original
        }

        // If the reversed number is equal to the original number it is a palindrome
        return originalNumber == reversedNumber;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        long num = input.nextLong();
        if(isPalindrome(num))
            System.out.printf("entered number %d is palindrome ",num);
            else
            System.out.printf("entred number %d is not palindrome ",num);
    }


}
