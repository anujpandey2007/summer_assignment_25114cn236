package week_3.day_5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class day_66 {

    // TIME COMPLEXITY IF 0(2N)

//    public static int[] unionArray( int[] arr1 ,int[] arr2){
//        HashSet<Integer> merge = new HashSet<>();
//        for (int val : arr1){
//            merge.add(val);
//        }
//        for (int val : arr2){
//            merge.add(val);
//        }
//        return merge.stream().mapToInt(Integer::intValue).toArray();
//    }


    // TIME COMPLEXITY O(N)

public static int [] unionArray(int[] arr1 , int[] arr2){
    HashSet<Integer> merge = new HashSet<>();
    if(arr1.length==0&&arr2.length==0){
        return null;
    }

    int i = 0;
    if(i< arr1.length) {
        for (;i < arr1.length ;i++) {
                merge.add(arr1[i]);
        }
    }
//    run only after arr1 completely filled inside merge
     if (i==arr1.length){
        for (int j = 0 ; j< arr2.length;j++){
            merge.add(arr2[j]);
        }
    }
    return merge.stream().mapToInt(Integer::intValue).toArray();
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
    int [] result = unionArray(arr1,arr2);
        System.out.println(Arrays.toString(result));



}
}
