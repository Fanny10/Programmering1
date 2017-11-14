package lesson.ifstatements;

import java.util.Random;

import java.util.Scanner;

public class StenSaxP�se {

	public static void main(String[] args) {

		// man f�r v�lja mellan Sten, sax eller p�se
		Scanner userGuess = new Scanner(System.in);

		System.out.println("Hur m�nga spel? : ");

		Scanner usersGuess = new Scanner(System.in);

		int antalSpel = userGuess.nextInt();

		int wins = 0;
		int loss = 0;
		int draw = 0;

		int numberOfGames = antalSpel;

		for (int i = 0; i < numberOfGames; i++) {
			System.out.println("Game: " + (i + 1));

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

			if (stenSaxP�seValue == 0 && usersPick.equals("p�se") || stenSaxP�seValue == 1 && usersPick.equals("sax")
					|| stenSaxP�seValue == 2 && usersPick.equals("sten")) {
				System.out.println("Du vann!");
				wins++;
			} else if (stenSaxP�seValue == 0 && usersPick.equals("sten")
					|| stenSaxP�seValue == 1 && usersPick.equals("p�se")
					|| stenSaxP�seValue == 2 && usersPick.equals("sax")) {
				System.out.println("Lika");
				draw++;
			} else {
				System.out.println("Du f�rlora!");
				loss++;

			}

		}

		System.out.println("Wins = " + wins);
		System.out.println("loss = " + loss);
		System.out.println("Draw = " + draw);

	}
}
