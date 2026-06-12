package week_3.day_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class code_64 {

    public static int[] removeDuplicate(int[] arr ){

        HashSet<Integer> without= new HashSet<>();

        for (int val : arr){
                without.add(val);
        }

        return without.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // taking input of an array

        System.out.print("enter size of an array--> ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("enter %d element : ", i + 1);
            arr[i] = input.nextInt();
        }
        int[] result = removeDuplicate(arr);
        System.out.print("[ ");
        for (int i = 0; i < result.length; i++) {
            System.out.print( result[i] );

        }
        System.out.println("]");

    }
}
