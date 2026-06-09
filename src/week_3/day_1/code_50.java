package week_3.day_1;

import java.util.Scanner;
public class code_50 {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       // taking input of an array

       System.out.print("enter size of an array--> ");
       int size = input.nextInt();
       int[] arr = new int[size];
       for (int i = 0; i < size; i++) {
           System.out.printf("enter %d element : ",i+1);
            arr[i]  = input.nextInt();
       }


       // for sum
       int sum = 0 ;
       for (int i = 0; i < size; i++) {
           sum = sum + arr[i];

       }
       System.out.println("sum of element of array is : "+ sum);


       // for average
       int average = sum / size;

       //printing
       System.out.println(" average of element of array is : "+average);


   }

}
