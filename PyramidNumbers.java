//a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid
import java.util.Scanner;

public class PyramidNumbers {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner input = new Scanner(System.in);

		// Getting user input
		System.out.print("Enter the number of lines: ");
		int numberOfLines = input.nextInt();

		// Display pyramid 
		for (int rows = 1; rows <= numberOfLines; rows++) {
			// Create spaces in each row 
			for (int s = numberOfLines - rows; s >= 1; s--) {
				System.out.print("  ");
			}
			// Create decending numbers in each row B
			for (int l = rows; l >= 2; l--) {
				System.out.print(l + " ");
			}
			
			for (int r = 1; r <= rows; r++) {
				System.out.print(r + " ");
			}
			System.out.println();
		}
	}
}