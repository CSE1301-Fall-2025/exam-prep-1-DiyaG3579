package pastexam.codewriting;

import java.util.Scanner;

public class Q09 {

	/*
	 * The code below asks the user 
	 * for two positive integers. Your task is 
	 * to generate quantity random integers between 
	 * 1 (inclusive) and 100 (inclusive). You should 
	 * then count the number of times that the random 
	 * values appear above the user supplied threshold. 
	 * Finally, you should print the total amount of 
	 * random values that were above the threshold as 
	 * well as the percentage of values that were above the threshold.
	 * 
	 * You can assume that the user will enter a positive 
	 * value for quantity (greater than 0). You can also
	 * assume that the user will enter a valid value for 
	 * the threshold (between 1 and 100, inclusive).
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive integer: ");
		int quantity = scan.nextInt();
		System.out.println("Enter a value between 1-100 (inclusive): ");
		int threshold = scan.nextInt();
		double count = 0.0;
		for (int i = 1; i <= quantity; i++) {
			int y = (int)(Math.random()*100 + 1);
			System.out.print(y + " ");
			if (y > threshold) {
				count++;
			}
		}
		System.out.println();
		System.out.println("Numbers above the threshold: " + count);
		double percentage = count/quantity;
		System.out.println("Percentage above the threshold: " + percentage);
		scan.close();
		
	}
}
