package ifstatements.exercises;

import java.util.Scanner;

public class Räknare {
	/**
	 * 6. Skapa en räknare som beräknar hur många timmar minuter och sekunder som en
	 * löpare springer. - Börja med att fråga om en starttid - Fråga om en sluttid -
	 * Skriv sedan ut hur mång timmar, minuter och sekunder som löparen har
	 * sprungit. # Men vad händer om löparen börjar springa vid klockan 23:59?
	 */

	public static void main(String[] args) {

		Scanner userStartTime = new Scanner(System.in);

		System.out.println("Välj en starttid :");

		int start = userStartTime.nextInt();

		Scanner userTime = new Scanner(System.in);

		System.out.println("Välj en sluttid :");

		int slut = userTime.nextInt();

		/**
		 * int sekunder = 1; int minuter = 1; minuter = sekunder + 59;
		 * 
		 * int timme = 1; timme = minuter + 59;
		 */

	}
}
