package LearningTestNg;

import java.util.Scanner;

public class LearingTwoDimensional {

	public static void main(String[] args) {
		int row_size = 3;
		int col_size = 4;

		String[][] arr = new String[row_size][col_size];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 12 String values for 3*4 array");
		for (int i = 0; i < row_size; i++) {
			// iterates row
			for (int j = 0; j < col_size; j++) {
				// iterates col
				arr[i][j] = sc.next();
			}
		}
		for (int i = 0; i < row_size; i++) {
			// iterates row
			for (int j = 0; j < col_size; j++) {
				// iterates column
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}

}
