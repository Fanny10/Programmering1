package spel;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Spel {

	public static void main(String[] args) {
		start();

	}

	public static void start() {
		// JOptionPane.showMessageDialog(null, "V�lkommen");
		// JOptionPane.showInputDialog(null, "V�nligen skriv in ditt spel namn", "Innan
		// vi startar", 2);

		String anv�ndarnamn = JOptionPane.showInputDialog(null, "V�nligen skriv in ditt spel namn", "Innan vi startar",
				1);

		// while (true) {
		String jaEllerNej = JOptionPane.showInputDialog(null,
				"V�lkommen " + anv�ndarnamn + " �r du redo f�r att b�rja spelet?");

		if (jaEllerNej.equalsIgnoreCase("ja")) {
			level1();

		} else {
			JOptionPane.showMessageDialog(null, "b�rja om");
		}
	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");
		level2();
	}

	public static void level2() {
		JOptionPane.showMessageDialog(null, "V�lkommen");

	}

}
