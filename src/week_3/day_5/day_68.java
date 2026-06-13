package week_3.day_5;

import java.lang.reflect.Array;
import java.security.PublicKey;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class day_68 {

    public static int[] commonElement(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        //updating arr1 and arr2 with smallest in size and largest inn size
        int[] smallestArray = (arr1.length < arr2.length) ? arr1 : arr2;
        int[] largestArray = (arr1.length < arr2.length) ? arr2 : arr1;

        // putting smallest array in hashmap first cause common smallest array can be subset of largest array
        for (int val : smallestArray) {
            frequencyMap.put(val, frequencyMap.getOrDefault(val, 0) + 1);
        }

        // temporary array to store common element
        int[] Common = new int[smallestArray.length];
        // Tracks number of element are common
        int count = 0;

        // checking the larger array is it available inside map or matches frequency
        for (int val : largestArray) {
            // If the key exists AND its available frequency is greater than 0
            if (frequencyMap.containsKey(val) && frequencyMap.get(val) > 0) {
                Common[count] = val;
                count++;
                // Decrement of  the frequency of key so we don't add it again and again
                frequencyMap.put(val, frequencyMap.get(val) - 1);
            }
        }

        // there is possiblty that array contain null element
        // because it is not necessay that all element of smallest array should be common
        return Arrays.copyOf(Common, count);
    }

        public static void main (String[]args){
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
            System.out.println("common of arr1 and arr2 : " + Arrays.toString(commonElement(arr1, arr2)));

        }
    }

