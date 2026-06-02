package day_6;

import java.util.Scanner;

public class code_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int number = input.nextInt();
        System.out.println("enter postion");

        int position = input.nextInt();
        int bit = (1 << position);
        int result = number | bit;
        System.out.println("After Setting Bit of "+ position+ " to 1 result -->"+ result);
        input.close();
    }
}
