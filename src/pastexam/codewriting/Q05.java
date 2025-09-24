package pastexam.codewriting;

import java.util.Scanner;

public class Q05 {
	/*
	 * Implement the following formula using n: 
	 * 1 - (1/2) + (1/3) - (1/4) ... (1/n)
	 * 
	 * Print the result that you have computed (for example, the result for
	 * n = 2 is 0.5).
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a value for n: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				System.out.print(i + " - ");
			}
			else if (i != n && i % 2 == 0) {
				System.out.print("(1/" + i + ") + " );
			}
			else if (i != n && i % 2 != 0) {
				System.out.print("(1/" + i + ") - " );
			}
			else {
				System.out.print("(1/" + i + ")");
			}
		}
		System.out.println();
		double result = 1.0/n;
		System.out.println("Your result of 1/" + n + " is equal to " + result);
		scan.close();
	}
}
