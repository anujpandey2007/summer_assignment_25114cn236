package week_5.day_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class code_98 {
    public static char[] commonCharacter(String str1 ,String str2){
        HashSet<Character> result = new HashSet<>();
        String smallestString = (str1.length()<str2.length())?str1:str2;
        String largestString = (str1.length()>str2.length())?str1:str2;


        for (int i = 0; i <largestString.length(); i++) {
            char temp = largestString.charAt(i);
            if(smallestString.contains(String.valueOf(temp))){
                result.add(temp);
            }

        }
        char[] commonChars = new char[result.size()];
        int index = 0;
        for (char c : result) {
            commonChars[index++] = c;
        }

        return commonChars;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter 1st string--> ");
        String str1 = input.next();
        System.out.print("enter 2nd string--> ");
        String str2 = input.next();
        System.out.println("common characters from String 1 and String 2 are"+ Arrays.toString(commonCharacter(str1,str2)));
    }

}
