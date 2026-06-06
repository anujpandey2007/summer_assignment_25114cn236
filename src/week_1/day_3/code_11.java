package week_1.day_3;

import java.util.Scanner;

public class code_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number-->");
        int num1 = input.nextInt();
        System.out.println("enter number-->");
        int num2 = input.nextInt();
        for (int i = 1; i <= Math.min(num1,num2); i++) {
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2; //
                num1= temp;
            }

        }
        System.out.println(num1);
        input.close();


    }

}
