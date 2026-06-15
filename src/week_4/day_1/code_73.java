package week_4.day_1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;
import java.util.Scanner;

public class code_73 {

    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
        int rowsA = matrixA.length;
        int colsA = matrixA[0].length;
        int rowsB = matrixB.length;
        int colsB = matrixB[0].length;

        // Initialize the result matrix
        int[][] result = new int[rowsA][colsA];

        //  loops to add elements
        for (int i = 0; i < rowsA; i++) { // Loop through rows
            for (int j = 0; j < colsA; j++) { // Loop through columns
                result[i][j] = matrixA[i][j] + matrixB[i][j];
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

        // 1. Initializing and filling  the FIRST matrix
        int[][] arr1 = new int[row][col];
        System.out.println("\n--- Enter elements for Matrix 1 ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                arr1[i][j] = input.nextInt(); // Added: Storing the user input
            }
        }

        // 1. Initializing and filling  the SECOND matrix
        int[][] arr2 = new int[row][col];
        System.out.println("\n--- Enter elements for Matrix 2 ---");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print("Enter (" + i + "," + j + ") element -> ");
                arr2[i][j] = input.nextInt(); // Added: Storing the user input
            }
        }
        int[][] resultMatrix = addMatrices(arr1, arr2);
        System.out.println("\nThe result of subtraction is:");

        System.out.println(Arrays.deepToString(resultMatrix));

        input.close();
    }
}