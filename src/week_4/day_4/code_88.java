package week_4.day_4;

import java.util.HashSet;
import java.util.Scanner;

public class code_88 {
    public static String removeSpace(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // If the character is NOT a space, append it to our result
            if (str.charAt(i) != ' ') {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = input.nextLine();
        System.out.println("New string without space --> "+removeSpace(str));
    }
}
