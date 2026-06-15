package week_4.day_1;

import java.util.Scanner;

public class code_76 {
    public static int diagonalSum(int[][] matrix) {
        int n = matrix.length; // Since it's a square matrix, rows == cols == n
        int primarySum = 0;
        for (int i = 0; i < n; i++) {
            primarySum += matrix[i][i];

        }
        return primarySum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // MATRIX  SHOULD BE SQUARE MATRIX

        System.out.print("Enter the size of the square matrix (e.g., 3 for 3x3): ");
        int n = input.nextInt();

        // Initialize and populate the square matrix
        int[][] arr = new int[n][n];
        System.out.println("\n--- Enter elements for the Matrix ---");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                arr[i][j] = input.nextInt();
            }
        }
        System.out.println("sum of diagonal of entered matrix "+diagonalSum(arr));

        input.close();
    }
}