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
		// JOptionPane.showMessageDialog(null, "V�lkommen");
		// JOptionPane.showInputDialog(null, "V�nligen skriv in ditt spel namn", "Innan
		// vi startar", 2);

		String anv�ndarnamn = JOptionPane.showInputDialog(null, "V�nligen skriv in ditt spel namn", "Innan vi startar",
				1);

		while (true) {
			String jaEllerNej = JOptionPane.showInputDialog(null,
					"V�lkommen " + anv�ndarnamn + " �r du redo f�r att b�rja spelet? \n skriv ja ifall du �r redo");

			if (jaEllerNej.equalsIgnoreCase("ja")) {
				level1();
				break;
			} else {
				JOptionPane.showMessageDialog(null, "b�rja om");

			}

		}

	}

	public static void level1() {
		JOptionPane.showMessageDialog(null, "Level 1");

		Object[] options = new Object[] { "Tar en annan v�g", "L�sas som du inte ser och g�r f�rbi", "Hj�lper personen" };
		int val = JOptionPane.showOptionDialog(null,
				"Du �r p�v�g hem och du ser n�gon som beh�ver hj�lp " + " \n Vad g�r du?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		
		if (val == 0) {
			annanV�g();
		} else if (val == 1) {
			options = new Object[] { "Forts�tter g�", "S�ger till n�gon p� v�gen", "Hj�lper personen" };
			int person = JOptionPane.showOptionDialog(null,
					"Okej, du valde att inte se personen \n Men personen b�rjar prata med dig " + " \n Vad g�r du?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		} else {
			options = new Object[] { "Ta med personen", "Ring ambulansen", "Ring polisen" };
			
			int help = JOptionPane.showOptionDialog(null,
					"Okej, du valde att hj�lpa personen \n Personen �r sv�rt skadad, men har ocks� ett vapen "
							+ " \n Vad g�r du?",
					null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

		}
	
		if(enAnnan == 0) {
		Object[] options1 = { "Genom skogen", "Genom ett hus omr�de", "G�r tillbaka till v�gen bakom" };
		@SuppressWarnings("unused")
		int skog = JOptionPane.showOptionDialog(null, "Okej, du valde att g� igenom skogen /n Men du h�r konstiga ljud framf�r dig" + " \n Vad g�r du ?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options1, options1[2]);
		}
		*/
		// level2();
	}

	public static void annanV�g() {
		Object options = new Object[] { "Genom skogen", "Genom ett hus omr�de", "G�r tillbaka till v�gen bakom" };
		
		int enAnnan = JOptionPane.showOptionDialog(null, "Okej, du valde en annan v�g " + " \n Vilken?", null,
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

	}
	public static void g�F�rbi() {
		
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
