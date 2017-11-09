package ifstatements.exercises;

import java.util.Scanner;
/**
 * 2. Write Java program to allow the user to input his/her age. Then the
 * program will show if the person is eligible to vote. A person who is eligible
 * to vote must be older than or equal to 18 years old.
 * 
 * Output: Enter your age: 18 You are eligible to vote.
 */

public class Vote {
	public static void main(String[] args) {
		Scanner userAge = new Scanner(System.in);

		System.out.println("Hur gammal är du? ");

			int age = userAge.nextInt();
	

		if (age > 17) {
			System.out.println("Du får rösta");
		} else {
			System.out.println("Du får inte rösta");
		}

	}

}
