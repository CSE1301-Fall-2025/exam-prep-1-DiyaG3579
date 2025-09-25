package pastexam.codewriting;

import java.util.Scanner;

public class Q11 {

	/*
	 * We wish to write a simple guessing game. 
	 * First, ask the user to input an integer. 
	 * You can assume that the user will type in an 
	 * integer, you do not need to verify this.
	 * 
	 * Once the user has supplied a int, your 
	 * program should generate a single random 
	 * integer that is within 10 of the user 
	 * supplied value. For example, if the user 
	 * typed in 8, then your program should generate 
	 * a random integer between -2 (inclusive) and 18 
	 * (inclusive).
	 * 
	 * Once the random number has been generated, 
	 * print a message asking the user to guess a 
	 * number in the given range. Use scanner to get 
	 * guesses from the user, reprompting them as many 
	 * times as needed until they enter the value that 
	 * has been randomly chosen (you may again assume 
	 * that the user will enter an integer). Once the 
	 * value has been chosen, print out a message 
	 * indicating that the user has won the game. 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Select a Random Integer: ");
		int n = scan.nextInt();
		int rtop = n + 10; int rbottom = n - 10;
		int y = (int)(Math.random()*10 + rbottom);
		System.out.println("I have choosen an integer between: (" + rbottom + ", " + rtop + "). Try to guess it?" );
		int guess = scan.nextInt();
			while (guess != y) {
				System.out.println("Nice try, please guess again");
				guess = scan.nextInt();
			}
			System.out.println("Congratulations you got it!");
		scan.close();
	}
}
