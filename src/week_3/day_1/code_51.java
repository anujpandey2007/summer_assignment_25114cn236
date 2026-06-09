package week_3.day_1;

import java.util.Scanner;

public class code_51 {
    public static int largest(int[] arr){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
    public static int smallest(int[] arr){
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
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
        System.out.println("smallest number in array : "+smallest(arr));
        System.out.println("largest number in array : "+largest(arr));

    }
}
