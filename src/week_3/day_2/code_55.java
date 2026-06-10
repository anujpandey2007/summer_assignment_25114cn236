package week_3.day_2;

public class code_55 {
    public int largest(int[] arr){
        if (arr.length < 2) {
            System.out.println("Array must have at least 2 elements.");
            return Integer.MIN_VALUE;
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            // Case 1: Current element is strictly greater than the largest found so far
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
            // i th  element is between largest and second largest
            else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];  // Update second largest
            }
        }

        return secondLargest;

    }
}
