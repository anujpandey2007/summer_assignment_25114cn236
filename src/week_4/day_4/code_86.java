package week_4.day_4;

import java.util.*;
import java.lang.String;

public class code_86 {
    public static int countWords(String str ){
        // cleaning string
        str=str.trim();
        if (str.length()==0){
            return 0 ;
        }
        int count=1;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' ') {
                // count will not get update for consecutive spaces
                if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' '){
                    continue;
                }
                count++;

            }
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter string : ");
        String str = input.nextLine();
        System.out.println("number of words in given sentence is " + countWords(str));
    }
}
