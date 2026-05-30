package day_3;

import java.util.Scanner;

public class code_10 {
    // prime number within a range
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter lower range-->");
        int num1 = input.nextInt();
        System.out.println("enter upper range-->");
        int num2 = input.nextInt();

        for (int i = num1; i <=num2 ; i++) {
            if (i <= 1) {
                continue;
            }
            boolean prime = true ;
            for (int j = 2; j < i; j++) {
                if (i % j == 0 ){
                   prime = false;
                   break;

                }
            }
            if(prime){
                System.out.println(i);
            }

        }
        input.close();
    }
}
