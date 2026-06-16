package week_4.day_2;

import java.util.Scanner;

public class code_78 {

    public static boolean isSymmetric(int[][] matrix) {
        int n = matrix.length;
// if found any mismatch it will return false otherwise true
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (rows/cols): ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = input.nextInt();

        // Step 1: Verification Guard
        if (rows != cols) {
            System.out.println("\nThe matrix is NOT symmetric because it is not a square matrix.");
            input.close();
            return;
        }

        int[][] matrix = new int[rows][cols];
        System.out.println("\n--- Enter elements for the Matrix ---");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                matrix[i][j] = input.nextInt();
            }
        }


        if (isSymmetric(matrix)) {
            System.out.println("\nThe entered matrix is a SYMMETRIC matrix.");
        } else {
            System.out.println("\nThe entered matrix is NOT a symmetric matrix.");
        }

        input.close();
    }
}