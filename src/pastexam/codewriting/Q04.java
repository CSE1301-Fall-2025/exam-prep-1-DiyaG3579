package pastexam.codewriting;

import java.util.Scanner;

public class Q04 {

	/*
	 * You are given a two dimensional array of integers called data. 
	 * Choose integers at random from data and store them in 
	 * a one dimensional array of size N called points. 
	 * Each value from data should have an equal chance of being 
	 * selected and a particular value could be randomly selected more
	 * than once (in probability and statistics it�s considered 
	 * a uniform random sample with replacement).
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3}, {4, 5, 6},{7, 8, 9}}; 
		System.out.println("How many random points would you like?");
		int n = scan.nextInt();
		int[] points = new int[n];

		for (int i = 0; i < n; i++) {
			int yrows = (int)(Math.random()*data.length);
			int ycol = (int)(Math.random()*data[0].length);
			points[i] = data[yrows][ycol];
		}
		for (int i = 0; i < points.length; i++) {
			System.out.print(points[i] + " ");
		}
		
		scan.close();
		//Bam look at that - even closed the scanner and everything
	}
}
