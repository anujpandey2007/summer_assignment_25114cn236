package week_1.day_1;

import java.util.Scanner;

public class code_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int num = input.nextInt();
        int n = num;
        int count = 0 ;
       while (num != 0 ){
           num = num / 10;
           count++;
       }
        System.out.println("number of digit in "+ n + " is "+ count);
    }
}
