package day_2;

import java.util.Scanner;

public class code_5 {
    public static void main(String[] args) {
        //sum of a digit of a number
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        int n = num;
        int sum = 0 ;
        while (num != 0){
            int rem = num%10;
            sum = sum +rem;
            num = num /10;

        }
        System.out.println("sum of digit of "+ num + " is "+ sum );
        input.close();

    }
}
