package week_2.day_4;

import java.util.Scanner;

public class code_40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++) {
            // to print space
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // to print character os ascending order
            for (int k = 1; k <= i; k++) {
                System.out.print((char) ('A' + k - 1));
            }

            // to print character in descending order
            for (int l = i - 1; l >= 1; l--) {
                System.out.print((char) ('A' + l - 1));
            }

           //changes line
            System.out.println();
        }
    }
}
