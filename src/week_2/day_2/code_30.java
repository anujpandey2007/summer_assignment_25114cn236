package week_2.day_2;

import java.util.Scanner;

public class code_30 {
    public static void main(String[] args) {
        //half pyraid pattern
        Scanner input = new Scanner(System.in);
        System.out.print("enter number-->");
        int num = input.nextInt();
        for (int i = 0; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);

            }
            System.out.println();

        }
        input.close();
    }
}
