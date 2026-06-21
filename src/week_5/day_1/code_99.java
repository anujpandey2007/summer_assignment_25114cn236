package week_5.day_1;

import java.util.Arrays;
import java.util.Scanner;

public class code_99 {
    public static String [] sortingByName(String [] name){
        Arrays.sort(name);
        return name;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of name -->");
        int num = input.nextInt();
        String [] name = new String[num];
        for (int i = 0; i < num; i++) {
            System.out.print("enter " +(i+1)+" name --> ");
            name[i]=input.next();

        }
        System.out.println(Arrays.toString(sortingByName(name)));
    }
}
