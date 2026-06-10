package week_3.day_2;

import java.util.Scanner;

public class code_54 {
    public static int findFrequency(int[] arr, int target) {
        // counting repetion
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                // count increase by one if  target found
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array : ");
        int size = input.nextInt();
        int [] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter "+ (i + 1 )+" element : ");
            arr[i] = input.nextInt();

        }
        System.out.print("enter target in an array");
        int target = input.nextInt();
        System.out.println( "frequency of "+ target +" is "+findFrequency(arr,target));
    }

}
