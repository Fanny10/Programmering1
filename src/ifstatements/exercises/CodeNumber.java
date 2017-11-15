package ifstatements.exercises;

import java.util.Scanner;

/*Write a Java program to determine whether an input number is an even number.
* Represent it with code:
*/

public class CodeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userGuess = new Scanner(System.in);
		System.out.println("Välj ett tal :");

		int tal = userGuess.nextInt();

		if (tal % 2 == 1) {
			System.out.println("Udda");

		} else {
			System.out.println("Jämna");
		}

	}

}
