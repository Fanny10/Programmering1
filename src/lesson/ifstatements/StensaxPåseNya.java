package lesson.ifstatements;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class StensaxPåseNya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] options = { 1, 2, 3, 4, 5 };
		int n = (Integer) JOptionPane.showInputDialog(null, "Hur många spel vill du köra:", "Välj nummer",
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		System.out.println(n);

		int wins = 0;
		int loss = 0;
		int draw = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Game: " + (i + 1));

			String[] options1 = { "Sten", "Sax", "Påse" };
			ImageIcon icon = new ImageIcon("");
			String stenSaxPåse = (String) JOptionPane.showInputDialog(null, "Välj mellan", "Sten, Sax eller Påse",
					JOptionPane.QUESTION_MESSAGE, icon, options1, options1[2]);

			System.out.println(stenSaxPåse);

			Random randomGenerator = new Random();

			int stenSaxPåseValue = randomGenerator.nextInt(3);

			if (stenSaxPåseValue == 0) {
				JOptionPane.showMessageDialog(null, "Datorn valde - Sten");
			}
			if (stenSaxPåseValue == 1) {
				JOptionPane.showMessageDialog(null, "Datorn valde - Påse");
			}

			if (stenSaxPåseValue == 2) {
				JOptionPane.showMessageDialog(null, "Datorn valde - Sax");
			}
			if (stenSaxPåseValue == 0 && stenSaxPåse.equals("Påse")
					|| stenSaxPåseValue == 1 && stenSaxPåse.equals("Sax")
					|| stenSaxPåseValue == 2 && stenSaxPåse.equals("Sten")) {
				JOptionPane.showMessageDialog(null, "Du vann!");
				System.out.println("Du vann!");
				wins++;
			} else if (stenSaxPåseValue == 0 && stenSaxPåse.equals("Sten")
					|| stenSaxPåseValue == 1 && stenSaxPåse.equals("Påse")
					|| stenSaxPåseValue == 2 && stenSaxPåse.equals("Sax")) {
				JOptionPane.showMessageDialog(null, "Lika");
				draw++;
			} else {
				JOptionPane.showMessageDialog(null, "Du förlora!");
				loss++;
			}
			/*
			 * JOptionPane.showMessageDialog("Wins = " + wins); System.out.println("loss = "
			 * + loss); System.out.println("Draw = " + draw);
			 */
		}
	}

}
