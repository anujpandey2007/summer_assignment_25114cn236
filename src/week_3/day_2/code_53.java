package week_3.day_2;

import java.util.Scanner;

public class code_53 {
    public static void linearSearch (int[] arr, int target ){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                System.out.println("target found at "+ i + " index ");
                break;
            }

        }
        System.out.println("target not found in the array");

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter "+ (i + 1 )+" element : ");
            arr[i] = input.nextInt();

        }
        System.out.print("enter target in an array");
        int target = input.nextInt();
        linearSearch(arr,target);
    }
}
