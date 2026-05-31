package day_4;


    import java.util.Scanner;

    public class code_13 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of terms for the Fibonacci series: ");
            int terms = input.nextInt();


            if (terms <= 0) {
                System.out.println("enter a positive integer greater than 0.");
            } else {
                System.out.println("Fibonacci Series up to " + terms + " terms:");

                long firstTerm = 0;
                long secondTerm = 1;

                for (int i = 1; i <= terms; i++) {
                    System.out.print(firstTerm + " ");

                    long nextTerm = firstTerm + secondTerm;
                    firstTerm = secondTerm;
                    secondTerm = nextTerm;
                }

            }

            input.close();
        }
    }

