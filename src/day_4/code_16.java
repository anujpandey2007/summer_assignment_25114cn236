package day_4;

    import java.util.Scanner;

    public class code_16 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the starting number of the range: ");
            int start = input.nextInt();

            System.out.print("Enter the ending number of the range: ");
            int end = input.nextInt();

            System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

            for (int i = start; i <= end; i++) {
                int currentNumber = i;

                int temp = currentNumber;
                int digits = 0;
                while (temp > 0) {
                    digits++;
                    temp /= 10;
                }
                temp = currentNumber;
                int sum = 0;
                while (temp > 0) {
                    int remainder = temp % 10;
                    sum += Math.pow(remainder, digits);
                    temp /= 10;
                }
                if (sum == currentNumber) {
                    System.out.print(currentNumber + " ");
                }
            }
            System.out.println();

            input.close();
        }
    }

