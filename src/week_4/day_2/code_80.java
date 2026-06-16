package week_4.day_2;

import java.util.Scanner;

public class code_80 {

    public static void printColumnSums(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        // time complexity O(col x row )

        System.out.println("Column-wise Sum Results");
        // will run  column times
        for (int j = 0; j < cols; j++) {
            int colSum = 0; // Reset sum for the current column

            // Inner loop will run row time
            for (int i = 0; i < rows; i++) {
                colSum += matrix[i][j];
            }

            System.out.println("Sum of Column " + j + " -> " + colSum);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input dimensions of the matrix
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("\n--- Enter elements for the Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                matrix[i][j] = input.nextInt();
            }
        }
        printColumnSums(matrix);

        input.close();
    }
}