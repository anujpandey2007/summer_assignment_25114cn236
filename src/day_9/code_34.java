package day_9;

import java.util.Scanner;

public class code_34 {
    public static void main(String[] args) {
        //revers number triangle
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num = input.nextInt();
        for (int i = num; i > 0; i--) { // for row
            for (int j = 1; j <= i; j++) {//for column
                System.out.print(j);

            }
            System.out.println();

        }
        input.close();
    }
}
