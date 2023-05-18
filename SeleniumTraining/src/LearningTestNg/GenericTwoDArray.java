package LearningTestNg;

import java.util.Scanner;

public class GenericTwoDArray {

	public static void main(String[] args) {

		int row_size = 0;
		int col_size = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of array");
		row_size = sc.nextInt();
		System.out.println("Enter column of array");
		col_size = sc.nextInt();
		String[][] arr = new String[row_size][col_size];

		System.out.println("Enter" + row_size * col_size + "String values for array");
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
		int var = 0;
		System.out.println("===========================");
		for (int i = 0; i < row_size; i++) {
			// iterates row
			for (int j = 0; j < col_size; j++) {
				// iterates column
				if (i != 0 & j != 0 && i % 2 == 0 && j % 2 == 0 && i == j) {
					System.out.print(arr[i][j] + " ");
					var += Integer.parseInt(arr[i][j]);
				}

			}
			System.out.println();
		}
		System.out.println("Sum is:" + var);
	}

}
