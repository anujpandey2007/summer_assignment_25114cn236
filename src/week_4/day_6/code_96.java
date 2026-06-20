package week_4.day_6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class code_96 {
    public static String duplicate (String str ){
        LinkedHashSet<Character> dup = new LinkedHashSet<>();
        String result = "";
        // replacing consecutive spaces with sing space
        str= str.trim().replaceAll("\\s+","");
//        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            if (!dup.contains(str.charAt(i))) {
                dup.add(str.charAt(i));

                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter sentence : ");
        String sentence = input.nextLine();

        System.out.println("string without duplicate characters : "+ duplicate(sentence));

    }
}
