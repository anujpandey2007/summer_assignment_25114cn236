package week_3.day_3;

import java.util.Scanner;

public class code_59 {
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
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotateArr(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;

        // If rotate digit is more than array's length, shorten it
        k = k % n;

        // If k is 0 no rotation is needed
        if (k == 0) return arr;

        // MAIN LOGIC FOR RIGHT ROTATION:
        // 1. Reverse the first 'n - k' elements
        reverse(arr, 0, n - k - 1);

        // 2. Reverse the remaining last 'k' elements
        reverse(arr, n - k, n - 1);

        // 3. Reverse the entire array
        reverse(arr, 0, n - 1);

        return arr;
    }
}
