package week_3.day_2;

public class code_54 {
    public int findFrequency(int[] arr, int target) {
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

}
