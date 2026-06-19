package week_3.day_5;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class code_67 {
    public static int [] intersection(int[] arr1 ,int[] arr2){
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Put all elements of arr1 into set1
        for (int val : arr1) {
            set1.add(val);
        }

        // select which elements of arr2 are also in set1
        for (int val : arr2) {
            if (set1.contains(val)) {
                intersectionSet.add(val); // It's a match!
            }
        }
        return intersectionSet.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
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
        System.out.println("intersection of arr1 and arr2 : "+ Arrays.toString(intersection(arr1,arr2)));

    }

}
