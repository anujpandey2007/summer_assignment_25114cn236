package week_2.day_1;

import java.util.Scanner;

public class code_26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number ");
        int num = input.nextInt();
        int result = fibo(num);
        System.out.println("result "+ result);
    }
    public static int fibo(int num){
        int a = 0 ;
        int b = 1 ;
        if (num == 0 ){
            return 0;
        } else if (num == 1 ) {
            return 1 ;
        }
        int result = fibo(num-1)+ fibo(num-2);
        return result;
    }
}
