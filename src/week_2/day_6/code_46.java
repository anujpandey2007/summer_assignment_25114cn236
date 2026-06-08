package week_2.day_6;

import java.util.Scanner;

public class code_46 {

    public static void isArmstrong(long number) {
        // long haas been use to avoid crashing for larger number

        long originalNumber = number;
        long temporaryNumber = number;
        int DigitCount = 0;
        long sum = 0;

        // this loops Counts the number of digits = power
        while (temporaryNumber > 0) {
            DigitCount++;
            temporaryNumber /= 10;
        }

        // add the power of respective digits
        while (originalNumber > 0) {
            long lastDigit = originalNumber % 10;
            sum += (long) Math.pow(lastDigit, DigitCount);

            originalNumber /= 10;
        }
        System.out.println("armstrong of given number is : " + sum);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number--> ");
        long num = input.nextLong();
        isArmstrong(num);
    }

}

