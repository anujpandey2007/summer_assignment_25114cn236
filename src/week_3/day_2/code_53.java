package week_3.day_2;

public class code_53 {
    public void linearSearch (int[] arr,int target ){
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                System.out.println("target found at "+ i + " index ");
                break;
            }

        }
        System.out.println("target not found in the array");

    }
}
