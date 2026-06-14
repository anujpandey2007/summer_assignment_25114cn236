package week_3.day_6;

import java.util.Arrays;
import java.util.Scanner;

public class code_71 {
    // Bubble sort because binary search work for only sorte array
    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    // Binary Search Method
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents potential integer overflow

            // Check target if it is present at mid
            if (arr[mid] == target) {
                return mid; // Returns the index of the found element
            }

            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }

        // Element was not present in the array
        return -1;
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

        // Binary search requires a sorted array!
        arr1 = bubbleSort(arr1);
        System.out.println("Sorted array (required for Binary Search): " + Arrays.toString(arr1));

        System.out.print("Enter the element you want to search for: ");
        int target = input.nextInt();

        int result = binarySearch(arr1, target);

        if (result == -1) {
            System.out.println("Element " + target + " is not present in the array.");
        } else {
            System.out.println("Element " + target + " found at sorted index: " + result);
        }

        input.close();
    }
}
