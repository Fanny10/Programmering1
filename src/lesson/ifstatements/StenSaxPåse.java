package lesson.ifstatements;

import java.util.Random;

import java.util.Scanner;

public class StenSaxPåse {

	public static void main(String[] args) {

		// man får välja mellan Krona eller Klave
		Scanner usersGuess = new Scanner(System.in);

		System.out.println("Select Sten, Sax, Påse: ");

		String usersPick = usersGuess.nextLine().toLowerCase();

		// System.out.println(usersPick);

		// Datorn som slumpar
		Random randomGenerator = new Random();

		int stenSaxPåseValue = randomGenerator.nextInt(3);

		if (stenSaxPåseValue == 0) {
			System.out.println("Computer - Sten");
		}
		if (stenSaxPåseValue == 1) {
			System.out.println("Computer - Påse");
		}

		if (stenSaxPåseValue == 2) {
			System.out.println("Computer - Sax");
		}

		if (stenSaxPåseValue == 0 && usersPick.equals("påse") || stenSaxPåseValue == 1 && usersPick.equals("sax")|| stenSaxPåseValue == 2 && usersPick.equals("sten")) {
			System.out.println("You won!");
		} else {
			System.out.println("You lost!");
		}

	}

}
