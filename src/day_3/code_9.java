package day_3;

import java.util.Scanner;

public class code_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number -->");
        int num = input.nextInt();
        int count = 0;
        for (int i = 1; i <=num ; i++) {
            if (num % i == 0 ){
                count ++;
            }
        }
        if (count>2 ){
            System.out.println("enter number is not prime number");
        }else{
            System.out.println("enter number is a prime number");
        }
        input.close();
    }
}
