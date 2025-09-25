package pastexam.codewriting;

public class Q12 {

	/*
	 * We wish to write a program that will compute 
	 * the sums of all columns of a given 2D array. 
	 * For example, if you were given:
	 * 
	 * 		1 2 3
	 * 		4 5 6
	 * 
	 * then your program should create an array that
	 * contains [5, 7, 9].
	 * 
	 * Complete the code below to compute the sum of the columns 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains. It is not necessary
	 * to print the result, creating the appropriate array is enough.
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} }; 
		int [] total = new int [data[0].length];

		for (int j = 0; j < data[0].length; j++) {
			for (int i = 0; i < data.length; i++) {
				System.out.print(data[i][j] + " ");
				total[j] = total[j] + data[i][j];
			}
		}
		System.out.println();
		System.out.print("[");
		for (int i = 0; i < total.length; i++) {
			if (i != total.length - 1) {	
				System.out.print(total[i] + ", ");
			}
			else {
				System.out.print(total[i] + "]");
			}
		}
	}
}
