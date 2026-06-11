package week_3.day_3;

import java.util.Scanner;

public class code_57 {
    public static int[]  revArr(int[] arr){

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i+1)+ " element of array--->");
            arr[i]= input.nextInt();
        }
        arr = revArr(arr);
        System.out.print("Reversed array: [ ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println(" ]");

        input.close();


    }
}
