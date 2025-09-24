package pastexam.codewriting;

import java.util.Scanner;

public class Q14 {

	/*
	 * We wish to write a program that will create 
	 * mirrored arrays. For example, if you were given
	 * the following array:
	 * 
	 * 		1 2 3
	 * 
	 * then your program should create an array that
	 * contains [1, 2, 3, 3, 2, 1].
	 * 
	 * Complete the code below to compute the sum of the columns 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains. It is not necessary
	 * to print the result, creating the appropriate array is enough.
	 */
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some data
		//to make sure your solution
		//works properly.
		int[] data = {1, 2, 3}; 
		int [] mirror = new int [data.length * 2];
		for (int i = 0; i < data.length; i++) {
			mirror[i] = data[i];
		}
		int l = mirror.length - 1;
		int k = 0;
		mirror[l] = data[k];
		// for (int i = mirror.length - 1; i >= data.length; i--) {
		// 	for (int j = 0; j < 1; j++) {
		// 	mirror[i] = data[j];
		// 	}
		// }
		for (int i = 0; i < mirror.length; i++) {
			System.out.println(mirror[i]);
		}
	}
}
