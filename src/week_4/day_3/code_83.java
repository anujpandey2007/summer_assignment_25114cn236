package week_4.day_3;

import java.util.Locale;
import java.util.Scanner;

public class code_83 {
    public static  void vowel(String str){
//        char[] arr = str.toCharArray();
//        int len = arr.length;
       str = str.toLowerCase(Locale.ROOT);
        int count =0 ;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a'||str.charAt(i) == 'e' ||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u' ){
                count++;

            }
        }
        System.out.println("given string contain "+ count + " vowel character ");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input of string
        System.out.print("enter string : ");
        String str = input.next();
        vowel(str);
    }
}
