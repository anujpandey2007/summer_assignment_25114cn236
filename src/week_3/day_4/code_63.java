package week_3.day_4;

import java.util.HashSet;
import java.util.Scanner;

public class code_63 {
    //Write a program to Find pair with given sum
    // time complexity O(n)
    //space coplexity O(n)

    public static void pairSumOptimized(int[] arr, int sum) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<String> printedPairs = new HashSet<>();

        for (int num : arr) {
            int complement = sum - num;
            //if compliment is present at that place then found the pair
            if (seen.contains(complement)) {
               // saving answers in string format
                int first = Math.min(num, complement);
                int second = Math.max(num, complement);
                String pairKey = first + "+" + second;

                // ignore the same input
                if (!printedPairs.contains(pairKey)) {
                    System.out.println(first + " + " + second);
                    printedPairs.add(pairKey);
                }
            }
            // adding element in seen HashSet
            seen.add(num);
        }
    }



    //Write a program to Find pair with given sum
    // time complexity is O(n2)

    public static void pairSum(int[] arr,int sum){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i]+arr[j] ==sum){
                    System.out.println(arr[i]+" + "+arr[j]);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array -->");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter "+(i+1)+" element of an array-->");
            arr[i]= input.nextInt();
        }
        System.out.print("enter target--> ");
        int target =input.nextInt();
        pairSum(arr,target);
        pairSumOptimized(arr,target);
    }
}
