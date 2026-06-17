package week_4.day_3;

import java.util.Scanner;

public class code_84 {
    public static void upperCase(String str){
        char[] arr = str.toCharArray();
        int len = arr.length;

        for (int i = 0; i < len; i++) {
            // Checking if the character is lowercase
            if (arr[i] >= 'a' && arr[i] <= 'z') {
                // Converting to uppercase by subtracting 32 from its ASCII value
                arr[i] = (char) (arr[i] - 32);
            }
        }

        // Print the modified character array as a string
        System.out.println("Uppercase string: " + new String(arr));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //taking input in string
        System.out.print("enter string : ");
        String str = input.nextLine(); // Using nextLine() to allow spaces in sentences

        upperCase(str);

        input.close();
    }
}