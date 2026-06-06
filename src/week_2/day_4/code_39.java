package week_2.day_4;

import java.util.Scanner;

public class code_39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows - i; j++) {  // printing space
                System.out.print(" ");
            }

            // Prints increasing numbers (from 1 up to i)
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Prints decreasing numbers (from i-1 down to 1)
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            // to change line
            System.out.println();
        }
    }
}
