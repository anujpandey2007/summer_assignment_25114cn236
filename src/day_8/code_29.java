package day_8;

import java.util.Scanner;

public class code_29 {
    public static void main(String[] args) {
        //half pyraid pattern
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
        input.close();
    }
}
