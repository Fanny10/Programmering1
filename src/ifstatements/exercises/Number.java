package ifstatements.exercises;

import java.util.Random;

public class Number {
	/**
	 * 
	 * 1. Prompt the user for a number and print good if the number is between 8 &
	 * 10 or greater than 33. Otherwise, print bad. Use the || operator in your if
	 * statement.
	 */
	public static void main(String[] args) {

		Random randomGenerator = new Random();
		int computer = 0;
		int user = 0;
		int user2 = 0;

		for (int i = 0; i < 10; i++) {
			int userPick = randomGenerator.nextInt(13);
			System.out.println("User 1 = " + userPick);
			int userPick2 = randomGenerator.nextInt(13);
			System.out.println("User 2 = " + userPick2);
			int computerPick = randomGenerator.nextInt(13);
			System.out.println("Datorn = " + computerPick);

			if (userPick == computerPick && userPick2 == computerPick) {
				System.out.println("Lika");

			} else if (userPick > computerPick && userPick > userPick2) {
				System.out.println("User1 vann");
				user = user + 2;
			} else if (userPick2 > computerPick && userPick2 > userPick) {
				System.out.println("User2 vann");
				user2 = user2 + 2;
			} else if (computerPick > userPick && computerPick > userPick2) {
				System.out.println("Datorn vann");
				computer = computer + 2;
			} else if (computerPick == userPick && computerPick > userPick2) {
				computer++;
				user++;

			} else if (computerPick == userPick2 && computerPick > userPick) {
				computer++;
				user2++;
			} else if (userPick == userPick2 && computerPick < userPick) {
				user2++;
				user++;
			}
			System.out.println();
		}
		if (computer > user && computer > user2) {
			System.out.println("Computer = " + computer);
			if (user > user2) {
				System.out.println("User1 = " + user);
				System.out.println("User2 = " + user2);
			} else {
				System.out.println("User2 = " + user2);
				System.out.println("User1 = " + user);
			}
		} else if (user > computer && user > user2) {
			System.out.println("User1 = " + user);
			if (computer > user2) {
				System.out.println("Computer = " + computer);
				System.out.println("User2 = " + user2);
			} else {
				System.out.println("User2 = " + user2);
				System.out.println("Computer = " + computer);
			}

		} else if (user2 > computer && user2 > user) {
			System.out.println("User2 = " + user2);
			if (computer > user) {
				System.out.println("Computer = " + computer);
				System.out.println("User1 = " + user);

			} else {
				System.out.println("User1 = " + user);
				System.out.println("Computer = " + computer);
			}

		}
	}
}
