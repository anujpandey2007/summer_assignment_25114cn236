package week_2.day_1;

import java.util.Scanner;

public class code_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number-->");
        int num = input.nextInt();
        int result = factorial(num);
        System.out.println("factorial "+ result);
    }
    public static int factorial(int num){
        if (num==1){
            return 1 ;
        }
        int result = num*factorial(num-1);
        return result;
    }
}
