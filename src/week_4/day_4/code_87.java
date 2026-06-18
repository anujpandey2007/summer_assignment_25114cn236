package week_4.day_4;

import java.util.Scanner;
import java.lang.Character;

public class code_87 {
    public static int stringFreq(String str , int target ){
        char[] array = str.toCharArray();
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(target == array[i]){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter string : ");
        String str = input.nextLine();
        System.out.print("enter target character--> ");
        char target = input.next().charAt(0);
        System.out.println("charater "+"'"+target +"'"+ " occurs " + stringFreq(str, target) + " times in entered string");
    }
}
