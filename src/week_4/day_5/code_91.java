package week_4.day_5;

import java.util.*;

public class code_91 {

    public static boolean isAnagram(String str1, String str2) {
        // Clean up spaces and convert to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // If lengths are not equal then  they will not  be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Frequency map for the first string
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        for (char ch : str1.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Reduce frequencies using the second string
        for (char ch : str2.toCharArray()) {

            // returning false if character of string 1 is not in string 2
            if (!charCountMap.containsKey(ch)) {
                return false; // Character not found in the first string
            }

            // updating hashmap by removing found character in string 2
            charCountMap.put(ch, charCountMap.get(ch) - 1);

            if (charCountMap.get(ch) == 0) {
                charCountMap.remove(ch);
            }
        }

        // if hashmap become empty it means every chaaracter in string1 is found in string 2 with same freq
        return charCountMap.isEmpty();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = input.nextLine();

        System.out.print("Enter second string: ");
        String str2 = input.nextLine();

        if (isAnagram(str1, str2)) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are NOT anagrams.");
        }

        input.close();
    }
}