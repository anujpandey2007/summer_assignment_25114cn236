package week_4.day_3;

import java.util.Scanner;

public class code_81 {
    public static int length (String str){
        if (str == null) {
            return 0;
        }

        int count = 0;

        // Convert to char array and iterates each character
        for (char ch : str.toCharArray()) {
            count++;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input of string
        System.out.print("enter string : ");
        String str = input.next();
        // printing length of string
        System.out.println("length of string : "+ length(str));
    }
}
