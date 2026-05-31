package day_4;


    import java.util.Scanner;

    public class code_14 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the value of n: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Please enter a non-negative integer.");
            } else if (n == 0) {
                System.out.println("The 0th Fibonacci term is: 0");
            } else if (n == 1) {
                System.out.println("The 1st Fibonacci term is: 1");
            } else {
                long firstTerm = 0;
                long secondTerm = 1;
                long nthTerm = 0;

                for (int i = 2; i <= n; i++) {
                    nthTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nthTerm;
                }

                System.out.println("The " + n + "th Fibonacci term is: " + nthTerm);
            }

            scanner.close();
        }
    }

