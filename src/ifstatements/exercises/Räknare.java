package ifstatements.exercises;

import java.util.Scanner;

public class R�knare {
	/**
	 * 6. Skapa en r�knare som ber�knar hur m�nga timmar minuter och sekunder som en
	 * l�pare springer. - B�rja med att fr�ga om en starttid - Fr�ga om en sluttid -
	 * Skriv sedan ut hur m�ng timmar, minuter och sekunder som l�paren har
	 * sprungit. # Men vad h�nder om l�paren b�rjar springa vid klockan 23:59?
	 */

	public static void main(String[] args) {

		Scanner userStartTime = new Scanner(System.in);

		System.out.println("V�lj en starttid :");

		int start = userStartTime.nextInt();

		Scanner userTime = new Scanner(System.in);

		System.out.println("V�lj en sluttid :");

		int slut = userTime.nextInt();

		/**
		 * int sekunder = 1; int minuter = 1; minuter = sekunder + 59;
		 * 
		 * int timme = 1; timme = minuter + 59;
		 */

	}
}
