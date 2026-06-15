package week_4.day_1;

import java.util.Arrays;
import java.util.Scanner;

public class code_75 {

    // Method to transpose a matrix
    public static int[][] transposeMatrix(int[][] matrix) {
        int originalRows = matrix.length;
        int originalCols = matrix[0].length;

        // Rows into columns, and columns into  rows
        int[][] result = new int[originalCols][originalRows];

        // Loops to transpose elements
        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter number of columns: ");
        int col = input.nextInt();

        // Initialize and populate the matrix
        int[][] arr1 = new int[row][col];
        System.out.println(" Enter elements for the Matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                arr1[i][j] = input.nextInt();
            }
        }

        // Call the transpose method TO STORE TRANSPOSE INTO RESULT MATRIX
        int[][] resultMatrix = transposeMatrix(arr1);

        System.out.println("The transposed matrix is:");
        System.out.println(Arrays.deepToString(resultMatrix));

        input.close();
    }
}