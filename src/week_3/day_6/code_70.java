package week_3.day_6;

import java.util.Arrays;
import java.util.Scanner;

public class code_70 {
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        // Move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
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

        System.out.println("Sorted array by selection sort --> " + Arrays.toString(selectionSort(arr1)));
        input.close();
    }
}
