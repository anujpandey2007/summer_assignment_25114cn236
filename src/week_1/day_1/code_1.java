package week_1.day_1;

import java.util.Scanner;

public class code_1 {
    public static void main(String[] args) {
        //sum of n natural number
        Scanner input = new Scanner(System.in);
        System.out.println("enter number-->");
        int num = input.nextInt();
        int sum = 0 ;
        for (int i = 0; i <=num; i++) {
             sum = sum + i ;

        }
        System.out.println("sum of " + num + "  natural number is "+ sum);
        input.close();

    }
}
