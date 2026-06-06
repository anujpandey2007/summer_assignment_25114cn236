package week_1.day_6;

import java.util.Scanner;

public class code_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter number-->");
        int num = input.nextInt();
        System.out.println("enter power");
        int pow = input.nextInt();
        int result=1;
        if(pow==0){
            result = 1;
        } else if (pow==1) {
            result=num;
        }
        for (int i = 2; i <= pow ; i++) {
            result=num*num;

        }
        System.out.println(result);
        input.close();
    }
}
