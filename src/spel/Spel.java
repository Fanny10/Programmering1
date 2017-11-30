package spel;

import javax.swing.JOptionPane;

import com.sun.xml.internal.ws.api.config.management.policy.ManagementAssertion.Setting;

public class Spel {

	public static void main(String[] args) {
		start();

	}

	public static void start() {
		// JOptionPane.showMessageDialog(null, "Välkommen");
		// JOptionPane.showInputDialog(null, "Vänligen skriv in ditt spel namn", "Innan
		// vi startar", 2);

		String användarnamn = JOptionPane.showInputDialog(null, "Vänligen skriv in ditt spel namn", "Innan vi startar",
				1);

		// while (true) {
		String jaEllerNej = JOptionPane.showInputDialog(null,
				"Välkommen " + användarnamn + " är du redo för att börja spelet?");

		if (jaEllerNej.equalsIgnoreCase("ja")) {
			level1();

		} else {
			JOptionPane.showMessageDialog(null, "börja om");
		}
	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");
		level2();
	}

	public static void level2() {
		JOptionPane.showMessageDialog(null, "Välkommen");

	}

}
