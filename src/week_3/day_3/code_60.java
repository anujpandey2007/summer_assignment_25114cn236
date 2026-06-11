package week_3.day_3;

import java.util.Scanner;

public class code_60 {
    public static int[] zeroesAtEnd(int[] arr) {
        //initial position of non zero element
        int insertPos = 0;

        //all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPos] = arr[i];
                //initial position of non xer get updated as new non zero found
                insertPos++;
            }
        }
        // Filling the array with zeroes
        while (insertPos < arr.length) {
            arr[insertPos] = 0;
            insertPos++;
        }

        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + " element of array--->");
            arr[i] = input.nextInt();
        }
        arr = zeroesAtEnd(arr);

        System.out.print("array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");

        input.close();
    }
}