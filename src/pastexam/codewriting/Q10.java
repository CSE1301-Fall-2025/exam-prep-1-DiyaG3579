package pastexam.codewriting;

import java.util.Scanner;

public class Q10 {

	/*
	 * We wish to write a program that will compute and 
	 * print the sum of both diagonals of a square 2D array. 
	 * For example, if you were given:
	 * 
	 * 		1 2 3
	 * 		4 5 6
	 * 		7 8 9
	 * 
	 * then your program should print 30 which is (1 + 5 + 9) + (3 + 5 + 7).
	 * 
	 * Complete the code below to compute the sum of the diagonals 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains, though you may assume 
	 * that the given array will always besquare (number of rows 
	 * is equal to number of columns).
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
		int total = 0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[0].length; j++) {
				if (i == j) {
					total = total + data[i][j];
				}

			}
		}
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if (i == data.length - 1 && j == 0) {
					System.out.print(data[i][j] + " ");
				}
			}
		}
		System.out.println();
		System.out.println(total);
	}
}
