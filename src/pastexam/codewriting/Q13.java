package pastexam.codewriting;

import java.util.Scanner;

public class Q13 {

	/*
		We wish to write a program to help students learn multiplication. Code has been provided 
		that prompts the user to enter an integer value that they wish to practice multiplying.
		Your code should then prompt the user to enter the first 5 multiples of that value, in order. Example
		output might look like this:
		
		Which value would you like to practice multiplying?
		3
		Please enter the value of 3 * 1
		4
		Incorrect!
		Please enter the value of 3 * 1
		5
		Incorrect!
		Please enter the value of 3 * 1
		3
		Please enter the value of 3 * 2
		6
		Please enter the value of 3 * 3
		9
		Please enter the value of 3 * 4
		12
		Please enter the value of 3 * 5
		15
		Well done !
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Which value would you like to practice multiplying?");
		int m = scan.nextInt();
		int i = 1;
		while (i <= 5) {
			System.out.println("Please enter the value of " + m + " * " + i);
			int ans = scan.nextInt();
			if (m * i == ans) {
				i++;
			}
			else {
				System.out.println("Try Again");
			}
		}
		System.out.println("Good Job!");
		//your code here
		scan.close();
	}
}
