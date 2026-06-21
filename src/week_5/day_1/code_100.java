package week_5.day_1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class code_100 {
    public static String[] sortingByLength(String [] name){
        Arrays.sort(name, Comparator.comparingInt(String::length));
        return name;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter number of name -->");
        int num = input.nextInt();
        String [] name = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter " +(i+1)+" name --> ");
            name[i]=input.next();

        }
        System.out.println(Arrays.toString(sortingByLength(name)));    }
}
