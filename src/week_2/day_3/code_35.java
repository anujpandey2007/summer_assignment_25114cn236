package week_2.day_3;

import java.util.Scanner;

public class code_35 {
    public static void main(String[] args) {
        //characcter triangle triangle
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num = input.nextInt();
        for (int i = 0; i<num;i++) { //run for row
            for (int j = 0; j <= i; j++) {//runs for column
                System.out.print((char) ('A'+i));// to print character TYPECAST

            }
            System.out.println();//to change line

        }
        input.close();
    }
}
