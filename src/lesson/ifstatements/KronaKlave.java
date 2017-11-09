package lesson.ifstatements;

import java.util.Random;

import java.util.Scanner;

public class KronaKlave {

	public static void main(String[] args) {

		// man får välja mellan Krona eller Klave
		Scanner usersGuess = new Scanner(System.in);

		int wins = 0;
		int loss = 0;

		int numberOfGames = 20;

		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));

			System.out.println("Select Krona or Klave: ");

			String usersPick = usersGuess.nextLine().toLowerCase();

			// System.out.println(usersPick);

			// Datorn som slumpar
			Random randomGenerator = new Random();

			boolean coinFlippValue = randomGenerator.nextBoolean();

			if (coinFlippValue == true) {
				System.out.println("Computer - Krona");
			} else {
				System.out.println("Computer - Klave");
			}

			if (coinFlippValue == true && usersPick.equals("krona")
					|| coinFlippValue == false && usersPick.equals("klave")) {

				System.out.println("You won!");
				wins++;
			} else {
				System.out.println("You lost!");
				loss++;
			}

			System.out.println("Wins = " + wins);
			System.out.println("loss = " + loss);

		}
	}
}
