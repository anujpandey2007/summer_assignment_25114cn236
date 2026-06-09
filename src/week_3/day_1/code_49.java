package week_3.day_1;

import java.util.Scanner;

public class code_49 {
    public static int[] input(int size) {
        Scanner input = new Scanner(System.in);

        int[] arr = new int[size];
        // loop itterate at each index and takes input
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    //  Handle Printing
    public static void display(int[] arr) {
        System.out.print("[ ");
        // loop iterate at each index and print it
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
        }
        System.out.println(" ]");
    }




    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter size of an array-->");
        int size = in.nextInt();
        //storing input in arr Array by passing value size
        int[]arr = input(size);
        // calling isplay method
        display(arr);



    }
}

