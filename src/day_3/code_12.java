package day_3;

import java.util.Scanner;

public class code_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number-->");
        int num1 = input.nextInt();
        System.out.println("enter number-->");
        int num2 = input.nextInt();
        int number1 = num1;
        int number2 = num2;
        for (int i = 1; i <= Math.min(num1,num2); i++) {
            while (num2 != 0) {
                int temp = num2;
                num2 = number1 % num2; //
                number1= temp;
            }

        }
        //num = HCF
        //LCM = num1 x num2/HCF
        int lcm = num1*number2/number1;
        System.out.println("LCM of "+ num1 +" and "+ num2 + " is " + lcm);
        input.close();
    }
}
