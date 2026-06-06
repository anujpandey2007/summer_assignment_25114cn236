package week_1.day_5;
import java.util.Scanner;
public class code_19 {
    public static void main(String[] args) {
        // facctor of an given number
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = input.nextInt();

            System.out.print("Factors of " + number + " are: ");

            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + " ");
                }
            }

            input.close();
    }
}
