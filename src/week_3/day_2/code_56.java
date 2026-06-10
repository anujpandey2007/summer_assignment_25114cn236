package week_3.day_2;
import java.util.*;
public class code_56 {
    public void duplicate(int [] arr){
        HashSet<Integer> seen = new HashSet<>();
        System.out.print("Duplicate elements: ");

        for (int num : arr) {
            // If add() returns false, it means num is already in the set
            if (!seen.add(num)) {
                System.out.print(num + " ");
            }
        }
    }
   public void findDuplicate(int[] arr ){



    }
}
