package week_2.day_5;

import java.util.Scanner;

public class code_41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num1 = input.nextInt();
        System.out.print("-->");
        int num2 = input.nextInt();
        int result = sum(num1,num2);//calling sum method and storing result
        System.out.println("sum of " + num1 + " and " + num2 + " is --> "+ result); // printing result

    }
    public static int sum(int a,int b ){
        int sum;
        return sum = a+b;//returning sum of a and b to mai function
    }
}
