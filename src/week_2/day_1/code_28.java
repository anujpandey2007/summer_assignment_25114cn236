package week_2.day_1;

import java.util.Scanner;

public class code_28 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int result = reverse(num);
        System.out.println("reversed number-->" + result);
    }
        private static int reverseRecursive(int number, int reversed) {
            if (number == 0) {
                return reversed;
            }
            int lastDigit = number % 10;
            reversed = (reversed * 10) + lastDigit;
            return reverseRecursive(number / 10, reversed);
        }
        public static int reverse(int number) {
            boolean isNegative = number < 0;
            if (isNegative) {
                number = -number;
            }

            int result = reverseRecursive(number, 0);

            return isNegative ? -result : result;
        }

}
