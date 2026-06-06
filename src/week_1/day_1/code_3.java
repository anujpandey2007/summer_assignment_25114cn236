package week_1.day_1;

import java.util.Scanner;

public class code_3 {
    public static void main(String[] args) {
        //find factorial of a given number
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int num = input.nextInt();
        int fact = 1;

        for (int i = num; i >= 1; i--) {
             fact = fact*i;

        }
        System.out.println("factorial of "+ num + " is " + fact );
        input.close();

    }
}
