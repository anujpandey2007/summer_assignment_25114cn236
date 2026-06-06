package week_2.day_1;

import java.util.Scanner;

public class code_27 {
        public static int calculateSum(int[] numbers) {
            int sum = 0;
            for (int num : numbers) {
                sum += num;
            }
            return sum;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number of elements you want to add: ");
            int size = scanner.nextInt();

            int[] inputNumbers = new int[size];

            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                inputNumbers[i] = scanner.nextInt();
            }
            int result = calculateSum(inputNumbers);
            System.out.println("The final sum of the entered numbers is: " + result);
            scanner.close();
        }
}
