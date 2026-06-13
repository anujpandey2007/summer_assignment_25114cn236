package week_3.day_5;

import java.util.Scanner;

public class day_65 {
     public static int [] mergeArray(int[] arr1 , int[] arr2){
         int[] merge = new int[arr1.length+ arr2.length];
         int j = 0 ;
         for (int i = 0; i < merge.length; i++) {
             if(i< arr1.length)
             merge[i] = arr1[i];
             else {

                 merge[i] = arr2[j];
                 j++;
             }
         }
         return merge;
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
         int [] result = mergeArray(arr1,arr2);
         System.out.print("[ ");
         for (int i = 0; i < result.length; i++) {
             System.out.print(result[i]+" ");

         }
         System.out.println("]");

     }
}
