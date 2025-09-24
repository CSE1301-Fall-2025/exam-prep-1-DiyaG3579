package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int area = 1;
		System.out.println("Welcome to the area calculator! We will keep calculating until the area is 0");
		while (area != 0) {
		System.out.println("Please tell us about the rectangle");
		System.out.println("What is the length of the rectangle");
		int length = scan.nextInt();
		System.out.println("What is the width of the rectangle");
		int width = scan.nextInt();
		area = length * width;
		System.out.println("The area is " + area);
		}
		System.out.println("Thank you for using the area calculator!");
		scan.close();
	}
}
