package day_2;

import java.util.Scanner;

public class code_7 {
    public static void main(String[] args) {
        //product of a number
        Scanner input = new Scanner(System.in);
        System.out.println("enter number -->");
        int num = input.nextInt();
        int n = num;
        int product = 1;
        if (num == 0) {
            product = 0;
        }
        else {
            while (num != 0) {
                int rem = num % 10;
                product = product * rem;
               num =  num /10;
            }

        }
        System.out.println("product of digit of  "+ n + " is " + product );
        input.close();
    }
}
