package week_3.day_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class code_62 {
    public static void maxFreq(int[] arr) {
        // Edge case: if the array is empty
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        // Step 1: Create a HashMap to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Step 2: Populate the map with counts
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 3: Traverse the map to find the element with the highest frequency
        int maxElement = arr[0];
        int maxCount = 0;

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxElement = entry.getKey();
            }
        }
        System.out.println("element which occured the most  : " + maxElement+ "and it   appeared " + maxCount + " times.");


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
        maxFreq(arr);
    }
}
