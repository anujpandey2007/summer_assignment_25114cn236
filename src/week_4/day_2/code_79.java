package week_4.day_2;

import java.util.Scanner;

public class code_79 {

    public static void printRowSums(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // time complexity O(row x col)


        System.out.println("Row-wise Sum Results");
        // run row times
        for (int i = 0; i < rows; i++) {    //will run col times
            int rowSum = 0;

            for (int j = 0; j < cols; j++) {
                rowSum += matrix[i][j];
            }
            // will run row times to print row's sum

            System.out.println("Sum of Row " + i + " -> " + rowSum);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dimensions for the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Initialize and populate the matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("\n--- Enter elements for the Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Calculate and print row sums
        printRowSums(matrix);

        input.close();
    }
}