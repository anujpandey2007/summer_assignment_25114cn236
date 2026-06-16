package week_4.day_2;

import java.util.Arrays;
import java.util.Scanner;

public class code_77 {

    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int colsB = matrixB[0].length;

        // The product matrix will have dimensions: rowsA x colsB
        int[][] result = new int[rowsA][colsB];

        // Multiplying the two matrices
        // time complexity O(n3)
        for (int i = 0; i < rowsA; i++) {// Row of Matrix A
            for (int j = 0; j < colsB; j++) { // Column of Matrix B
                for (int k = 0; k < colsA; k++) { // Dot product calculation
                    result[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  dimensions for Matrix A
        System.out.print("Enter rows for Matrix A: ");
        int rowsA = input.nextInt();
        System.out.print("Enter columns for Matrix A: ");
        int colsA = input.nextInt();

        // dimensions for Matrix B
        System.out.print("Enter rows for Matrix B: ");
        int rowsB = input.nextInt();
        System.out.print("Enter columns for Matrix B: ");
        int colsB = input.nextInt();

        // Check if col of a should be equal to row of b only then multiplication is possible
        if (colsA != rowsB) {
            System.out.println("\nError: Matrix multiplication is not possible! " +
                    "Columns of A must equal Rows of B.");
            input.close();
            return;
        }

        // Initializing and filling Matrix A
        int[][] matrixA = new int[rowsA][colsA];
        System.out.println("\n--- Enter elements for Matrix A ---");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("Enter A[" + i + "][" + j + "]: ");
                matrixA[i][j] = input.nextInt();
            }
        }

        // Initializing and filling Matrix B
        int[][] matrixB = new int[rowsB][colsB];
        System.out.println("\n--- Enter elements for Matrix B ---");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("Enter B[" + i + "][" + j + "]: ");
                matrixB[i][j] = input.nextInt();
            }
        }

        // calling method
        int[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Display results
        System.out.println("\n--- Matrix A ---");
        System.out.println(Arrays.deepToString(matrixA));

        System.out.println("\n--- Matrix B ---");
        System.out.println(Arrays.deepToString(matrixB));

        System.out.println("\n--- Resultant Matrix (A x B) ---");
        System.out.println(Arrays.deepToString(resultMatrix));

        input.close();
    }
}