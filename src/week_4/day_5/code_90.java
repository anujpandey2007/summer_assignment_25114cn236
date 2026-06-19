package week_4.day_5;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class code_90
{
    public static char repeatingChar(String str) {
        //empty string
        if (str == null || str.isEmpty()) {
            return '\0';
        }

        //the frequency map
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // finding the first char with count 1
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                return ch;

            }
        }

        return '\0'; // Return null character if no unique char exists
    }


    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = input.nextLine();
        System.out.println("first non repeating character in entered string is " + repeatingChar(str));
        input.close();

    }

}
