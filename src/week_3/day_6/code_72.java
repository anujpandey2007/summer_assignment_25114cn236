package week_3.day_6;

import java.util.Arrays;
import java.util.Scanner;

public class code_72 {
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            // Inner loop compares adjacent elements
            // The last i elements are already sorted, so we don't need to check them
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int size1 = input.nextInt();

        int[] arr1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }

        System.out.println("Sorted array by bubble sort --> " + Arrays.toString(bubbleSort(arr1)));
        input.close();
    }
}
