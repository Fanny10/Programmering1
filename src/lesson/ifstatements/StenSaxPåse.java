package lesson.ifstatements;

import java.util.Random;

import java.util.Scanner;

public class StenSaxPåse {

	public static void main(String[] args) {

		// man får välja mellan Sten, sax eller påse
		Scanner usersGuess = new Scanner(System.in);

		int wins = 0;
		int loss = 0;
		int draw = 0;

		int numberOfGames = 10;

		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));

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

			if (stenSaxPåseValue == 0 && usersPick.equals("påse") || stenSaxPåseValue == 1 && usersPick.equals("sax")
					|| stenSaxPåseValue == 2 && usersPick.equals("sten")) {
				System.out.println("You won!");
				wins++;
			} else if (stenSaxPåseValue == 0 && usersPick.equals("sten")
					|| stenSaxPåseValue == 1 && usersPick.equals("påse")
					|| stenSaxPåseValue == 2 && usersPick.equals("sax")) {
				System.out.println("Lika");
				draw++;
			} else {
				System.out.println("You lost!");
				loss++;

			}

			System.out.println("Wins = " + wins);
			System.out.println("loss = " + loss);
			System.out.println("Draw = " + draw);

		}

	}
}
