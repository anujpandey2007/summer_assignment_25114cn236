package week_2.day_4;
import java.util.*;

 public class code_37  {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("enter number");
         int rows = input.nextInt();

         for (int i = 1; i <= rows; i++) {
             // outer loop is printing space
             for (int j = 1; j <= rows - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= (2 * i - 1); k++) { // inner loop is printing pattern
                 System.out.print("*");
             }
             System.out.println(); // new line
         }
     }
}
