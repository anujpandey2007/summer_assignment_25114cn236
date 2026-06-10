package week_3.day_2;

import java.util.Scanner;

public class code_55 {
    public static int largest(int[] arr){
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Case 1: Current element is strictly greater than the largest found so far
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // i th  element is between largest and second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];  // Update second largest
            }
        }

        return secondLargest;

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + " element : ");
            arr[i] = input.nextInt();

        }
        System.out.println("2nd largest element in the array : "+ largest(arr));
    }
}
