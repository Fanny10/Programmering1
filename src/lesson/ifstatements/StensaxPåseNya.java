package lesson.ifstatements;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StensaxP�seNya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] options = { 1, 2, 3, 4, 5 };
		int n = (Integer) JOptionPane.showInputDialog(null, "Hur m�nga spel vill du k�ra:", "V�lj nummer",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		System.out.println(n);

		int wins = 0;
		int loss = 0;
		int draw = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Game: " + (i + 1));

			String[] options1 = { "Sten", "Sax", "P�se" };
			ImageIcon icon = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Stensaxpase.jpg");
			String stenSaxP�se = (String) JOptionPane.showInputDialog(null, "V�lj mellan", "Sten, Sax eller P�se",
					JOptionPane.QUESTION_MESSAGE, icon, options1, options1[2]);

			System.out.println(stenSaxP�se);

			Random randomGenerator = new Random();

			int stenSaxP�seValue = randomGenerator.nextInt(3);

			if (stenSaxP�seValue == 0) {
				JOptionPane.showMessageDialog(null, "Datorn valde - Sten");
			}
			if (stenSaxP�seValue == 1) {
				JOptionPane.showMessageDialog(null, "Datorn valde - P�se");
			}

			if (stenSaxP�seValue == 2) {
				JOptionPane.showMessageDialog(null, "Datorn valde - Sax");
			}
			if (stenSaxP�seValue == 0 && stenSaxP�se.equals("P�se")
					|| stenSaxP�seValue == 1 && stenSaxP�se.equals("Sax")
					|| stenSaxP�seValue == 2 && stenSaxP�se.equals("Sten")) {
				JOptionPane.showMessageDialog(null, "Du vann!");
				System.out.println("Du vann!");
				wins++;
			} else if (stenSaxP�seValue == 0 && stenSaxP�se.equals("Sten")
					|| stenSaxP�seValue == 1 && stenSaxP�se.equals("P�se")
					|| stenSaxP�seValue == 2 && stenSaxP�se.equals("Sax")) {
				JOptionPane.showMessageDialog(null, "Lika");
				draw++;
			} else {
				JOptionPane.showMessageDialog(null, "Du f�rlora!");
				loss++;
			}
		}
		ImageIcon icon1 = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Stensaxpase.jpg");
		ImageIcon icon2 = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Stensaxpase.jpg");
		ImageIcon icon3 = new ImageIcon("C:/Users/Fanny.Lindqvist/Desktop/Stensaxpase.jpg");

		if (wins > loss && wins > draw) {
			JOptionPane.showMessageDialog(null, "Du vann allt", null, null, -1, icon3);
		} else if (loss > draw && wins < loss) {
			JOptionPane.showMessageDialog(null, "Du f�rlora mest", null, null, -1, icon2);
		} else {
			JOptionPane.showMessageDialog(null, "De blir mest lika", null, null, -1, icon1);
		}

	}

}
