package week_3.day_3;

import java.util.Scanner;

public class code_58 {
    // this methods reverse the specific part of array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    // main logic
    //using above reverse function
    public static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;

        // if rotate digit is more than array's length
        // updating it to similar rotation but with less rotation
        k = k % n;

        // If k is 0 no rotation is needed
        if (k == 0) return arr;
        // main logic
        //  Reversing the first 'k' elements
        reverse(arr, 0, k - 1);

        //  Reversing the remaining  elements
        reverse(arr, k, n - 1);

        // now by Reverse the entire array will get rotated array
        reverse(arr, 0, n - 1);
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

        System.out.print("Enter number of positions to rotate left (k): ");
        int k = input.nextInt();

        // calling method
        arr = rotateArr(arr, k);

        System.out.print("Rotated array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");

        input.close();
    }
}