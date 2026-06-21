package week_5.day_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class code_97 {
    public static int[] mergeSortedArray(int[] arr1 ,int[] arr2){
        ArrayList<Integer> result = new ArrayList<>();
        int i=0,j = 0 ;
        // adding smaller inside result
        while(i<arr1.length&&j<arr2.length) {
            if (arr1[i] > arr2[j]) {
                result.add(arr2[j]);
                j++;
            } else {
                result.add(arr1[i]);
                i++;
            }
        }
        // adding leftover if leftover is from arr1
            while (i < arr1.length) {
                result.add(arr1[i]);
                i++;
            }
        // adding leftover if leftover is from arr2

        while (j < arr2.length) {
                result.add(arr2[j]);
                j++;
            }

        return result.stream().mapToInt(Integer::intValue).toArray();

    }
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("enter size of an array 1 : ");
        int size1 = input.nextInt();

        int[] arr1 = new int[size1];
        // loop itterate at each index and takes input
        for (int i = 0; i < size1; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr1[i] = input.nextInt();
        }
        System.out.print("enter size of an array 2 : ");
        int size2 = input.nextInt();

        int[] arr2 = new int[size2];
        // loop itterate at each index and takes input
        for (int i = 0; i < size2; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr2[i] = input.nextInt();
        }
//        mergeSortedArray(arr1,arr2);
        System.out.println("merge of sorted arr1 and arr2 : " + Arrays.toString(mergeSortedArray(arr1, arr2)));

    }


}
