package week_2.day_5;

import java.util.Scanner;

public class code_42 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num1 = input.nextInt();
        System.out.print("-->");
        int num2 = input.nextInt();
         max(num1,num2);//calling max function by passing value num1 and num2
    }
    public static void max(int a ,int b ){
        if (a>b)// comparing two number by commparision operator
            System.out.println(a +"is greater"); // printing result
        else
            System.out.println(b + " is greater");// printing result
    }
}
