package week_4.day_6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class code_95 {
    public static String LongestWord(String sentence) {
        // if string is empty returning  statement
        if (sentence == null || sentence.trim().isEmpty()) {
            return "No words found";
        }
        // splitting sentence and storing it in string array whenever space comes between any two character
        String[] words = sentence.split(" ");

        String longestWord = "";
        // running loop for string array
        for (String word : words) {
            // removing everything which not comes from a to z and A to Z
            String cleanWord = word.replaceAll("[^a-zA-Z]", "");

            if (cleanWord.length() > longestWord.length()) {
                longestWord = cleanWord;
            }
        }

        return longestWord;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter sentence : ");
        String sentence = input.nextLine();

        System.out.println("longest word in sentence : "+ LongestWord(sentence));

    }
}
