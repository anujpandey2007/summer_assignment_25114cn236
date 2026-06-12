package week_3.day_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// finding a missing number
public class code_61 {
    public static int missingNumber(int[] original,int[] missing){

        int originalSum= 0 ;
        int missingSum=0;
        for (int i = 0; i < original.length; i++) {
            originalSum = originalSum+original[i];
        }
        for (int i = 0; i < missing.length; i++) {
            missingSum = missingSum+missing[i];
        }
        return  originalSum-missingSum;
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
        int[] oldarr= arr.clone();

        // to remove ranom element from an array
        int random =  new Random().nextInt(arr.length);
        System.out.println(random);
        arr[random] = 0;
        // finding random element by calling above method
        int num= missingNumber(oldarr,arr);
        System.out.println("missing element-->"+num);


    }
}
