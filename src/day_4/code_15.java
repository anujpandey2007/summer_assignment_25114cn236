package day_4;


    import java.util.Scanner;

    public class code_15 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int originalNumber = input.nextInt();


            int temp = originalNumber;
            int digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

            temp = originalNumber;
            int sum = 0;
            while (temp > 0) {
                int remainder = temp % 10;
                sum += Math.pow(remainder, digits);
                temp /= 10;
            }

            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            } else {
                System.out.println(originalNumber + " is NOT an Armstrong number.");
            }

            input.close();
        }
    }

