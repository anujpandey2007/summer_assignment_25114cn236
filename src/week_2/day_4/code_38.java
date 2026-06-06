package week_2.day_4;

import java.util.Scanner;

public class code_38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int rows = input.nextInt();

        for (int i = rows; i >= 1; i--) {
            // outer loop is for printing space
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // inner loop to print pattern
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // to change line
            System.out.println();
        }
    }
}
