package week_2.day_3;

import java.util.Scanner;

public class code_36 {
    public static void main(String[] args) {
        //characcter triangle triangle
        Scanner input = new Scanner(System.in);
        System.out.print("enter number->");
        int num = input.nextInt();
        for (int i = 0; i<num;i++) {//outer loop
            for (int j = 0; j < num; j++) {//inner loop
                if(i == 0 || i == num-1 || j == 0 || j == num-1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" "); //for printing empty space between pattern
                }

            }
            System.out.println();//to break line

        }
        input.close();
    }
}
