package pastexam.codewriting;

import java.util.Scanner;

public class Q01 {

	/*
	 * Linear algebra often uses �triangular� arrays. 
	 * An upper triangular array is a square 2D
	 * array with zero values below the diagonal 
	 * and non-zero values at and above it, like:
	 * 
	 *    1 1 1 1 1
	 *    0 1 1 1 1
	 *    0 0 1 1 1
	 *    0 0 0 1 1
	 *    0 0 0 0 1
	 *    
	 * Provide code that will create an n x n
	 * upper triangular array with all non-zero
	 * elements initialized to 1.0.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Array size: ");
		int n = scan.nextInt();
		int [][] triangle = new int [n][n];

		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[0].length; j++) {
				if (i == 0 || j >= i) {
					triangle[i][j] = 1;
				}
			}
		}
		for (int i = 0; i < triangle.length; i++) {
			for (int j = 0; j < triangle[0].length; j++) {
				if (i == 0) {
					System.out.print(triangle[i][j] + " ");
				}
				else if (j == 0) {
					System.out.println();
					System.out.print(triangle[i][j] + " ");
				}
				else {
					System.out.print(triangle[i][j] + " ");
				}
			}
		}
		//Yeah, I'm amazing let's go - easy dubs
		scan.close();
	}
}
