package week_4.day_3;

import java.util.Scanner;

public class code_82 {
        public static String rev(String str) {
            // Converting the immutable String to a mutable char array
            char[] arr = str.toCharArray();
            int len = arr.length;

            // mid of string will become the stop reason
            for (int i = 0; i < len / 2; i++) {
                // swapping
                char temp = arr[i];
                arr[i] = arr[len - 1 - i];
                arr[len - 1 - i] = temp;
            }
            return new String(arr);
        }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input of string
        System.out.print("enter string : ");
        String str = input.next();
        // printing reverse of string
        System.out.println("reverse : "+ rev(str));
    }
}
