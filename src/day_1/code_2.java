package day_1;

import java.util.Scanner;

public class code_2 {
    public static void main(String[] args) {
        //print table of a given number
        Scanner input = new Scanner(System.in);
        System.out.println("enter number");
        int num = input.nextInt();
        for (int i = 1; i <=10; i++) {
            int result = i*num;
            System.out.println(num + " x " + i + " = " +  result);

        }



    }
}
