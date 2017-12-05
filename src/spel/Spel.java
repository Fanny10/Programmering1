package spel;

import java.awt.Component;

import javax.swing.ImageIcon;
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

		while (true) {
			String jaEllerNej = JOptionPane.showInputDialog(null,
					"Välkommen " + användarnamn + " är du redo för att börja spelet? \n skriv ja ifall du är redo");

			if (jaEllerNej.equalsIgnoreCase("ja")) {
				level1();
				break;
			} else {
				JOptionPane.showMessageDialog(null, "börja om");

			}

		}

	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");

		Object[] options = new Object[] { "Tar en annan väg", "Låsas som du inte ser och går förbi", "Hjälper personen" };
		int val = JOptionPane.showOptionDialog(null,
				"Du är påväg hem och du ser någon som behöver hjälp " + " \n Vad gör du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		
		if (val == 0) {
			annanVäg();
		} else if (val == 1) {
			options = new Object[] { "Fortsätter gå", "Säger till någon på vägen", "Hjälper personen" };
			int person = JOptionPane.showOptionDialog(null,
					"Okej, du valde att inte se personen \n Men personen börjar prata med dig " + " \n Vad gör du?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		} else {
			options = new Object[] { "Ta med personen", "Ring ambulansen", "Ring polisen" };
			
			int help = JOptionPane.showOptionDialog(null,
					"Okej, du valde att hjälpa personen \n Personen är svårt skadad, men har också ett vapen "
							+ " \n Vad gör du?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		}
	
		if(enAnnan == 0) {
		Object[] options1 = { "Genom skogen", "Genom ett hus område", "Går tillbaka till vägen bakom" };
		@SuppressWarnings("unused")
		int skog = JOptionPane.showOptionDialog(null, "Okej, du valde att gå igenom skogen /n Men du hör konstiga ljud framför dig" + " \n Vad gör du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		}
		*/
		// level2();
	}

	public static void annanVäg() {
		Object options = new Object[] { "Genom skogen", "Genom ett hus område", "Går tillbaka till vägen bakom" };
		
		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan väg " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

	}
	public static void gåFörbi() {
		
	}
	
	
	
	public static void level2() {
		JOptionPane.showMessageDialog(null, "Level 2");

		level3();
	}

	public static void level3() {
		JOptionPane.showMessageDialog(null, "Level 3");

		level4();
	}

	public static void level4() {
		JOptionPane.showMessageDialog(null, "Level 4");

	}
}
