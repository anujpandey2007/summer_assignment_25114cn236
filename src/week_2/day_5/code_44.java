package week_2.day_5;

import java.util.Scanner;

public class code_44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num1 = input.nextInt();
        while (num1 < 0 ){
            System.out.println(num1 + " is not valid number");
            System.out.print("enter non negative number -->");
            num1 = input.nextInt();

        }
        fact(num1 );
    }

    public static void fact(int a) {
        int fact = 1;
        int num = a;
        if (num == 1 || num == 0)
            System.out.println("factorial is 1 ");
        else {
            while (a != 0) {
                fact = fact * a;
                a--;
            }
            System.out.println("factorial of " + num + " is " + fact);
        }
    }
}
