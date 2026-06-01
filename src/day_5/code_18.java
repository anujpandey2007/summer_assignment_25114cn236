package day_5;
import java.util.Scanner;
public class code_18 {
    public static void main(String[] args) {
        //strong number
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int originalNumber = input.nextInt();

            int temp = originalNumber;
            int Sum = 0;

            // getting last digit by reminder method
            while (temp > 0) {
                int digit = temp % 10;

                // finding factorial of the digits
                int factorial = 1;
                for (int i = 1; i <= digit; i++) {
                    factorial *= i;
                }

                Sum += factorial; // Adding factorial to the total sum
                temp = temp / 10;
            }

            // Check if the total sum matches the original number
            if (Sum == originalNumber && originalNumber > 0) {
                System.out.println(originalNumber + " is a Strong Number.");
            } else {
                System.out.println(originalNumber + " is NOT a Strong Number.");
            }

            input.close();
    }
}
