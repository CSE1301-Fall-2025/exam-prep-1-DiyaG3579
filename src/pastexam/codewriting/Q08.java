package pastexam.codewriting;

public class Q08 {

	/*
	 * We wish to write a program that will transpose a 2D array. 
	 * Transposition occurs by making the rows of an array 
	 * become the columns and vice versa. For example:
	 *
	 *	1 2 3
	 *	4 5 6
 	 *
	 *	transposes to
	 *
	 *	1 4
	 *	2 5
	 *	3 6
	 *
	 * Complete the code below to transpose the given 
	 * array. You should create a new array 
	 * of the appropriate size and then fill it with 
	 * the appropriate values. Your code should work regardless 
	 * of the size of this array or the values that it contains.
	 */
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3, 8}, {4, 5, 6, 7}, {7, 8, 9, 10} }; 
		
		int [][] dataT = new int [data[0].length][data.length];
		for (int i = 0; i < data.length;i++) {
			for (int j = 0; j < data[0].length; j++) {
				dataT [j][i] = data[i][j];
			}
		}
		for (int i = 0; i < dataT.length;i++) {
			for (int j = 0; j < dataT[0].length; j++) {
				if (i == 0) {
					System.out.print(dataT[i][j] + " ");
				}
				else if (i != 0 && j == 0) {
					System.out.println();
					System.out.print(dataT[i][j]);
				}
				else {
					System.out.print(" " + dataT[i][j]);
				}
			}
		}
	}
}
