package week_3.day_1;

import java.util.Scanner;

public class code_52 {
    //  Counts the number of even elements in the array
    public static int countEven(int[] arr) {
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                // Increment counter if divisible by 2
                evenCount++;
            }
        }
        return evenCount;
    }

    // Counts the number of odd elements in the array
    public static int countOdd(int[] arr) {
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                // Increment counter if not divisible by 2
                oddCount++;
            }
        }
        return oddCount;
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
        //printing results of digit of even and odd
        System.out.println("number of even digit  in array : "+countEven(arr));
        System.out.println(" number of odd digit  in array : "+countOdd(arr));

    }
}