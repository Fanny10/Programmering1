package exercises.oop;

import java.util.Scanner;

public class MainDate {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		Date date = new Date(scanner.nextInt(), 8, 1990);
		System.out.println(date.toString());
	}

}
