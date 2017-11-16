package ifstatements.exercises;

import java.util.Scanner;

public class Ett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userNumber = new Scanner(System.in);

		System.out.println("Skriv ett nummer :");

		int tal = userNumber.nextInt();

		if (tal > 8 && tal < 10 || tal > 33) {
			System.out.println("Good");

		} else {
			System.out.println("Bad");
		}

	}

}
