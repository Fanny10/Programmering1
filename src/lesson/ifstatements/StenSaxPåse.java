package lesson.ifstatements;

import java.util.Random;

import java.util.Scanner;

public class StenSaxP�se {

	public static void main(String[] args) {

		// man f�r v�lja mellan Krona eller Klave
		Scanner usersGuess = new Scanner(System.in);

		System.out.println("Select Sten, Sax, P�se: ");

		String usersPick = usersGuess.nextLine().toLowerCase();

		// System.out.println(usersPick);

		// Datorn som slumpar
		Random randomGenerator = new Random();

		int stenSaxP�seValue = randomGenerator.nextInt(3);

		if (stenSaxP�seValue == 0) {
			System.out.println("Computer - Sten");
		}
		if (stenSaxP�seValue == 1) {
			System.out.println("Computer - P�se");
		}

		if (stenSaxP�seValue == 2) {
			System.out.println("Computer - Sax");
		}

		if (stenSaxP�seValue == 0 && usersPick.equals("p�se") || stenSaxP�seValue == 1 && usersPick.equals("sax")|| stenSaxP�seValue == 2 && usersPick.equals("sten")) {
			System.out.println("You won!");
		} else {
			System.out.println("You lost!");
		}

	}

}
