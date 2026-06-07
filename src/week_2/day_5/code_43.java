package week_2.day_5;

import java.util.Scanner;

public class code_43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num1 = input.nextInt();
        while (num1 < 1 ){
            System.out.println(num1 + " is not valid number");
            System.out.print("enter positive number-->");
            num1 = input.nextInt();
        }
        prime(num1 );
    }
    public static void prime(int a ){
        int count = 0;
        int i = 1;
        while(Math.sqrt(a)>=i){
            if (a % i==0)
            count ++ ;
            i++;
        }
        if(a ==1)
            System.out.println("1 is not prime number");
        if (count > 1 ){
            System.out.println( a + " not a prime number ");
        }else System.out.println(a + " is prime number");
    }
}
