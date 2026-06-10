package week_3.day_2;
import java.util.*;
public class code_56 {
    public static void duplicate(int [] arr){
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicate elements: ");

        for (int num : arr) {
            // If add() returns false, it means num is already in the set
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter size of an array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter " + (i + 1) + " element : ");
            arr[i] = input.nextInt();
        }

        duplicate(arr);
    }
}
