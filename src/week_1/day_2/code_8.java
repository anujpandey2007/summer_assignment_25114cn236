package week_1.day_2;

import java.util.Scanner;

public class code_8 {
    //rev of a number
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number -->");
        int num = input.nextInt();
        int n = num;
        int rev = 0 ;
        while(num!= 0 ){
            int rem = num % 10 ;
            rev = rev*10 + rem ;
            num = num/10 ;
        }
       if (n == rev){
           System.out.println("number is palindrome");

       }else{
           System.out.println("number is not palindrome");
       }
        input.close();
    }

}
