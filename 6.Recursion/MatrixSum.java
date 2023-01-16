
import java.util.Scanner;

public class MatrixSum {

	static int calculateCol(int[][] matrix, int row, int col) {
		if (col >= matrix[row].length) {
			return 0;
		}

		return matrix[row][col] + calculateCol(matrix, row, col + 1);
	}

	static int calculateSum(int[][] matrix, int row) {
		if (row >= matrix.length) {
			return 0;
		}

		return calculateCol(matrix, row, 0) + calculateSum(matrix, row + 1);
	}

	static void display(int[][] matrix) {
		System.out.println("the matrix is");

		for (int i = 0; i < matrix.length; ++i) {
			for (int j = 0; j < matrix[0].length; ++j) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int nSize;
		System.out.print("Enter the size of the square matrix: ");
		nSize = input.nextInt();
		int[][] matrix = new int[nSize][nSize];

		System.out.println("Input the matrix");
		for (int i = 0; i < nSize; ++i) {
			for (int j = 0; j < nSize; ++j) {
				matrix[i][j] = input.nextInt();
			}
		}

		System.out.println();
		System.out.println("matrix sum is: " + calculateSum(matrix, 0));
	}
}