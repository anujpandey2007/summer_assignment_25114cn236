package week_4.day_6;

import java.util.HashMap;
import java.util.Scanner;

public class code_94 {
    public static String compresses(String str) {
        // base condition fpr empty string case
        if (str == null || str.isEmpty()) {
            return "";
        }
       String compressed = "";
        int count = 1;

        // Loop through the string starting from the second character (index 1)
        for (int i = 1; i < str.length(); i++) {
            // If the current character matches the previous one, increase the streak
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                // The streak broke! Record the previous character and its count
                compressed = compressed + str.charAt(i - 1);
                if(count>1) {
                    compressed = compressed + count;
                }
                count = 1; // Reset the counter for the new character streak
            }
        }

        // CRITICAL: Don't forget to append the very last character group after the loop ends!
        compressed= compressed + (str.charAt(str.length() - 1));
        if(count>1) {
            compressed = compressed + count;
        }

        return compressed;
    }



    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("enter string  : ");
    String str = input.next();

    System.out.println("compresses string  : "+compresses(str));

}

}
