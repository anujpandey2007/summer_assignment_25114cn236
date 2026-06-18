package week_4.day_4;

import java.util.Scanner;

public class code_85 {
    public static void checkPalindrome(String str ){
        char[] arr = str.toCharArray();
        int len = arr.length;
        // loop will run till the half of array's length's
        for (int i = 0 ; i<len/2;i++) {
            if(arr[i] !=arr[len-i-1]){
                System.out.println("enetered string is not palindrome");
                break;
            }
            else {
                System.out.println("entered string is palindrome");
                break;
            }

        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = input.next();
        checkPalindrome(str);
    }
}
