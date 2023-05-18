package LearningTestNg;

import java.util.Scanner;

public class EvenCellfrtwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of array");
		int row_size = sc.nextInt();
		System.out.println("Enter column of array");
	    int col_size = sc.nextInt();
	   
		int [][] array = new int[row_size][col_size];
		 int Total = row_size*col_size;
		 int sum=0;
		 System.out.println("Enter " + Total + " values of the array");
		 for(int i =0; i<row_size; i++) {
			 for(int j=0; j<col_size; j++) {
				 array[i][j]=sc.nextInt();
			 }
		 }
		 for(int i =0; i<row_size; i++) {
			 for(int j=0; j<col_size; j++) {
				if(i%2==0 && j%2==0) {
					sum=sum+array[i][j];
					
				}
			 }
		 }
		 for(int i =0; i<row_size; i++) {
			 for(int j=0; j<col_size; j++) {
				 System.out.print(array[i][j]+ " ");
			 }
			 System.out.println();
		 }
		 System.out.println(sum);
	}

}
